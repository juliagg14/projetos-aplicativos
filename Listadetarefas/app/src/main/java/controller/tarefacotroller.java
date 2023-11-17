package controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import model.Tarefas;
import views.MainActivity;

public class Tarefacotroller {

    SharedPreferences preferences;
    SharedPreferences.Editor listaTarefas;
    public static final String NEW_PREFERENCES = "Pref_Tarefa";
    public Tarefacotroller(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(NEW_PREFERENCES, 0);
        listaTarefas = preferences.edit();

    }


    @NonNull
    @Override

    public String toString(){
        Log.d("MVC_Controller", "Controller Iniciado");
        return super.toString();
    }
    public void buscar(Tarefas novatarefa) {
    }

    public void limpar() {
        listaTarefas.clear();
        listaTarefas.apply();

    }

    public void adicionar(Tarefas novatarefa) {
        listaTarefas.putString("AdicionarTarefa", novatarefa.getAdicionarTarefas());
        listaTarefas.apply();
        Log.d("MVC_Controller", "Tarefa Adicionada" + toString());
    }
}
