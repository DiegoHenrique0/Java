package fundamentos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Numero 1: ");
		double num1 = entrada.nextDouble();
		System.out.println("Numero 2: ");
		double num2 = entrada.nextDouble();
		System.out.println("operação: ");
		String op = entrada.next();
		
//		Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

		
		entrada.close();

	}

}
