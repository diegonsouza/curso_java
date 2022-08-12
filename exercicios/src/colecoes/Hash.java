package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("Gui"));
		usuarios.add(new Usuario("Ana"));
		
		boolean resultado = usuarios.contains(new Usuario("Gui"));
		System.out.println(resultado);		
	}
}
