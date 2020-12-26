package lambdas;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo soma = (num1, num2) -> {
			return num1 + num2;
		};
		
		System.out.println(soma.executar(2, 3));
		
		soma = (num1, num2) -> num1 * num2;
		
		System.out.println(soma.executar(4, 4));
	}
}
