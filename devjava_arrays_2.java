package DevjavaDelano;

public class devjava_arrays_2 {
    public static void main(String[] args){
        int[] numeros = new int [3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int []{5,4,3,2,1};

        for (int i = 0; i < numeros3.length; i++){  //modelo de impressão de for com indice
            System.out.println(numeros3[i]);
        }
        for (int num : numeros2) { // Outro modelo de for para uma variavel tipo (array int)
            System.out.println(num); // num é uma variavel local desse for
        }
    }
}
