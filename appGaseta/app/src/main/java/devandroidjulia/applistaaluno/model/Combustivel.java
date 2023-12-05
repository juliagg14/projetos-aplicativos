package devandroidjulia.applistaaluno.model;

public class Combustivel {

    private String NomeCombustivel;
    private double PrecoCombustivel;
    private String Recomendacao;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeCombustivel() {
        return NomeCombustivel;
    }

    public void setNomeCombustivel(String nomeCombustivel) {
        this.NomeCombustivel = nomeCombustivel;
    }

    public double getPrecoCombustivel() {
        return PrecoCombustivel;
    }

    public void setPrecoCombustivel(double precoCombustivel) {
       this.PrecoCombustivel = precoCombustivel;
    }

    public String getRecomendacao() {
        return Recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.Recomendacao = recomendacao;
    }

}

