package oo.encapsulamento;

public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;
	
	
	public Pessoa(String nome,String sobreNome, int idade){
		setNome(nome);
		setSobrenome(sobreNome);
		setIdade(idade);
}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobreNome) {
		this.sobrenome = sobreNome;
	}
	
	public String getNomeCompleto() {
		return getNome() + " " + getSobrenome() + " ";
	}
	
	//Getter
	public int getIdade() {
		return idade;
	}
	
	//Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	@Override
	public String toString() {
		return "Ola eu sou o " + getNome() + " e tenho " + getIdade() + " anos.";
	}
}
