package devandroid.eos.mob2.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import devandroid.eos.mob2.entidades.Objeto;

@Dao
public interface ObjetoDao {

    @Query("SELECT * FROM Objeto WHERE alunoId = :id LIMIT 1")
    Objeto getMarca(int id);

    ///obter todos os alunos da tabela em forma de lista
    @Query("SELECT * FROM Objeto")
    List<Objeto> getAll();

    @Insert
    void insertAll(Objeto... objetos);


    @Insert
    void salva(Objeto objeto);

    @Update
    void update(Objeto objeto);

    @Delete
    void delete(Objeto objeto);


}
