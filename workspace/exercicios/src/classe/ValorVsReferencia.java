package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		int a = 2;
		int b = a; //atribui��o por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		Data d1 = new Data(1, 6, 2021);
		Data d2 = d1; //atribui��o por refer�ncia (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());

		voltarDataParaValorPadao(d1);
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada());
	}
	
	static void voltarDataParaValorPadao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

}
