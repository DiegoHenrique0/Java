package controle;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		while (!valor.equalsIgnoreCase("sair")) {
			System.out.println("oi, como posso ajudar?");
			valor = entrada.nextLine();
		}
		
		entrada.close();

	}

}
