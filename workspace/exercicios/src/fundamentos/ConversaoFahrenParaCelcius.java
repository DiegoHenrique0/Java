package fundamentos;

public class ConversaoFahrenParaCelcius {

	public static void main(String[] args) {
		// F�rmula C = (�F - 32) X 5/9
		
		// var
		double f = 80;

		// Constantes
		final double FATOR = 0.5 / 0.9;
		final double AJUSTE = 32;

		// calculo
		double c = (f - AJUSTE) * FATOR;

		System.out.println("Est� fazendo " + c + "�C hoje!");
	}

}
