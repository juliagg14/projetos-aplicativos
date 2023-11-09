package controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import model.Gerenciador;
import views.MainActivity;

public class Gerenciarcontroller {

    SharedPreferences preferences;
    SharedPreferences.Editor lista_senhas;
    public static final String NEW_PREFERENCES = "senha_lista";
    public Gerenciarcontroller (MainActivity mainActivity){

        preferences = mainActivity.getSharedPreferences(NEW_PREFERENCES , 0);
        lista_senhas = preferences.edit();


    }


    @NonNull
    @Override

    public String toString(){
        Log.d("MVC_Controller", "Contrller Iniciado");
        return super.toString();
    }

    public void buscar(Gerenciador senha1) {

    }

    public void enviar(Gerenciador senha1) {
        lista_senhas.putString("Senha1", senha1.getDigiteSenha());
        lista_senhas.putString("senha2", senha1.getConfirmarSenha());
        lista_senhas.apply();

        Log.d("MVC_Controller", "Senha Salva" + toString());


    }
}



