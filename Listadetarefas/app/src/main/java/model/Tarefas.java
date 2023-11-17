package model;

public class Tarefas {

  private String AdicionarTarefas;

    public Tarefas(){}

    public String getAdicionarTarefas() {
        return AdicionarTarefas;
    }

    public void setAdicionarTarefas(String adicionarTarefas) {
        AdicionarTarefas = adicionarTarefas;
    }

    @Override
    public String toString() {
        return "Tarefas{" +
                "AdicionarTarefas='" + AdicionarTarefas + '\'' +
                '}';
    }
}
