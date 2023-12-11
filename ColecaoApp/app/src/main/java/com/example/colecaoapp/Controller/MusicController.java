package com.example.colecaoapp.Controller;

import android.content.ContentValues;

import com.example.colecaoapp.DataBase.CollectionDB;
import com.example.colecaoapp.Model.Music;
import com.example.colecaoapp.Views.FavoritosActivity;
import com.example.colecaoapp.Views.MainActivity;

import java.util.List;

public class MusicController extends CollectionDB {
    public MusicController(MainActivity mainActivity) {
        super(mainActivity);
    }

    public MusicController (FavoritosActivity favoritosActivity){
        super(favoritosActivity);
    }
    public void AddMusic (Music music){
        ContentValues data = new ContentValues();

        data.put("nameMusic", music.getMusic());
        data.put("nameGenre", music.getGenere());

        SaveMusic("collection", data);


    }

    public List<Music> getDataList() {
        return dataList();

    }
    public void excluirMusic(int musicId) {
        delMusic(musicId);
    }
}
