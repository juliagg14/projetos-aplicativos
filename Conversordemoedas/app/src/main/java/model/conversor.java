package model;

public class Conversor {

    private String Digite;

    public Conversor(){}

    public String getDigite() {
        return Digite;
    }

    public void setDigite(String digite) {
        this.Digite = digite;
    }

    @Override
    public String toString() {
        return "Conversor{" +
                "Digite='" + Digite + '\'' +
                '}';
    }
}


