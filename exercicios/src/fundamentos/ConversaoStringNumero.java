package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("Digite um numero:");
		
		String b = JOptionPane.showInputDialog("Digite um segundo numero:");
		
		System.out.println(a);
		System.out.println(b);
		
		double numero1 = Double.parseDouble(a);
		double numero2 = Double.parseDouble(b);
		
		double soma = numero1 + numero2;
		
		System.out.println("A soma e: " + soma);
		System.out.println("A media e: " + soma / 2);
	}
}
