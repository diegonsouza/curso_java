package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		//Set <String> listaAprovados = new HashSet<>();
		SortedSet <String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for (String canditado: listaAprovados) {
			System.out.println(canditado);
		}
		
		Set <Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(100);
		nums.add(8);
		
		// nums.get(1); Não é possivel acessar pelo índice
		
		for(int n: nums) {
		System.out.println(n);
		}
	}
}
