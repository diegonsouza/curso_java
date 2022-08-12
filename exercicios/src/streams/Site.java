package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Site {

	public static void main(String[] args) {
		
		Produtos item1 = new Produtos("Lapis", 1.99, 0.35, 0);
		Produtos item2 = new Produtos("Caneta", 3.69, 0.30, 0);
		Produtos item3 = new Produtos("Borracha", 2.80, 0.15, 0);
		Produtos item4 = new Produtos("Impressora", 1200, 0.40, 0);
		Produtos item5 = new Produtos("Monitor", 800, 0.31, 0);
		
		List<Produtos> materias = Arrays.asList(item1,item2,item3,item4,item5);
		
		Predicate<Produtos> promocao = p ->p.desconto >= 0.30; 
		Predicate<Produtos> freteGratis = f -> f.frete == 0;
		Predicate<Produtos> precoRelevante = r -> r.preco >= 500;
		Function<Produtos,String> chamadaPromocao = d-> "Aproveite! " +d.nome + " por R$" + d.preco;
		
		materias.stream().filter(promocao).filter(freteGratis).filter(precoRelevante).map(chamadaPromocao).forEach(System.out::println);
	}
}
