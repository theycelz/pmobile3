package devandroid.eos.mob2.bancodedados;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import devandroid.eos.mob2.dao.ObjetoDao;
import devandroid.eos.mob2.dao.TipoDao;
import devandroid.eos.mob2.entidades.Objeto;
import devandroid.eos.mob2.entidades.Tipo;

@Database(entities = {Objeto.class, Tipo.class}, version = 1)
public abstract class PatrimonioDatabase extends RoomDatabase {
    private static PatrimonioDatabase INSTANCE;

    public static PatrimonioDatabase getDataBase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            PatrimonioDatabase.class,
                            "Controle de Patrimonio").allowMainThreadQueries()
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }

    public abstract ObjetoDao objetoDao();

    public abstract TipoDao tipoDao();


}
