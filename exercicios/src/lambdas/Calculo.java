package lambdas;

@FunctionalInterface
public interface Calculo {
	public abstract double executar(double a, double b);
	
	default double Soma(double x, double y) {
		return x + y;
	}
	
	static String muitoLegal() {
		return "Muito legal!";
	}
}
