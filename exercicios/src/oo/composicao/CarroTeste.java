package oo.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
				
		System.err.println(c1.estaLigado());
		
		c1.ligar();
		System.err.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		
		System.out.println(c1.motor.giros());
		
		c1.frear();
		
		//Faltou Encapsulamento!
		//c1.motor.fatorInsjecao = -30;
		
		System.out.println(c1.motor.giros());
		
		//Relação bidirecional 
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
	}
}
