package arrays;

public class Foreach {
	public static void main(String[] args) {
		double[] notas = { 10, 4.5, 6.7, 8.5 };
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		
		for(double nota: notas) {
			System.out.println(nota);
		}
	}
}
