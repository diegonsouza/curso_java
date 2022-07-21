package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar(){
		return("Ola meu nome e " + nome + " e tenho " + peso + "Kgs.");
	}
}
