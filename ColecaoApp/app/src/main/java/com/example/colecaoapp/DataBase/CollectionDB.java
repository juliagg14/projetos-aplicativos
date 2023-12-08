package com.example.colecaoapp.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.colecaoapp.Model.Music;

import java.util.ArrayList;
import java.util.List;

public class CollectionDB extends SQLiteOpenHelper {

    private static final String DB_NAME = "musicDB";
    private static final int DB_Version = 1;

    Cursor cursor;

    SQLiteDatabase db;

    public CollectionDB(Context context){
        super(context, DB_NAME, null, DB_Version);

        db = getWritableDatabase();


    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String sqlTable = "CREATE TABLE collection(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
        "nameMusic TEXT, " +
        "nameGenre TEXT)";

        db.execSQL(sqlTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void SaveMusic(String table, ContentValues data){

        db.insert(table, null, data);

    }

    public List<Music> dataList(){

        List<Music> list = new ArrayList<>();

        Music register;

        String querySql = "SELECT * FROM collection";

        cursor = db.rawQuery(querySql, null);

        if(cursor.moveToFirst()){
            do{
                register = new Music();

                register.setId(cursor.getInt(0));
                register.setMusic(cursor.getString(1));
                register.setGenere(cursor.getString(2));
            }while (cursor.moveToNext());

        }else{}
        return list;
    }

}
