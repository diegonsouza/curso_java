package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Pista {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(400) ;
		
		ferrari.ligarTurbo();
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		ferrari.acelerar();
		System.out.println(ferrari);
		
		Civic civic = new Civic();
		
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		civic.acelerar();
		System.out.println(civic);
		
				
		
	}
}
