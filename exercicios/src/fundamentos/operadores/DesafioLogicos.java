package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		
		boolean tv55 = (trabalho1 && trabalho2);
		boolean tv32 = (trabalho1 ^ trabalho2);
		boolean sorvete = (trabalho1 || trabalho2);
		
		//Operador Unario!
		boolean maisSaudavel = !sorvete;
		
		System.out.println("Iremos ao shopping compra uma TV de 55'? " + tv55);
		System.out.println("Iremos ao shopping compra uma TV de 32'? " + tv32 );
		System.out.println("Tomaremos sorvete? " + sorvete );
		System.out.println("Mais saudavel? " + maisSaudavel);		
		
		
	
	}

}
