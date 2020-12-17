package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		// devemos informar o tamanho do array
		double[] notasAlunosA = new double[3]; 
		
		notasAlunosA[0] = 7.7;
		notasAlunosA[1] = 2.0;
		notasAlunosA[2] = 5.2;
		
		System.out.println(Arrays.toString(notasAlunosA));
		
		double totalAlunoA = 0;
		
		for(int i = 0; i < notasAlunosA.length; i++) {
			totalAlunoA += notasAlunosA[i];
		}
		
		System.out.println(totalAlunoA);
		
		double[] notasAlunosB = { 10.0, 4.5, 6.7, 8.5 };
		
		System.out.println(Arrays.toString(notasAlunosB));
	}
}
