package views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.gerenciadordesenha.R;

import model.Gerenciador;

public class MainActivity extends AppCompatActivity {

    Gerenciador senha1;
    Gerenciador senha2;


    EditText DigiteSenha;
    EditText ConfirmarSenha;

    Button Enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        senha1 = new Gerenciador();

        senha1.setDigiteSenha("algumasenha");

        senha1.setConfirmarSenha("algumasenha");

        DigiteSenha = findViewById(R.id.DigiteSenha);
        ConfirmarSenha = findViewById(R.id.ConfirmarSenha);
        Enviar = findViewById(R.id.Enviar);

        DigiteSenha.setText(senha1.getDigiteSenha());
        ConfirmarSenha.setText(senha1.getConfirmarSenha());

        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                senha1.setDigiteSenha(DigiteSenha.getText().toString());
                senha1.setConfirmarSenha(ConfirmarSenha.getText().toString());
                Toast.makeText( MainActivity.this ,  "Dados Salvos", Toast.LENGTH_LONG).show();
            }
        });
    }
}