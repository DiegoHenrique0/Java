package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		//captura do número
		String valor = JOptionPane.showInputDialog("Informe um número: ");
		int numero = Integer.parseInt(valor);
		
		//decissão se o número é impa ou par
		
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é par!");
		} else {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é impar!");
		}

	}

}
