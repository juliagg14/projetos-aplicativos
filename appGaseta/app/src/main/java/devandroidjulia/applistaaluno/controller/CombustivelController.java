package devandroidjulia.applistaaluno.controller;

import android.content.ContentValues;
import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;


import java.util.List;

import devandroidjulia.applistaaluno.DataBase.GasEtaDB;
import devandroidjulia.applistaaluno.Views.MainActivity;
import devandroidjulia.applistaaluno.model.Combustivel;

public class CombustivelController extends GasEtaDB {

    SharedPreferences preferences;
    static SharedPreferences.Editor listaPosto;
    public static final String NOME_PREFERENCES = "Pref_Lista";

    public CombustivelController(MainActivity mainActivity) {
        super(mainActivity);

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES, 0);
        listaPosto = preferences.edit();
    }


    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller Iniciado");
        return super.toString();

    }


    public static void limpar() {

        listaPosto.clear();
        listaPosto.apply();
    }


    public void salvar(Combustivel combustivel) {

        ContentValues dados = new ContentValues();

        listaPosto.putString("Combustivel: ", combustivel.getNomeCombustivel());
        listaPosto.putFloat("precoCombustivel: ", (float) combustivel.getPrecoCombustivel());
        listaPosto.putString("recomendacao: ", combustivel.getRecomendacao());
        listaPosto.apply();

        dados.put("nomeCombustivel", combustivel.getNomeCombustivel());
        dados.put("precoCombustivel", combustivel.getPrecoCombustivel());
        dados.put("recomendacao", combustivel.getRecomendacao());

        salvarTabela("combustivel", dados);


        Log.d("MVC_Controller", "Dados Salvos" + toString());
    }
    public List<Combustivel> getDataList(){
        return ListarDados();
}
}