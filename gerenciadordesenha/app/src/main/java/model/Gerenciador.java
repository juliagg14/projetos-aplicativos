package model;

public class Gerenciador {

    private String DigiteSenha;
    private String ConfirmarSenha;

    public Gerenciador(){}

    public String getDigiteSenha() {
        return DigiteSenha;
    }

    public void setDigiteSenha(String digiteSenha) {
        DigiteSenha = digiteSenha;
    }

    public String getConfirmarSenha() {
        return ConfirmarSenha;
    }

    public void setConfirmarSenha(String confirmarSenha) {
        ConfirmarSenha = confirmarSenha;
    }

    @Override
    public String toString() {
        return "Gerenciador{" +
                "DigiteSenha='" + DigiteSenha + '\'' +
                ", ConfirmarSenha='" + ConfirmarSenha + '\'' +
                '}';
    }
}
