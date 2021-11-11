package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		
		//Diferença é o comportamento quando a fila está cheia!
		fila.add("Ana"); // retorna false
		fila.offer("João"); // lança uma exceção
		fila.offer("Macelo");
		fila.offer("Marcos");
		fila.offer("Bia");
		fila.offer("Maria");
		
		//Peek e Element -> obtem o próximo elemento da fila (sem remover)
		
		//Diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.element()); // lança uma exceção
		
		//Pool e Remove -> Obtem o próximo elemento da fila e remove!
		
		//Diferença é o comportamento quando a fila está vazia!
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // // lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);

	}

}
