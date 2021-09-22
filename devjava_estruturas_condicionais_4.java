package DevjavaDelano;

public class devjava_estruturas_condicionais_4 {
    public static void main(String[] args) {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 2;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break; // Esse comando faz parar quando acha o numero. Se tirar, ele lê todos os resultados dps do numero 5
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sabado");
                break;
            default: // comando padrão utilizado nos comando finais do case.
                System.out.println("Opção invalida");
                break;


        }
        char sexo = 'F'; // Se fose um nome ou etxto poderia ser uma String
        switch (sexo) {
            case 'M':
                System.out.println("Homen");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
                break;

        }
    }
}
