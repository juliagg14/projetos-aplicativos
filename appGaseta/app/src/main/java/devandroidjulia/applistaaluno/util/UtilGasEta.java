package devandroidjulia.applistaaluno.util;

public class UtilGasEta {

    public void  MetodoNaoEstatico(){

    }

    public static  String CalucularMelhorOpcao(double gasolina, double etanol){

        double precoIdeal = gasolina * 0.7;
        String mensagemRetorno;

        if (etanol <= precoIdeal){
            mensagemRetorno = "Abastecer Com Etanol";
        }else {
            mensagemRetorno = "Abastecer Com Gasolina";
        }
        return mensagemRetorno;
    }
}



