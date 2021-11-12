package orientaçãoObjeto;

import java.util.ArrayList;
public class Compra {
	
	String nomeDoCliente;
	
	ArrayList<Item> itens = new ArrayList<>();
	
	double obterValorTotal() {
		double total = 0;
		
		for (Item item : itens) {
			total += item.quantidade * item.preco;
		}
		
		return total;
	}

}
