package classe;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d1 = new Data();
		d1.dia = 28; 
		d1.mes = 9;
		d1.ano = 2000;
		
		Data d2 = new Data();
		d2.dia = 25; 
		d2.mes = 10;
		d2.ano = 2021;
		
		System.out.println(d1.dataFormatada());
		System.out.println (d2.dataFormatada());

	}

}
