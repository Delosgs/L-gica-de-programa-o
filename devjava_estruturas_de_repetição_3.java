package DevjavaDelano;

public class devjava_estruturas_de_repetição_3 {
    public static void main(String[] args){
        // Para valor decresente
        // Dado o valor de um carro, descubra em quantas parcelas ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorTotal = 30000;
        for ( int parcela = (int) valorTotal; parcela >= 1; parcela --){ // Foi feito um cast para forçar a variavel
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

    }
}


