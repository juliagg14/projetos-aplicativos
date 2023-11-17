package views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.listadetarefas.R;

import controller.Tarefacotroller;
import model.Tarefas;

public class MainActivity extends AppCompatActivity {

    Tarefacotroller controller;

    Tarefas Novatarefa;

    Button Finalizar;
    Button BtnLimpar;
    Button BtnAdicionar;
    EditText AdicionarTarefas;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Novatarefa = new Tarefas();
        controller = new Tarefacotroller(MainActivity.this);
        controller.toString();

        controller.buscar(Novatarefa);


        AdicionarTarefas = findViewById(R.id.AdicionarTarefa);

        BtnAdicionar = findViewById(R.id.BtnAdicionar);
        BtnLimpar = findViewById(R.id.BtnLimpar);
        Finalizar = findViewById(R.id.Finalizar);


        AdicionarTarefas.setText(Novatarefa.getAdicionarTarefas());


        Finalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText( MainActivity.this, "Aplicativo Finalizado", Toast.LENGTH_LONG).show();
                finish();
            }

        });
        BtnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Novatarefa.setAdicionarTarefas(AdicionarTarefas.getText().toString());
                Toast.makeText(MainActivity.this,"Tarefa Adicionada", Toast.LENGTH_LONG).show();
                controller.adicionar(Novatarefa);
            }
        });

        BtnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AdicionarTarefas.setText("");
                controller.limpar();


            }
        });


    }
}