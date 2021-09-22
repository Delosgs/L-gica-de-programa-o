package DevjavaDelano;

public class devjava_arrays_1 {
    public static void main(String[] args) {
        // byte, short, int long, float e double = 0
        //char = '\u0000' ' '
        //String = null

        String[] nomes = new String[4];
        nomes[0] = "Delano";
        nomes[1] = "Verusca";
        nomes[2] = "Bob";
        nomes[3] = "Familia";

        for (int i = 0; i < nomes.length; i++) { // Esse comando (length) serve para qualquer tamanho de arrays
            System.out.println(nomes[i]);
        }

    }
}
