package fundamentos;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		
		// Há 2 maneiras de converter números para String
		Integer n1 = 2000;
		System.out.println(n1.toString().length());
		
		int n2 = 2000;
		System.out.println(Integer.toString(n2));
	}

}
