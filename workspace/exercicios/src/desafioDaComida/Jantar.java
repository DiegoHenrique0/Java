package desafioDaComida;

public class Jantar {

	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijão", 0.400);
		Comida c3= new Comida("Carne", 0.500);
		
		Pessoa p1 = new Pessoa("João", 99.8);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
		p1.comer(c3);
		System.out.println(p1.apresentar());
		
		System.out.println();
		
		Pessoa p2 = new Pessoa("Maria", 60.20);
		System.out.println(p2.apresentar());
		p2.comer(c1);
		System.out.println(p2.apresentar());
		p2.comer(c2);
		System.out.println(p2.apresentar());
		
	}

}
