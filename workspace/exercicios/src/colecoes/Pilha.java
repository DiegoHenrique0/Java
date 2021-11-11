package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// O ultimo q entra é o primeiro a sair 
		
		Deque<String> livros = new ArrayDeque<String>();
		
		//ADD
		livros.add("João e Maria");
		livros.push("O pequeno preincipe");
		livros.push("O Hobbit");
		
		//Primeiro elemento
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println();
		
		//Pega o elemento e apaga
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.remove());
		//System.out.println(livros.remove());
		
		//livros.size();
		//livros.clear();
		//livros.isEmpty();
		//livros.contains(...);

	}

}
