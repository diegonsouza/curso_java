package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de notas: ");
		int quantidadeNota = entrada.nextInt();
		
		double[] nota = new double[quantidadeNota];
						
		for(int i = 0; i < nota.length; i++) {
			System.out.print("Digite a nota: " + (i + 1) + ": ");
			nota[i] = entrada.nextDouble();
		}
			System.out.println(Arrays.toString(nota));
		
		 double total = 0;
		 for (double notas:nota) {
			 total += notas;
		 }
		double media = total / nota.length;
			System.out.println("Sua media sera: " + media);
		
		entrada.close();
		
		}
		
		
		
	}

