package classe;

public class Equals {
	
	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Diego", "diegohenrique022@gmail.com");
		Usuario u2 = new Usuario("Diego", "diegohenrique022@gmail.com");
		
		System.out.println(u1.email);
		System.out.println(u2.nome);
	}

}
