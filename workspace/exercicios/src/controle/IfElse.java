package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		//captura do n�mero
		String valor = JOptionPane.showInputDialog("Informe um n�mero: ");
		int numero = Integer.parseInt(valor);
		
		//deciss�o se o n�mero � impa ou par
		
		if (numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � par!");
		} else {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � impar!");
		}

	}

}
