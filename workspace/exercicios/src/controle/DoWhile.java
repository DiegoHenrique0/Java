package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int quantNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.println("Informe a nota: (ou -1 para sair)");
			nota = entrada.nextDouble();
			if (nota > -1 && nota < 11) {
				total += nota;
				quantNotas++;
			} else {
				System.out.println("Nota inválida!");
			}
		}
		
		//Cálculo da média
		double media = total / quantNotas;
		System.out.println("A média de notas da tumarma é de " + media + "!");
		System.out.println("Quantidade de notas informadas: " + quantNotas + "!");
		System.out.println("Soma das notas: " + total + "!");

		entrada.close();

	}

}
