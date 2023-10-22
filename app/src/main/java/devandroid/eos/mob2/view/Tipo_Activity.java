package devandroid.eos.mob2.view;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import devandroid.eos.mob2.R;
import com.google.android.material.textfield.TextInputEditText;
import devandroid.eos.mob2.databinding.ActivityTipoBinding;
import devandroid.eos.mob2.bancodedados.PatrimonioDatabase;
import devandroid.eos.mob2.entidades.Tipo;

public class Tipo_Activity extends AppCompatActivity {


    Tipo tipo = new Tipo();
    Button btn_salvar, btn_voltar;

    private ActivityTipoBinding binding;

    TextInputEditText input_nomeCurso, input_cargaHorariaCurso;
    private PatrimonioDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tipo);

        binding = ActivityTipoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        db = PatrimonioDatabase.getDataBase(getApplicationContext());
        btn_salvar = findViewById(R.id.btn_salvarCurso);
        btn_voltar = findViewById(R.id.buttonVoltarC);

        input_nomeCurso = findViewById(R.id.input_nomeCurso);
        input_cargaHorariaCurso = findViewById(R.id.input_cargaHorariaCurso);
        tipo.setNomeCurso(input_nomeCurso.getText().toString());
        tipo.setQtdHoras(Integer.parseInt(input_cargaHorariaCurso.getText().toString()));




        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.tipoDao().salva(tipo);
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