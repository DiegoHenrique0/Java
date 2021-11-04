package arrays;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("De quantas notas deseja saber a média? ");
		int quantidade = entrada.nextInt();
		
		double[] notas = new double[quantidade];
		
		for(int i = 0; i < notas.length; i++) {
			//Captura de cada nota
			System.out.println("Informe a nota do bimestre " + (i + 1) + ":");
			notas[i] = entrada.nextDouble();		
		}
		
		double somaDasNotas = 0;
		double media = 0;
		for(double nota: notas) {
			//Soma e média  de todas as notas
			media = (somaDasNotas += nota) / quantidade;
		}
		
		
		System.out.println(somaDasNotas);
		System.out.println("Sua média foi: " + media);

		

		entrada.close();
	}

}
