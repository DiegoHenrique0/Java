package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStroingNumero {
	public static void main(String[] args) {
		// captura das Strings
		String valor1 = JOptionPane.showInputDialog("Digite a 1ª nota:");
		String valor2 = JOptionPane.showInputDialog("Digite a 2ª nota:");

		// conversão String -> número
		double n1 = Double.parseDouble(valor1);
		double n2 = Double.parseDouble(valor2);

		// soma
		double soma = n1 + n2;
		JOptionPane.showMessageDialog(null, "A soma das notas é:" + soma);

		// média
		JOptionPane.showMessageDialog(null, "A  média das notas é:" + soma / 2);

	}

}
