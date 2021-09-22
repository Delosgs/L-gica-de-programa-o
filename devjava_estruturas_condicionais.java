package DevjavaDelano;

public class devjava_estruturas_condicionais {
    public static void main(String[] args){
        //if so executa se for verdadeiro

        int idade = 17;
        boolean outorizadoComprarBebida = idade >=18;
        // ! é = false (nega a condição)
        if (outorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida");
        }else{
            System.out.println("Não autorizado a comprar bebida");
        }
        //if (!outorizadoComprarBebida){
            //System.out.println("Não autorizado a comprar bebida");

        }
        //if (outorizadoComprarBebida == false) = !
    }
//}
