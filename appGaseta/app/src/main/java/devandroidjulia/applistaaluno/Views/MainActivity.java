package devandroidjulia.applistaaluno.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import devandroidjulia.applistaaluno.R;
import devandroidjulia.applistaaluno.controller.CombustivelController;
import devandroidjulia.applistaaluno.controller.PostoController;
import devandroidjulia.applistaaluno.model.Combustivel;
import devandroidjulia.applistaaluno.model.Posto;
import  devandroidjulia.applistaaluno.util.UtilGasEta;

public class MainActivity extends AppCompatActivity {


    List<Combustivel> data;

    CombustivelController controller;
    Combustivel combustivelGasolina;
    Combustivel combustivelEtanol;
    Combustivel combustivel;


    PostoController postoController;


    EditText Gasolina;
    EditText Etanol;
    TextView resultado;


    Button btnlimpar;
    Button BtnCalcular;
    Button btnsalvar;
    Button btnfinalizar;

    String Recomendacao;
    Double precoGasolina;
    Double precoEtanol;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        controller = new CombustivelController(MainActivity.this);
       data = controller.getDataList();


        controller.toString();




        Gasolina = findViewById(R.id.Gasolina);
        Etanol = findViewById(R.id.Etanol);
        resultado = findViewById(R.id.resultado);


        BtnCalcular = findViewById(R.id.btnCalcular);
        btnlimpar = findViewById(R.id.btnlimpar);
        btnsalvar = findViewById(R.id.btnsalvar);
        btnfinalizar = findViewById(R.id.btnfinalizar);


      ;


        BtnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isDadosOK = true;

                if(TextUtils.isEmpty(Etanol.getText())){
                    Etanol.setError("obrigatorio");
                    Etanol.requestFocus();
                    isDadosOK = false;
                }
                if (TextUtils.isEmpty(Gasolina.getText())){
                    Gasolina.setError("obrigatorio");
                    Gasolina.requestFocus();
                    isDadosOK = false;
                }
                if (isDadosOK){
                    precoGasolina = Double.parseDouble(Gasolina.getText().toString());
                    precoEtanol = Double.parseDouble(Etanol.getText().toString());
                    Recomendacao = UtilGasEta.CalucularMelhorOpcao(precoGasolina,precoEtanol);
                    resultado.setText(Recomendacao);

                    btnsalvar.setEnabled(true);

                }
                else {
                    Toast.makeText(MainActivity.this, "preencha os campos obrigatorios", Toast.LENGTH_SHORT).show();

                    btnsalvar.setEnabled(false);
                }
            }
        });



        btnlimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Gasolina.setText("");
                Etanol.setText("");
                resultado.setText("Resultado");

                btnsalvar.setEnabled(false);

                controller.limpar();



            }});
        btnfinalizar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Toast.makeText(MainActivity.this,"Aplicativo Finalizado", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        btnsalvar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){

                combustivelEtanol = new Combustivel();
                combustivelGasolina = new Combustivel();

                combustivelGasolina.setNomeCombustivel("Gasolina");
                combustivelGasolina.setPrecoCombustivel(precoGasolina);

                combustivelEtanol.setNomeCombustivel("Etanol");
                combustivelEtanol.setPrecoCombustivel(precoEtanol);

                combustivelGasolina.setRecomendacao(UtilGasEta.CalucularMelhorOpcao(precoGasolina,precoEtanol));
                combustivelEtanol.setRecomendacao(UtilGasEta.CalucularMelhorOpcao(precoGasolina, precoEtanol));

                controller.salvar(combustivelGasolina);
                controller.salvar(combustivelEtanol);


                Toast.makeText(MainActivity.this,"Dados Salvos", Toast.LENGTH_LONG).show();



            }});





    }


            }

