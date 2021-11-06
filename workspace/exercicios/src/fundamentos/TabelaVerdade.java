package fundamentos;

public class TabelaVerdade {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Tabela verdade E
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true); //c�digo morto pois nunca chegar� no true
		System.out.println(false && false); //c�digo morto pois nunca chegar� no segundo false
		
		//Tabela verdade OU
		System.out.println("Tabela verdade OU (OR)");
		System.out.println(true || true); //c�digo morto
		System.out.println(true || false); //c�digo morto
		System.out.println(false || true); 
		System.out.println(false || false);
		
		System.out.println("Tabela verdade OU exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true); 
		System.out.println(false ^ false);
		
	}

}
