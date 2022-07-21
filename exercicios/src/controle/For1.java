package controle;

public class For1 {

	public static void main(String[] args) {
		
		int contador = 1;
		
		while(contador <= 5) {
			System.out.printf("i = %d\n", contador);
			contador ++;
			}
		
		for(int contar = 0;contar <= 5; contar ++) {
			System.out.printf("e = %d\n",contar);
		}
		/*
		 * Laço infinito!!
		 * for (;;){
		 * 	System.out.println ("Fim!);
		 * }
		 */
	}
}
