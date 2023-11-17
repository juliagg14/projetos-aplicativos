package views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.conversordemoedas.R;

import controller.Conversorcontroller;
import model.Conversor;

public class MainActivity extends AppCompatActivity {

    Conversorcontroller controller;

    Conversor converter;

    EditText Digite;
    Button BtnClear;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controller = new Conversorcontroller(MainActivity.this);
        controller.toString();

        converter = new Conversor();

        controller.buscar(converter);

        Digite = findViewById(R.id.Digite);
        BtnClear = findViewById(R.id.BtnClear);

        Digite.setText(converter.getDigite());

        BtnClear.setOnClickListener(view -> Digite.setText(""));
        controller.Clear();


    }
}