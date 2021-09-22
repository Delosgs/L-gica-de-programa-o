package DevjavaDelano;

public class devjava_arrays_3 {
    public static void main(String[] args) {
        // 1,2,3,4,5 meses
        // 31,28,31,30 dias
        int[][] dias = new int[3][3];// O primeiro tres significa o tamanho da array que são os espaços em memoria reservados
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;
        //   i  j  = primeira coluna representa i e a segunda o j
        dias[1][0] = 31;
        dias[1][1] = 28;
        dias[1][2] = 31;
        // A terceira coluna de arrays aparece tudo zero pq ela não foi declarada
        // Mesmo assim o programa roda ela pq ela ta declarada na variavel int [] la em cima

        for (int i = 0; i < dias.length; i++) { // uma forma de fazer o FOR
            for (int j = 0; j < dias[i].length; j++) {//Primeiro ele executa o for do j
                System.out.print(dias[i][j] + " - "); // print = resultados na mesma linha
            }
        }
        System.out.println("  ");

        for (int[] arrayBase : dias) { // Outra forma de fazer o FOR = A melhor maneira é essa (:)
            for (int num : arrayBase) {  // Esse (:) faz refencia ao array dias int da variavel declarada la em cima
                System.out.println(num); // println = imprime resultados um em baixo do outro
            }
        }

    }
}
