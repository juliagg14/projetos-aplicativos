package com.example.colecaoapp.Views;

import static android.graphics.Color.parseColor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import com.example.colecaoapp.Controller.MusicController;
import com.example.colecaoapp.Model.Music;
import com.example.colecaoapp.R;

import java.util.List;

public class FavoritosActivity extends AppCompatActivity {

    private MusicController musicControl;

    List<Music> listMusic;
    TableLayout idTable;

    Music music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);


        musicControl = new MusicController(this);
        listMusic = musicControl.getDataList();
        music = new Music();


        idTable = findViewById(R.id.MusicList);




        for (Music music : listMusic){

            TableRow tableRow = new TableRow(this);

            TextView textView = new TextView(this);
            textView.setText(music.getMusic());
            textView.setTextSize(18);
            textView.setBackgroundResource(R.drawable.border);

            Button BtnDel = new Button(this);
            BtnDel.setText("X");
            BtnDel.setTextSize(18);
            BtnDel.setTextColor(Color.parseColor("#CCCCCC"));
            BtnDel.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#AA0C00")));

            Button BtnDetail = new Button(this);
            BtnDetail.setText("+");
            BtnDetail.setTextSize(18);
            BtnDetail.setTextColor(Color.parseColor("CCCCCC"));


            tableRow.addView(textView);
            tableRow.addView(BtnDel);
            tableRow.addView(BtnDetail);

            idTable.addView(tableRow);


            BtnDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int musicId = (int) view.getTag();
                    idTable.removeView(tableRow);

                    musicControl.excluirMusic(musicId);
                }
            });





        }

    }



}