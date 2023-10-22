package devandroid.eos.mob2.view;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import devandroid.eos.mob2.R;
import devandroid.eos.mob2.bancodedados.PatrimonioDatabase;
import devandroid.eos.mob2.entidades.Tipo;


public class ListaTipo_Activity extends AppCompatActivity {


    private PatrimonioDatabase db;
    Button btnVoltar;
    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_tipo);
        db = PatrimonioDatabase.getDataBase(getApplicationContext());
        List<Tipo> tipos = db.tipoDao().getAll();
        ArrayAdapter<Tipo> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item, tipos);

        spinner = findViewById(R.id.spinnerCurso);
        spinner.setAdapter(adapter);

        btnVoltar = findViewById(R.id.btnVoltarLC);

        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}