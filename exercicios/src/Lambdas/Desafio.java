package Lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		
		Produto p = new Produto ("IPad", 3235.89,0.13);
		
		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		Double preco = precoFinal.andThen(impostoMunicipal).andThen(frete).apply(p);
		
		System.out.printf("O preco final sera R$%.2f", preco);
		
	} 

}
