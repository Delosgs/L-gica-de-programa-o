package delano.cursojava.aula13;

public class OperadoresAritimeticos {

	public static void main(String[] args) {
		int resultado = 1 + 2;  // nesse prog, ele vai fazer as operações uma a uma
		System.out.println(resultado); //sempre pegando o ultimo resultado e calculando
		
		resultado = resultado - 1;
		System.out.println(resultado);
		
		resultado = resultado * 2;
		System.out.println(resultado);
		
		resultado = resultado /2;
		System.out.println(resultado);
		
		resultado = resultado + 8;
		System.out.println(resultado);
		
		resultado = resultado % 7; //Mod = modulado %, pega o reto da divisão 10/7 = 3 resultado
		System.out.println(resultado);
		
		String primeiroNome = "Esta é";
		String segundoNome = " uma string concatenada";
		String terceiroNome = primeiroNome + segundoNome;
		System.out.println(terceiroNome);
		
		resultado = resultado +1;
		System.out.println(resultado);
		
		resultado ++;
		System.out.println(resultado); 
		
		//resultado = 5
		System.out.println(resultado++);//Aqui mostra o resultado e depois acresenta +1
		//Mesma coisa
		//System.out.println(resultado);
		//resultado = resultado +1;
		//resultado +=1;
		
		System.out.println(++resultado);//Aqui acresenta primeiro e dps mostra o resultado
		//Mesma coisa
		//resultado +=1;
		//System.out.println(resultado);
		
		resultado --;// 6
		System.out.println(resultado);
		
		System.out.println(resultado--);// 5
		System.out.println(--resultado);// 4

	}

}
