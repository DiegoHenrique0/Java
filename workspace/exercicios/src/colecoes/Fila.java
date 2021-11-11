package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<>();
		
		//Offer e Add -> adicionam elementos na fila
		
		//Diferen�a � o comportamento quando a fila est� cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Jo�o"); // lan�a uma exce��o
		fila.offer("Macelo");
		fila.offer("Marcos");
		fila.offer("Bia");
		fila.offer("Maria");
		
		//Peek e Element -> obtem o pr�ximo elemento da fila (sem remover)
		
		//Diferen�a � o comportamento quando a fila est� vazia!
		System.out.println(fila.peek()); // Retorna null
		System.out.println(fila.element()); // lan�a uma exce��o
		
		//Pool e Remove -> Obtem o pr�ximo elemento da fila e remove!
		
		//Diferen�a � o comportamento quando a fila est� vazia!
		System.out.println(fila.poll()); // Retorna null
		System.out.println(fila.remove()); // // lan�a uma exce��o
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);

	}

}
