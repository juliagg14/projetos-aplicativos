package views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import devandroidjulia.appjogodaforca.R;

import controller.Jogocontroller;
import model.Palavras;

public class MainActivity extends AppCompatActivity {

    Jogocontroller controller;

    Palavras letra;

    EditText Campo1;
    EditText Campo2;
    EditText Campo3;
    EditText Campo4;
    EditText Campo5;

    Button BtnLimpar;
    Button BtnVerificar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new Jogocontroller(MainActivity.this);
        controller.toString();

        letra = new Palavras();

        controller.buscar(letra);


        Campo1 = findViewById(R.id.Campo1);
        Campo2 = findViewById(R.id.Campo2);
        Campo3 = findViewById(R.id.Campo3);
        Campo4 = findViewById(R.id.Campo4);
        Campo5 = findViewById(R.id.Campo5);

        BtnLimpar = findViewById(R.id.BtnLimpar);
        BtnVerificar = findViewById(R.id.BtnVerificar);


        Campo1.setText(letra.getCampo1());
        Campo2.setText(letra.getCampo2());
        Campo3.setText(letra.getCampo3());
        Campo4.setText(letra.getCampo4());
        Campo5.setText(letra.getCampo5());

        BtnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Campo1.setText("");
                Campo2.setText("");
                Campo3.setText("");
                Campo4.setText("");
                Campo5.setText("");

                controller.limpar();
            }
        });

        BtnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                letra.setCampo1(Campo1.getText().toString());
                letra.setCampo2(Campo1.getText().toString());
                letra.setCampo3(Campo1.getText().toString());
                letra.setCampo4(Campo1.getText().toString());
                letra.setCampo5(Campo1.getText().toString());
                Toast.makeText(MainActivity.this,"Verificando...", Toast.LENGTH_LONG).show();

                controller.Verificar(letra);

            }
        });
    }
}