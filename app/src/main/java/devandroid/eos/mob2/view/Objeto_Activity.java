package devandroid.eos.mob2.view;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import devandroid.eos.mob2.R;
import devandroid.eos.mob2.bancodedados.PatrimonioDatabase;
import devandroid.eos.mob2.databinding.ActivityObjetoBinding;
import devandroid.eos.mob2.entidades.Objeto;


public class Objeto_Activity extends AppCompatActivity {

    Objeto objeto = new Objeto();
    Button btn_salvar, btn_excluir, btn_voltar;

    private PatrimonioDatabase db;
    TextInputEditText input_nomeAluno, input_emailAluno, input_telefoneAluno;
    private ActivityObjetoBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objeto);

        binding = ActivityObjetoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        db = PatrimonioDatabase.getDataBase(getApplicationContext());
        input_nomeAluno = findViewById(R.id.input_nomeAluno);
        input_emailAluno = findViewById(R.id.input_emailAluno);
        input_telefoneAluno = findViewById(R.id.input_telefoneAluno);
        btn_salvar = findViewById(R.id.btn_salvar);
        btn_excluir = findViewById(R.id.btn_excluir);
        btn_voltar = findViewById(R.id.btn_home);



        objeto.setTelefoneAluno(input_telefoneAluno.getText().toString());
        objeto.setNomeAluno(input_nomeAluno.getText().toString());
        objeto.setEmailAluno(input_emailAluno.getText().toString());
        objeto.setCursiId(1906);


        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.objetoDao().salva(objeto);
                Toast.makeText(getApplicationContext(), "Dados Salvos com Sucesso", Toast.LENGTH_LONG).show();
            }
        });

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}