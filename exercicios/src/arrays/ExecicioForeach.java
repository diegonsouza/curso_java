package arrays;

import java.util.Arrays;

public class ExecicioForeach {
	
	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		System.out.println(Arrays.toString(notasAlunoA));
	
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		double totalAlunoA = 0;
		for (double valorA: notasAlunoA) {
			totalAlunoA += valorA;
			System.out.print("Total de Notas: " + valorA + "\n" );
		}
		
		
		System.out.println("Media: " +totalAlunoA / notasAlunoA.length);
		final double notaArmazenada = 5.9;
		double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};
		
		double totalAlunoB = 0;
				for (double valorB:notasAlunoB) {
					totalAlunoB += valorB;
					System.out.print("Total de Notas: " + valorB + "\n");
			}
				
				System.out.println("Media: " + totalAlunoB / notasAlunoB.length);
	}
}


