package controle;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		//captura de dados
		System.out.println("Nome do dia: ");
		String dia = entrada.next();
		
		//dias da semana
		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		}else if (dia.equalsIgnoreCase("segunda") || dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		}else if (dia.equalsIgnoreCase("quarta")){
			System.out.println(4);
		}else if (dia.equalsIgnoreCase("quinta")){
			System.out.println(5);
		}else if (dia.equalsIgnoreCase("sexta")){
			System.out.println(6);
		}else if (dia.equalsIgnoreCase("s�bado") || dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		}else {
			System.out.println("Dia inv�lido!");
		}
		
		entrada.close();

	}

}
