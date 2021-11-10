package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Usuario> lista = new ArrayList<Usuario>();
		
		lista.add(new Usuario("Diego"));
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Maria"));
		lista.add(new Usuario("Joaquin"));
		lista.add(new Usuario("Rafaela"));
		
		//Procurar apenas um usuário especifico (ID)
		System.out.println("Procura pelo ID:");
		System.out.println(lista.get(3).nome);
		
		//Mostra todos os usuarios
		System.out.println("\nTodos usuários:");
		for(Usuario varer: lista) {
			System.out.println(varer.nome);
		}

	}

}
