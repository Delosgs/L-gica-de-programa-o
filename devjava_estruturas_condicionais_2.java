package DevjavaDelano;

public class devjava_estruturas_condicionais_2 {
    public static void main(String[] args){
        // Doar se salario > 5000
        double salario = 4000;

        // Cenario 1 = (Condição) ? verdadeiro : falso  (?) = condição ternario
        String resultado1 = salario > 5000 ? "Doar Salario" : "Não Doar"; // = Condição ? true ou false
        //boolean possoDoar = salario > 5000 ? true : false; (essa linha é a mesma coisa da resultado 1)

        // Cenario 2:
        String doarSalario = "Eu vou doar para Delano";
        String naoDoar = "Ainda não tenho condiçoes";
        String resultado2;
        if (salario > 5000){
            resultado2 = doarSalario;
        }else{
            resultado2 = naoDoar;
        }
        System.out.println(resultado1);
        System.out.println(""); // para dar espaço
        System.out.println(resultado2);


    }
}
