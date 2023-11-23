package devandroidjulia.applistaaluno.controller;

import java.util.ArrayList;
import java.util.List;

import devandroidjulia.applistaaluno.model.Posto;

public class PostoController {

    public List listaCurso;

    public List getListaCurso(){

        listaCurso = new ArrayList<Posto>();


        listaCurso.add(new Posto("Selecionar curso"));
        listaCurso.add(new Posto("Java"));
        listaCurso.add(new Posto("Kotlin"));
        listaCurso.add(new Posto("React Native"));

        return listaCurso;
    }
    public ArrayList<String> dataSpinner(){
        ArrayList<String> data = new ArrayList<>();
        for (int i = 0; i < getListaCurso().size(); i++) {
            Posto objeto = (Posto) getListaCurso().get(i);

            data.add(objeto.getCursoDesejado());


        }
        return data;
    }
}
