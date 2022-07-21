package fundamentos;

public class Temperatura {
	
public static void main(String[] args) {
	//(°F - 32) x 5/9 = °C
	
		final double FATOR = 5/9.0;
		final double AJUSTE = 32;
		
		double farenheit = 86;
		double celsius = (farenheit - AJUSTE) * FATOR;
				
		System.out.println("O resultado e: " + celsius+ "C");	
		
		farenheit = 0;
		celsius = (farenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado e: " + celsius+ "C");	

}
}


