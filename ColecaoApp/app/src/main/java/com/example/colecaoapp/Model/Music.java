package com.example.colecaoapp.Model;

public class Music {

    private int id;
    private String Music;
    private String Genere;

    public String getMusic() {
        return Music;
    }

    public void setMusic(String music) {
        this.Music = music;
    }

    public String getGenere() {
        return Genere;
    }

    public void setGenere(String genere) {
        this.Genere = genere;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
