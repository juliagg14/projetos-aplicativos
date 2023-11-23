package devandroidjulia.applistaaluno.model;

public class Combustivel {

    private String NomeCombustivel;
    private Double PrecoCombustivel;
    private String Recomendacao;

    public String getNomeCombustivel() {
        return NomeCombustivel;
    }

    public void setNomeCombustivel(String nomeCombustivel) {
        this.NomeCombustivel = nomeCombustivel;
    }

    public double getPrecoCombustivel() {
        return PrecoCombustivel;
    }


    public void setPrecoCombustivel(Double precoCombustivel) {
        this.PrecoCombustivel = precoCombustivel;
    }

    public String getRecomendacao() {
        return Recomendacao;
    }

    public void setRecomendacao(String recomendacao) {
        this.Recomendacao = recomendacao;
    }
}

