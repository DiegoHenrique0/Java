package fundamentos;

public class TabelaVerdade {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		// Tabela verdade E
		System.out.println("Tabela verdade E (AND)");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true); //código morto pois nunca chegará no true
		System.out.println(false && false); //código morto pois nunca chegará no segundo false
		
		//Tabela verdade OU
		System.out.println("Tabela verdade OU (OR)");
		System.out.println(true || true); //código morto
		System.out.println(true || false); //código morto
		System.out.println(false || true); 
		System.out.println(false || false);
		
		System.out.println("Tabela verdade OU exclusivo (XOR)");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true); 
		System.out.println(false ^ false);
		
	}

}
