package delano.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosDojo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome abaixo:");
		String nome = entrada.nextLine();
		System.out.println("Digite sua idade:");
		int idade = entrada.nextInt();
		System.out.println("Digite seu sexo M ou F:");
		char sexo = entrada.next().charAt(0);
		System.out.println("---------------------");
		System.out.println("nome:" + nome);
		System.out.println("idade:" + idade);
		System.out.println("sexo:" + sexo);
	}

}
