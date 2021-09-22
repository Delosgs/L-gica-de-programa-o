package DevjavaDelano;

public class devjava_arrays_4 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][]; // essa array int com tres esta declarada em baixo separadamente

        // Aqui são as tres formas que a array int de cima foi declarada
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5};

        // outra forma de declarar tudo em uma variavel array
        int[][] arrayInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6,}};

        System.out.println("Exemplo 1");

        for (int[] arrayBase : arrayInt) { // (:) ta fazendo referencia ao arrayint
            System.out.println("------");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }
        System.out.println("Exemplo 2");

        for (int[] arrayBase : arrayInt2) {  // (:) ta fazendo referencia ao arrayint
            System.out.println("------");
            for (int num : arrayBase) {
                System.out.println(num );
            }
        }
    }
}
