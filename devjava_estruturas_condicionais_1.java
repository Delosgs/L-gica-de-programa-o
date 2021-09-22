package DevjavaDelano;

public class devjava_estruturas_condicionais_1 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto

        // METODO NUMERO 1:
        int idade = 19;
        if (idade < 15){
            System.out.println("categoria infantil");
        } else if (idade >=15 && idade < 18 ){
            System.out.println("categoria juvenil");
        } else {
            System.out.println("categoria adulto");
        }
        System.out.println(""); // Para dar espaço entre os resultados

        // METODO NUMERO 2:
        String categoria;
        if (idade < 15) {
            categoria = "Criança";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Adolecente";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
