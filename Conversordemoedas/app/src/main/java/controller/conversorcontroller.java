package controller;

import android.content.SharedPreferences;
import android.util.Log;

import androidx.annotation.NonNull;

import model.Conversor;
import views.MainActivity;

public class Conversorcontroller {
    SharedPreferences preferences;
    SharedPreferences.Editor Conversor;
    public static final String NUM_PREFERENCES = "pref_conversor";
    public Conversorcontroller(MainActivity mainActivity) {

        preferences = mainActivity.getSharedPreferences(NUM_PREFERENCES , 0);
        Conversor = preferences.edit();
    }

    @NonNull
    @Override
    public String toString() {
        Log.d("MVC_Controller", "Controller Iniciado");
        return super.toString();
    }

    public void buscar(Conversor converter) {

    }

    public void Clear() {
        Conversor.clear();
        Conversor.apply();


    }}

