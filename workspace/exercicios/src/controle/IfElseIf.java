package controle;

import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nota: ");
		double nota = entrada.nextDouble();
		
		if (nota < 11 && nota > -1) {
			
			//A+
			if (nota > 7.99 && nota < 11) {
				System.out.println("Aluno APROVADO (A+)");
			}
			
			//B-
			if (nota > 5.99 && nota < 8) {
				System.out.println("Aluno APROVADO (B-)");
			}
			
			//D
			if (nota > 3.99 && nota < 6) {
				System.out.println("Aluno de RECUPERAÇÃO (D)");
			}
			
			//F
			if (nota > -1 && nota < 4) {
				System.out.println("Auno REPROVADO (F)");
			}
		} else {
			System.out.println("Nota inválida, tente novamente!");
		}
		entrada.close();

	}

}
