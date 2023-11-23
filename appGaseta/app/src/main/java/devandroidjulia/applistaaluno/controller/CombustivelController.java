package devandroidjulia.applistaaluno.controller;

import android.content.SharedPreferences;
import android.util.Log;
import android.widget.EditText;

import androidx.annotation.NonNull;

import devandroidjulia.applistaaluno.Views.MainActivity;
import devandroidjulia.applistaaluno.model.Combustivel;

public class CombustivelController {

    SharedPreferences preferences;
    static SharedPreferences.Editor listaPosto;
    public static final String NOME_PREFERENCES = "Pref_Lista";
    public CombustivelController(MainActivity mainActivity){

        preferences = mainActivity.getSharedPreferences(NOME_PREFERENCES , 0);
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

        listaPosto.putString("Combustivel: ", combustivel.getNomeCombustivel());
        listaPosto.putFloat("precoCombustivel: ", (float) combustivel.getPrecoCombustivel());
        listaPosto.putString("recomendacao: ", combustivel.getRecomendacao());
        listaPosto.apply();

        Log.d("MVC_Controller", "Dados Salvos" + toString());
    }



    public Combustivel buscar(Combustivel combustivel) {
        return combustivel;
    }
}