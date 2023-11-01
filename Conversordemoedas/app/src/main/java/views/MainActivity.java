package views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.conversordemoedas.R;

import model.Conversor;

public class MainActivity extends AppCompatActivity {

    Conversor converter;

    EditText Digite;
    Button BtnClear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        converter = new Conversor();
        converter.setDigite("22,33");

        Digite = findViewById(R.id.Digite);
        BtnClear = findViewById(R.id.BtnClear);

        Digite.setText(converter.getDigite());

        BtnClear.setOnClickListener(view -> Digite.setText(""));


    }
}