package com.example.colecaoapp.Views;

import static android.graphics.Color.parseColor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.colecaoapp.Controller.MusicController;
import com.example.colecaoapp.Model.Music;
import com.example.colecaoapp.R;

import java.util.ArrayList;
import java.util.List;

public class FavoritosActivity extends AppCompatActivity {

    private MusicController musicControl;



    List<String> GenereList;
    List<Music> listMusic;
    TableLayout idTable;
    Spinner spinner;

    Music music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);


        musicControl = new MusicController(this);
        listMusic = musicControl.getDataList();
        music = new Music();


        spinner = findViewById(R.id.Spinner);
        idTable = findViewById(R.id.MusicList);

        GenereList = musicControl.getDataGenre();



        if(GenereList != null &&! GenereList.contains(null)) {

            ArrayAdapter<String> adapter = new ArrayAdapter<>
                    (this, android.R.layout.simple_spinner_item, GenereList);

            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinner.setAdapter(adapter);



        }else{

            Toast.makeText(this,"Não foi possivel carregar a ista de gêneros.", Toast.LENGTH_SHORT).show();
        }



        for (Music music : listMusic){

            TableRow tableRow = new TableRow(this);

            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(
                    0,
                    TableRow.LayoutParams.MATCH_PARENT,
                    30f
            );
            layoutParams.setMargins(10, 10, 5, 10);
            layoutParams.width = 600;
            EditText editText = new EditText(this);
            editText.setText(music.getMusic());
            editText.setTextSize(18);
            editText.setBackgroundResource(R.drawable.border);
            editText.setLayoutParams(layoutParams);
            editText.setGravity(Gravity.CENTER);

            TableRow.LayoutParams buttonLayoutParams = new TableRow.LayoutParams(
                    0,
                    TableRow.LayoutParams.WRAP_CONTENT,
                    20f
            );

            buttonLayoutParams.setMargins(0, 0, 5, 0);


            buttonLayoutParams.width = 150;
            Button BtnDel = new Button(this);
            BtnDel.setText("\uD83D\uDDD1️");
            BtnDel.setTextSize(18);
            BtnDel.setTextColor(Color.parseColor("#00BCD4"));
            BtnDel.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));
            BtnDel.setLayoutParams(buttonLayoutParams);




            Button BtnEdit = new Button(this);
            BtnEdit.setText("✏️");
            BtnEdit.setTextSize(18);
            BtnEdit.setTextColor(Color.parseColor("#00BCD4"));
            BtnDel.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#000000")));
            BtnEdit.setLayoutParams(buttonLayoutParams);




            tableRow.addView(editText);
            tableRow.addView(BtnDel);
            tableRow.addView(BtnEdit);

            BtnDel.setTag(music.getId());
            BtnEdit.setTag(music.getId());

            idTable.addView(tableRow);


            BtnDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int musicId = (int) view.getTag();
                    idTable.removeView(tableRow);

                    musicControl.excluirMusic(musicId);
                }
            });

            BtnEdit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int musicId = (int)view.getTag();
                    String newText = editText.getText().toString();

                    Music updateMusic = new Music();


                    updateMusic.setId(musicId);
                    updateMusic.setMusic(newText);

                    musicControl.atualizarMusic(updateMusic);
                }
            });



    }





}}