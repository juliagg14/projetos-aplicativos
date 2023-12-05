package devandroidjulia.applistaaluno.DataBase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

import devandroidjulia.applistaaluno.model.Combustivel;

public class GasEtaDB extends SQLiteOpenHelper {

    private static final  String DB_NAME = "gaseta_db";

    private static final int DB_VERSION = 1;

    Cursor cursor;
    SQLiteDatabase db;

    public GasEtaDB( Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        db = getWritableDatabase();
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

       String sqlTabela = "CREATE TABLE combustivel (id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nomeCombustivel TEXT," +
                "precoCombustivel REAL," +
                "recomendacao TEXT)";

       db.execSQL(sqlTabela);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void salvarTabela(String tabela, ContentValues dados){

        db.insert(tabela, null, dados);

    }

    public List<Combustivel> ListarDados() {
        List<Combustivel> list = new ArrayList<>();
        Combustivel Registro;

        String querySql = "SELECT * FROM Combustivel";

        cursor = db.rawQuery(querySql, null);

        if (cursor.moveToFirst()) {
            do {
                Registro = new Combustivel();
                Registro.setId(cursor.getInt(0));
                Registro.setNomeCombustivel(cursor.getString(1));
                Registro.setPrecoCombustivel(cursor.getDouble(2));
                Registro.setRecomendacao(cursor.getString(3));
                list.add(Registro);

            } while (cursor.moveToNext());
        } else {}
        return list;
    }
};

