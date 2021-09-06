package delano.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo:");
		String nomeCompleto = scan.nextLine(); //Esse comando pega tudo que foi digitado
		System.out.println("Seu nome completo é: " + nomeCompleto);
		
		System.out.println("Digite seu primero nome:");
		String primeiroNome = scan.next(); // Esse comando so pega a primeira palavra
		System.out.println("Seu primeiro nome é: " + primeiroNome);
		
		System.out.println("Digite a sua idade:");
		int idade = scan.nextInt();     //comando para numero inteiro
		System.out.println("Sua idade é: " + idade);
		
		System.out.println("Digite a sua altura:");
		double altura = scan.nextDouble(); //comando igual ao float para numeros quebrados
		System.out.println("A sua altura é: " + altura);
		
		System.out.println("Digite seu primeiro nome, idade, quantidades de filhos, altura e se tem pet:");
		String primeiroNome1 = scan.next(); 
		int idade1 = scan.nextInt();
		byte qtdFilhos = scan.nextByte();
		float altura1 = scan.nextFloat();
		boolean temPet = scan.nextBoolean();
		
		System.out.println("Você digitou os seguintes valores:");
		System.out.println("Primeiro Nome: " + primeiroNome1);
		System.out.println("Idade: " + idade1);
		System.out.println("Quantidade de Filhos: " + qtdFilhos);
		System.out.println("Altura: " + altura1);
		System.out.println("Tem pet: " + temPet);
		
		/* para comentar todo o código*/     //comenta uma linha
		
		

	}

}
