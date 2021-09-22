package DevjavaDelano;

public class devjava_estruturas_de_repetição {
    public static void main(String[] args){
        // while, do while, for
        int count = 0;
        while (count < 10) { // while so executa valor boolean = true or false
            System.out.println(count); // Dentro do parentese podia ser tbm (++count)
            count ++; //Essa soma poderia ser tbm: count += 1, count = count + 1
        }
        count = 0;
        do {
            System.out.println("Com do while" + ++count);
        } while (count < 10); // do while executa pelo menos uma vez, mesmo se for falso.

        for (int i=0; i < 10; i++) { // int i=0, poderia ser = (count = 0) como nos outros exemplos
            System.out.println("For " + i);
        }
    }
}
