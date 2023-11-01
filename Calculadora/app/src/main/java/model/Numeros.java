package model;

public class Numeros {

    private String DigiteOsNumeros;


    public Numeros(){}

    public String getDigiteOsNumeros() {
        return DigiteOsNumeros;
    }

    public void setDigiteOsNumeros(String digiteOsNumeros) {
        this.DigiteOsNumeros = digiteOsNumeros;
    }

    @Override
    public String toString() {
        return "Numeros{" +
                "DigiteOsNumeros=" + DigiteOsNumeros +
                '}';
    }
}
