package delano.cursojava.aula12;

import java.util.Scanner;

public class LeituraDados2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu primeiro nome, idade, quantidades de filhos, altura e se tem pet:");
		String primeiroNome = entrada.next(); 
		int idade = entrada.nextInt();
		byte qtdFilhos = entrada.nextByte();
		float altura = entrada.nextFloat();
		String temPet = entrada.nextLine();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("                         ");
		System.out.println("Primeiro Nome: " + primeiroNome);
		System.out.println("Idade: " + idade + " anos ");
		System.out.println("Quantidade de Filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura + " m ");
		System.out.println("Tempet: " + temPet);

	}

}
