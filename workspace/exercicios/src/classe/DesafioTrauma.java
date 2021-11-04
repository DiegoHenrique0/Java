package classe;

public class DesafioTrauma {
	
	// 1
	int a = 3; // não pode mexer aqui!
	
//	ou
	
	//2
	static int b = 5;

	public static void main(String[] args) {
		
		//1
		DesafioTrauma p = new DesafioTrauma(); //obrigado a usar uma stancia
		System.out.println(p.a);
		
//		ou
		 
		//2
		System.out.println(b);
	}

}
