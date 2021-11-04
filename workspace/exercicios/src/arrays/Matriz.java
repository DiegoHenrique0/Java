package arrays;

import java.util.Iterator;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Quantidade de alunos
		System.out.println("Quantos alunos tem na turma: ");
		int alunos = entrada.nextInt();
		
		//Quantidade de Bimestres
		System.out.println("Quantas notas por aluno: ");
		int qtDeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[alunos][qtDeNotas];
		
		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma.length; n++) {
				System.out.printf("informe a nota tirada no %d Bimestre do aluno %d:", a+1, n+1);
				notasDaTurma [a][n] = entrada.nextDouble();
			}
		}

		entrada.close();

	}

}
