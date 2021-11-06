package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		
		//add elementos
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("O tamanho é de " + conjunto.size() + " elementos");
		
		//removendo elemento
		System.out.println(conjunto.remove('x')); 
		System.out.println(conjunto.remove(1.2)); 
		System.out.println(conjunto.remove(1.2)); // resultado será fase pq nao tem como retirar um OBJ q não existe
		
		System.out.println("O tamanho é de " + conjunto.size() + " elementos");
		
		//Verificar se o elemento existe
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains("teste"));
		
		Set num = new HashSet();
		num.add(1);
		num.add(2);
		num.add(3);
		
		System.out.println(num);
		System.out.println(conjunto); // HashSet do conjunto
		
//		conjunto.addAll(num); // União entre dois conjuntos
		
		// Somente o q tem de igaul nos conjuntos
		conjunto.retainAll(num); 
		System.out.println(conjunto);
		
		//Apaga o cojunto
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
