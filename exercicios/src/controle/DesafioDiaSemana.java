package controle;

import java.util.Scanner;


public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String semana = entrada.next();
								
		if ("domingo".equalsIgnoreCase(semana) ) {
			System.out.println("Domingo -> 1");
		}else if("segunda".equalsIgnoreCase(semana) ){
			System.out.println("Segunda -> 2");
		}else if ("terça".equalsIgnoreCase(semana) || "terca".equalsIgnoreCase(semana)) {
			System.out.println("Terça -> 3 ");
		}else if ("quarta".equalsIgnoreCase(semana)) {
			System.out.println("Quarta -> 4");
		}else if ("quinta".equalsIgnoreCase(semana)) {
			System.out.println("Quinta -> 5");
		}else if ("sexta".equalsIgnoreCase(semana)) {
			System.out.println("Sexta -> 6");
		}else if ("sábado".equalsIgnoreCase(semana) || "sabado".equalsIgnoreCase(semana)) {
			System.out.println("Sabado -> 7");
		}else {
			System.out.println("Dia inválido!");
		}
		
		entrada.close();
	}
}
