package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.ano = 2021;
		
		var d2 = new Data(8,8,2020);
						
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.print(d2.obterDataFormatada());
		
		//d1.imprimirDataFormatada();
		//d2.imprimirDataFormatada();
	}
}
