package fundamentos;

import java.util.Scanner;

public class MediaSalario {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Captura de dados
		System.out.print("Informe o primeiro sálario: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		System.out.print("Informe o segundo sálario: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		System.out.print("Informe o terceiro sálario: ");
		String salario3 = entrada.nextLine().replace(",", ".");

		// Conversão String -> Número
		double s1 = Double.parseDouble(salario1);
		double s2 = Double.parseDouble(salario2);
		double s3 = Double.parseDouble(salario3);

		// Média
		double media = (s1 + s2 + s3) / 3;

		System.out.printf("A média salarial dos 3 meses foi de: %.2f", media);
		entrada.close();
	}

}
