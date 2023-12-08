package com.example.colecaoapp.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.colecaoapp.DataBase.CollectionDB;
import com.example.colecaoapp.R;

import java.util.Collection;

public class SplashActivity extends AppCompatActivity {

    public static final int TIME_OUT_SPLASH = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        TelaSplash();

    }

    private void TelaSplash() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                CollectionDB db = new CollectionDB(SplashActivity.this);

                Intent TelaPrincipal = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(TelaPrincipal);
                finish();
            }
        },TIME_OUT_SPLASH);
    }
}