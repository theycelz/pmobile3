package devandroid.eos.mob2.entidades;

import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;

@Entity(foreignKeys = @ForeignKey(entity = Tipo.class,
        parentColumns = "cursoId", childColumns = "cursoId",
        onDelete = ForeignKey.CASCADE))
public class Objeto {

    @PrimaryKey(autoGenerate = true)
    public int alunoId;

    public int cursoId;
    public String nomeAluno;
    public String emailAluno;

    public String telefoneAluno;


    public Objeto(){}

    public Objeto(int alunoId, int cursoId, String nomeAluno, String emailAluno, String telefoneAluno) {
        this.alunoId = alunoId;
        this.cursoId = cursoId;
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
        this.telefoneAluno = telefoneAluno;
    }

    public int getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(int alunoId) {
        this.alunoId = alunoId;
    }

    public int getCursiId() {
        return cursoId;
    }

    public void setCursiId(int cursiId) {
        this.cursoId = cursiId;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    @Override
    public String toString() {
        return getNomeAluno() + " " + getAlunoId();
    }
}
