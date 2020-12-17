package arrays;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Quantas notas você deseja digitar? ");
		
		int qtdNotas = keyboard.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.printf("Digite a nota %d: ", i + 1);
			
			notas[i] = keyboard.nextDouble();
		}
		
		double total = 0;
		
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.printf("Media dos alunos é de %.2f", total / notas.length);
		
		keyboard.close();
	}
}
