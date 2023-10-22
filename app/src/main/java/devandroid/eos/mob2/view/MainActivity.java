package devandroid.eos.mob2.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import devandroid.eos.mob2.R;

public class MainActivity extends AppCompatActivity {

    private Button btnObjeto, btnTipo, btn_view_aluno, btn_view_curso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnObjeto = findViewById(R.id.btn_crud_aluno);
        btnTipo = findViewById(R.id.btn_crud_curso);
        btn_view_aluno = findViewById(R.id.btn_view_aluno);
        btn_view_curso = findViewById(R.id.btn_view_curso);

        btnObjeto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(getApplicationContext(), Objeto_Activity.class);
                startActivity(intentA);
            }
        });

        btnTipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(getApplicationContext(), Tipo_Activity.class);
                startActivity(intentA);
            }
        });

        btn_view_aluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(getApplicationContext(), ListaObjeto_Activity.class);
                startActivity(intentA);
            }
        });

        btn_view_curso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentA = new Intent(getApplicationContext(), ListaTipo_Activity.class);
                startActivity(intentA);
            }
        });
    }
}