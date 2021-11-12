package orientaçãoObjeto;

public class CompraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compra c1  = new Compra();
		c1.itens.add(new Item(10, "Lápis", 1.50));
		c1.itens.add(new Item(15, "Boracha", 0.50));
		c1.itens.add(new Item(5, "caneta", 3.00));

	}

}
