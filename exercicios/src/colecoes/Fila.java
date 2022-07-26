package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e Add -> adicionam elemento na fila
		// Diferença de comportamento ocorre quando a fila esta cheia!
		fila.add("Ana"); // retorna false 
		fila.offer("Bia"); // lança uma exceção 
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// Peek e Element -> obter o próximo elemtento da fila (sem remover)
		// Diferença de comportamento ocorre quando a fila esta vazia!
		System.out.println(fila.peek());// retorna null 
		System.out.println(fila.element());//lança uma exceção 
	
		// Poll e Remove -> obter o próximo elemtento da fila e remove!
		// Diferença de comportamento ocorre quando a fila esta vazia!
		System.out.println(fila.poll());// retorna null 
		System.out.println(fila.remove());//lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		
		//fila.size();
		//fila.clear();
		//fila.isEmpty();
		//fila.contains(...);
		
	}
}
