package model;

public class Palavras {

    private String Campo1;
    private String Campo2;
    private String Campo3;
    private String Campo4;
    private String Campo5;

    public Palavras(){}

    public String getCampo1() {
        return Campo1;
    }

    public void setCampo1(String campo1) {
        Campo1 = campo1;
    }

    public String getCampo2() {
        return Campo2;
    }

    public void setCampo2(String campo2) {
        Campo2 = campo2;
    }

    public String getCampo3() {
        return Campo3;
    }

    public void setCampo3(String campo3) {
        Campo3 = campo3;
    }

    public String getCampo4() {
        return Campo4;
    }

    public void setCampo4(String campo4) {
        Campo4 = campo4;
    }

    public String getCampo5() {
        return Campo5;
    }

    public void setCampo5(String campo5) {
        Campo5 = campo5;
    }

    @Override
    public String toString() {
        return "Palavras{" +
                "Campo1='" + Campo1 + '\'' +
                ", Campo2='" + Campo2 + '\'' +
                ", Campo3='" + Campo3 + '\'' +
                ", Campo4='" + Campo4 + '\'' +
                ", Campo5='" + Campo5 + '\'' +
                '}';
    }
}
