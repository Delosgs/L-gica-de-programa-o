package DevjavaDelano.IPRF;

public class devjava_IPRF {
    public static void main(String[] args){

        double salarioAnual = 61000;
        double isentoTaxa = 0;
        double primeirafaixa = 7.5 / 100;
        double segundaFaixa = 15.0 / 100;
        double terceiraFaixa = 22.5 / 100;
        double quartaFaixa = 27.5 / 100;
        double valorDoImposto;

        if (salarioAnual <= 22847){
            valorDoImposto = salarioAnual * isentoTaxa;
        }else if (salarioAnual > 22847 && salarioAnual <= 33919){
            valorDoImposto =salarioAnual * primeirafaixa;
        }else if (salarioAnual > 33919 && salarioAnual <= 45012){
            valorDoImposto =salarioAnual * segundaFaixa;
        }else if (salarioAnual > 45012 && salarioAnual <= 55976) {
            valorDoImposto = salarioAnual * terceiraFaixa;
        }else {
            valorDoImposto = salarioAnual * quartaFaixa;
        }
        System.out.println(" O valor em reais cobrado sera: " + valorDoImposto);
    }
}
