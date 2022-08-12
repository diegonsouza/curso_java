package Lambdas;

@FunctionalInterface
public interface Calculo {

	double excutar (double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	static String muitoLegal() {
		return "Muito legal";
	}
	
}	
