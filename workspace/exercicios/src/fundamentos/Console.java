package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite seu sobre nome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Qual a sua idade: ");
		int idade = entrada.nextInt();
		System.out.printf("\n%s %s tem %d anos!", nome, sobrenome, idade);
		
		entrada.close();
	}

}
