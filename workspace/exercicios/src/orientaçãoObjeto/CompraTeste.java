package orientaçãoObjeto;

public class CompraTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Compra compra  = new Compra();
		compra.itens.add(new Item(10, "Lápis", 1.50));
		compra.itens.add(new Item(15, "Boracha", 0.50));
		compra.itens.add(new Item(5, "caneta", 3.00));
		
		System.out.println(compra.obterValorTotal());

	}

}
