package devandroidjulia.applistaaluno.model;

public class Posto {

   public String CursoDesejado;

   public Posto(String CursoDesejado){
       this.CursoDesejado = CursoDesejado;

   }

    public String getCursoDesejado() {
        return CursoDesejado;
    }

    public void setCursoDesejado(String cursoDesejado) {
        CursoDesejado = cursoDesejado;
    }
}
