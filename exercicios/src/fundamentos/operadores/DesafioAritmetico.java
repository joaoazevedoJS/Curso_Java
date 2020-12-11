package fundamentos.operadores;

public class DesafioAritmetico {
	public static void main(String[] args) {
		int calc01 = 6 * (3 + 2);
		double fracao01 = Math.pow(calc01, 2) / (3 * 2);
		
		double calc02 = (1 - 5) * (2 - 7) / 2;
		double fracao02 = Math.pow(calc02, 2);
		
		double subtracao = fracao01 - fracao02;
		double valor = Math.pow(subtracao, 3);
		double divisor = Math.pow(10, 3);
		
		int total = (int) valor / (int) divisor;
		
		System.out.println(total);
	}
}
