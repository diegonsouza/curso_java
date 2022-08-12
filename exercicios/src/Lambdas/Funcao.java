package Lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Impar";
		
		System.out.println(parOuImpar.apply(52));
		
		Function<String, String> oResultado = valor -> "O resultado e: " + valor;
		
		Function<String, String> empolgado = excl -> excl + "!!!";
		
		String resultadoFinal = parOuImpar.andThen(oResultado).andThen(empolgado).apply(52);
		
		System.out.println(resultadoFinal);
	}
}
 