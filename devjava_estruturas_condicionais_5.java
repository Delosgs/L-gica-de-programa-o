package DevjavaDelano;

public class devjava_estruturas_condicionais_5 {
    public static void main(String[] args){
        // Utilizando o switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana.
        // Considerando 1 como domingo
        byte dia = 3;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }
    }
}
