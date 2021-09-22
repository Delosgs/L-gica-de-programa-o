package DevjavaDelano;

public class devjavaoperadores {
    public static void main(String[] args){
        // + - * / operadores aritmeticos
        int numero01 = 10;
        int numero02 = 20; // na divisão, numero inteiro com numero inteiro so mostra resultado inteiro
        double resultado = numero01 / numero02;
        System.out.println(resultado);

        int numero1 = 10;
        double numero2 = 20; // na divisão com double ou float o resultado aparece pq eles mostram numeros decimais
        double result = numero1 / numero2;
        System.out.println(result);

        //%
        int resto = 21 % 2; // Com essa divisão o resultado sera o resto da divisão e serve para saber se é positivo ou negativo.
        System.out.println(resto);

        // < > <= >= == !=
        boolean dezMaiorQueVinte = 10 > 20;
        boolean dezMenorQueVinte = 10 < 20;
        boolean dezIgualVinte = 10 == 20;
        boolean dezIgualDez = 10 == 10.0;
        boolean dezDiferenteDez = 10 != 10;

        System.out.println("Dez é maior que vinte? " + dezMaiorQueVinte );
        System.out.println("Dez é menor que vinte? " + dezMenorQueVinte);
        System.out.println("Dez é igual a vinte? " + dezIgualVinte);
        System.out.println("Dez é igual a dez? " + dezIgualDez);
        System.out.println("Dez é difernete de dez? " + dezDiferenteDez);

        // && (AND) || (OR) ! (NOT)
        int idade = 35;
        float salario = 3500F;
        boolean dentroDaLeiMaiorTrinta = idade  >= 30 && salario < 4612;
        boolean dentroDaLeiMenorTrinta = idade  < 30 && salario >= 3381;
        System.out.println("Ele esta de acordo com a lei maior que trinta: " + dentroDaLeiMaiorTrinta);
        System.out.println("Ele esta de acordo com a lei menor que trinta: " + dentroDaLeiMenorTrinta);

    }
}
