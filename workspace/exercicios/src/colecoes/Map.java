package colecoes;

import java.util.HashMap;
import java.util.Map.Entry;
public class Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		java.util.Map<Integer, String> usuarios = new HashMap<>();
		
		usuarios.put(1, "Diego");
		usuarios.put(2, "Rafael");
		usuarios.put(3, "Davi");
		usuarios.put(5, "Rebeca");
		usuarios.put(6, "Joaquin");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("João"));
		
		System.out.println(usuarios.get(1));
		
		System.out.println();
		//Formas de varrer as variáveis
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println();
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println();
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}
	}

}
