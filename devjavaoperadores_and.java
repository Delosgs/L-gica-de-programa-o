package DevjavaDelano;

public class devjavaoperadores_and {
    public static void main(String[] args){

        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean dentroDaLeiMaiorTrinta = idade  > 30 && salario < 4612;
        boolean dentroDaLeiMenorTrinta = idade  < 30 && salario >= 3381;
        System.out.println("Ele esta de acordo com a lei maior que trinta: " + dentroDaLeiMaiorTrinta);
        System.out.println("Ele esta de acordo com a lei menor que trinta: " + dentroDaLeiMenorTrinta);

        double valorContaCorrente = 200;
        double valorContaPoupança = 10000;
        float valorDoPlaystation = 5000;
        boolean podeComprarPlaystation = valorContaCorrente > valorDoPlaystation || valorContaPoupança > valorDoPlaystation;
        System.out.println("O playstation pode ser comprado? " + podeComprarPlaystation);
    }
}
