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
				System.out.println("Nota inv�lida!");
			}
		}
		
		//C�lculo da m�dia
		double media = total / quantNotas;
		System.out.println("A m�dia de notas da tumarma � de " + media + "!");
		System.out.println("Quantidade de notas informadas: " + quantNotas + "!");
		System.out.println("Soma das notas: " + total + "!");

		entrada.close();

	}

}
