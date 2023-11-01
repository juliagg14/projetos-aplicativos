package views;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import model.Palavras;

public class MainActivity extends AppCompatActivity {

    Palavras letra;

    EditText Campo1;
    EditText Campo2;
    EditText Campo3;
    EditText Campo4;
    EditText Campo5;

    Button BtnLimpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        letra = new Palavras();

        letra.setCampo1("J");
        letra.setCampo2("U");
        letra.setCampo3("L");
        letra.setCampo4("I");
        letra.setCampo5("A");


        Campo1 = findViewById(R.id.Campo1);
        Campo2 = findViewById(R.id.Campo2);
        Campo3 = findViewById(R.id.Campo3);
        Campo4 = findViewById(R.id.Campo4);
        Campo5 = findViewById(R.id.Campo5);

        BtnLimpar = findViewById(R.id.BtnLimpar);


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
            }
        });
    }
}