package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Ana","Bia","Lia","Gui");
		
		System.out.println("Forma tradicional...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01...");
		aprovados.forEach(a -> System.out.println(a + "!!!"));
		
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda #02...");
		aprovados.forEach(c -> meuImprimir(c));
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
		
	}
	
	static void meuImprimir(String b) {
		System.out.println("Oi! Meu nome e " + b);
	}
	
}
