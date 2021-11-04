package classe;

public class DataTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d1 = new Data();
		
		Data d2 = new Data(02,11,2021);
		Data d3 = new Data();
		
		
		System.out.println(d1.dataFormatada());
		System.out.println (d2.dataFormatada());
		System.out.println (d3.dataFormatada());

	}

}
