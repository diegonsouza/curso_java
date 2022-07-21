package fundamentos;

public class PrimitivoVsObjetos {

	
	public static void main(String[] args) {
		
		String s = "É uma classe";
		s.toUpperCase();
		
		String b = new String ("E uma classe");
		b.toUpperCase();
		
		//Wrappers são a versão objeto dos tipos primitivos!
		int a = 123;
		System.out.println(a);
		
	
	}
}
