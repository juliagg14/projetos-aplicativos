package Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.calculadorasimples.R;

import model.Numeros;

public class MainActivity extends AppCompatActivity {

     Numeros numero;

     Button Botao1;
     Button Botao2;
     Button Botao3;
     Button Botao4;
     Button Botao5;
     Button Botao6;
     Button Botao7;
     Button Botao8;
     Button Botao9;
     Button Botao0;
     Button BotaoMais;
     Button BotaoMenos;
     Button BotaoX;
     Button BotaoDivisao;
     Button BotaoIgual;
     Button BotaoClear;

     EditText DigiteOsNumeros;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero = new Numeros();

        numero.setDigiteOsNumeros("2548");

        DigiteOsNumeros = findViewById(R.id.DigiteOsNumeros);

        BotaoClear = findViewById(R.id.BotaoClear);
        Botao0 = findViewById(R.id.Botao0);
        Botao1 = findViewById(R.id.Botao1);
        Botao2 = findViewById(R.id.Botao2);
        Botao3 = findViewById(R.id.Botao3);
        Botao4 = findViewById(R.id.Botao4);
        Botao5 = findViewById(R.id.Botao5);
        Botao6 = findViewById(R.id.Botao6);
        Botao7 = findViewById(R.id.Botao7);
        Botao8 = findViewById(R.id.Botao8);
        Botao9 = findViewById(R.id.Botao9);

        DigiteOsNumeros.setText(numero.getDigiteOsNumeros());

        BotaoClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DigiteOsNumeros.setText("");


        Botao0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("0"));

                Botao1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("1"));
                    }
                });

                Botao2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("2"));
                    }
                });
                Botao3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("3"));
                    }
                });

                Botao4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("4"));
                    }
                });

                Botao5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("5"));
                    }
                });
                Botao6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("6"));
                    }
                });

                Botao7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("7"));
                    }
                });

                Botao8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("8"));
                    }
                });
                Botao9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        DigiteOsNumeros.setText(DigiteOsNumeros.getText().append("9"));
                    }
                });


            }
        });
            }});}}





