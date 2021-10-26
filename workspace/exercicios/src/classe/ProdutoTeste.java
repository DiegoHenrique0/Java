package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4599.99;
		p1.desconto = 0.20;
		
		Produto p2 = new Produto();
		p2.nome = "SSD 250g";
		p2.preco = 500.00;
		p2.desconto = 0.10;
		
		//Cálculo do desconto
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.05);
		
		//total a ser pago
		double total = precoFinal1 + precoFinal2;
		
		System.out.printf("Produto: %s - %s \n", p1.nome, p2.nome);
		System.out.printf("valor: %.2f - %.2f \n", precoFinal1, precoFinal2);
		System.out.printf("TOTAL: %.2f",total);
	}

}
