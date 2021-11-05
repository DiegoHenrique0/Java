package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos tem na turma: ");
		int alunos = entrada.nextInt();
		
		System.out.println("Quantas notas por aluno: ");
		int qtDeNotas = entrada.nextInt();
		
		double[][] notasDaTurma = new double[alunos][qtDeNotas];
		
		double total = 0;
		double media = 0;
		
		//Alunos
		for (int a = 0; a < notasDaTurma.length; a++) {
			System.out.println();
			
			//Notas
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", n+1, a+1);
				notasDaTurma [a][n] = entrada.nextDouble();
				//               Soma das notas						
				media = ((total += notasDaTurma[a][n]) / (alunos * qtDeNotas));
			}
		}
		
		//Notas de cada aluno
		for(double[] notasDoAluno: notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
			System.out.println();
		}
		
		System.out.println("---------------------------------------1");
		System.out.println("A média da turma foi: " + media);
		
		entrada.close();

	}

}
