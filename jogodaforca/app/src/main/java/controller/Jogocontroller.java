package controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import model.Palavras;
import views.MainActivity;

public class Jogocontroller {

    SharedPreferences preferences;
    SharedPreferences.Editor JogoForca;
    public static final String NEW_PREFERENCES = "pref_Jogo";
    public Jogocontroller(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(NEW_PREFERENCES , 0);
        JogoForca = preferences.edit();

    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller Iniciado");
        return super.toString();

    }


    public Palavras buscar(Palavras letra) {
        letra.setCampo1(preferences.getString("letra1", "N"));
        letra.setCampo2(preferences.getString("letra2", "N"));
        letra.setCampo3(preferences.getString("letra3", "N"));
        letra.setCampo4(preferences.getString("letra4", "N"));
        letra.setCampo5(preferences.getString("letra5", "N"));
        return letra;

    }

    public void limpar() {
        JogoForca.clear();
        JogoForca.apply();


    }

    public void Verificar(Palavras letra) {

        JogoForca.putString("letra1", letra.getCampo1());
        JogoForca.putString("letra2", letra.getCampo2());
        JogoForca.putString("letra3", letra.getCampo3());
        JogoForca.putString("letra4", letra.getCampo4());
        JogoForca.putString("letra5", letra.getCampo5());
        JogoForca.apply();

        Log.d("MVC_Controller", "verificando" + toString());

    }
}
