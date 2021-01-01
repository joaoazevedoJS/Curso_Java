package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		BinaryOperator<Double> soma = (num1, num2) -> {
			return num1 + num2;
		};
		
		System.out.println(soma.apply(2.1, 3.1));
		
		soma = (num1, num2) -> num1 * num2;
		
		System.out.println(soma.apply(4.1, 4.0));
	}
}
