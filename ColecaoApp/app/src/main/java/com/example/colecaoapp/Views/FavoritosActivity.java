package com.example.colecaoapp.Views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.colecaoapp.Controller.MusicController;
import com.example.colecaoapp.Model.Music;
import com.example.colecaoapp.R;

import java.util.List;

public class FavoritosActivity extends AppCompatActivity {

    MusicController musicControl;
    List<Music> listMusic;

    Music music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);


        musicControl = new MusicController(FavoritosActivity.this);
        listMusic = musicControl.getDataList();
        music = new Music();

        for (Music music : listMusic){


        }
    }


}