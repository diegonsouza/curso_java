package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro salario: ");
		String primeiro = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salario: ");
		String segundo = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o terceiro salario: ");
		String terceiro = entrada.nextLine().replace(",", ".");
		
		double numero1 = Double.parseDouble(primeiro);
		double numero2 = Double.parseDouble(segundo);
		double numero3 = Double.parseDouble(terceiro);
		
		double soma = numero1 + numero2 + numero3;
		System.out.println("A soma do seu salario e:" + soma);
		
		System.out.println("A media do seu salario e:" + soma / 3);
	
		entrada.close();
		
		
	}
}
