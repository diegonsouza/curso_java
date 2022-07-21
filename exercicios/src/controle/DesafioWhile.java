package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int quantidadesNota = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();
			
			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadesNota++;
				}else if (nota != -1 ) {
					System.out.println("Nota invalida!!");
				}
		}
		
		// Calcular a media
		
		double media = total / quantidadesNota;
		System.out.println("Media = " + media);

		entrada.close();
	}
}
