package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		//captura da nota 
		System.out.println("Informe a nota do aluno: ");
		double nota = entrada.nextDouble();
		
		if (nota < 11 && nota >= 7) {
			System.out.println("Aluno aprovado!");
		}else {
			System.out.println("reprovado!");
		}
		
		entrada.close();

	}

}
