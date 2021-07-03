package fundamentos;

import java.util.Scanner;

public class MediaSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Captura de dados
		System.out.print("Informe o primeiro s�lario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.print("Informe o segundo s�lario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.print("Informe o terceiro s�lario: ");
		String salario3 = entrada.nextLine().replace(",", ".");

		// Convers�o String -> N�mero
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);

		// M�dia
		double media = (s1 + s2 + s3) / 3;

		System.out.printf("A m�dia salarial dos 3 meses foi de: %.2f", media);
		entrada.close();
	}

}
