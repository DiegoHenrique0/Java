package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStroingNumero {
	public static void main(String[] args) {
		// captura das Strings
		String valor1 = JOptionPane.showInputDialog("Digite a 1� nota:");
		String valor2 = JOptionPane.showInputDialog("Digite a 2� nota:");

		// convers�o String -> n�mero
		double n1 = Double.parseDouble(valor1);
		double n2 = Double.parseDouble(valor2);

		// soma
		double soma = n1 + n2;
		JOptionPane.showMessageDialog(null, "A soma das notas �:" + soma);

		// m�dia
		JOptionPane.showMessageDialog(null, "A  m�dia das notas �:" + soma / 2);

	}

}
