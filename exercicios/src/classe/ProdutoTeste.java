package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",4356.89);
				
		var p2 = new Produto();
		p2.nome = "Caneta Azul";
		p2.preco = 12.50;
		
		Produto.desconto = 0.50;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double total = precoFinal1 + precoFinal2;
		double media = total / 2;
		
		System.out.printf("R$ %.2f\n", precoFinal1);
		System.out.printf("R$ %.2f\n", precoFinal2);
		System.out.printf("Valor total e R$ %.2f\n", total);
		System.out.printf("Media do carrinho R$ %.2f", media);
		
	}
}
