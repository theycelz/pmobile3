package devandroid.eos.mob2.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import devandroid.eos.mob2.entidades.Tipo;

@Dao
public interface TipoDao {


    @Query("SELECT * FROM Tipo WHERE cursoId = :id LIMIT 1")
    Tipo getMarca(int id);

    @Query("SELECT * FROM Tipo")
    List<Tipo> getAll();

    @Insert
    void insertAll(Tipo... tipos);

    @Insert
    void salva(Tipo tipo);

    @Update
    default void update(Tipo tipo) {

    }

    @Delete
    void delete(Tipo tipo);


}

