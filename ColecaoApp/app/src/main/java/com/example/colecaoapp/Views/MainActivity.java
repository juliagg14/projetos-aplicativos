package com.example.colecaoapp.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;

import com.example.colecaoapp.Controller.MusicController;
import com.example.colecaoapp.Model.Music;
import com.example.colecaoapp.R;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    MusicController musicController;
    List<Music> listMusic;

    Music music;
    Button BtnAdd;
    Button BtnOpen;

    EditText Song;
    EditText Genere;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        musicController = new MusicController(MainActivity.this);
        listMusic = musicController.getDataList();
        music = new Music();


        BtnAdd = findViewById(R.id.add);
        BtnOpen = findViewById(R.id.open);
        Song = findViewById(R.id.song);
        Genere = findViewById(R.id.genere);


        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                music.setMusic(Song.getText().toString());
                music.setGenere(Genere.getText().toString());

                musicController.AddMusic(music);

            }
        });

        BtnOpen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent TelaFavoritos = new Intent(MainActivity.this, FavoritosActivity.class);
                startActivity(TelaFavoritos);
                finish();
            }
        });






   }
}