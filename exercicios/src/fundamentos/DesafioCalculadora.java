package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		 
		System.out.print("Digite o primeiro numero: ");
		double valor1 = entrada.nextDouble();
		
		System.out.printf("Digite o segundo numero: ");
		double valor2 = entrada.nextDouble();
				
		System.out.printf("Sinal da operacao: ");
		String sinal = entrada.next();
		
		//Lógica
		
		double resultado = "+".equals(sinal) ? valor1 + valor2 : 0;
		resultado = "-".equals(sinal) ? valor1 - valor2 : resultado;
		resultado = "*".equals(sinal) ? valor1 * valor2 : resultado;
		resultado = "/".equals(sinal) ? valor1 / valor2 : resultado;
		resultado = "%".equals(sinal) ? valor1 % valor2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f ", valor1, sinal, valor2,resultado);
		
		entrada.close();
	}
}