package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String ("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1)); // Comparar String com Equals
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next(); // next tira espaço
	//String s2 = entrada.nextLine(); // nextLine deixa os espaço
		System.out.println(s2);
		System.out.println("2" == s2.trim()); // Trim Tira espaço
		System.out.println("2".equals(s2.trim()));
		
		entrada.close();
		
	}
}
