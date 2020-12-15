package controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int notasValidas = 0;
		double total = 0;
		String resposta = "";
		
		while(!resposta.equalsIgnoreCase("sair")) {
			System.out.print("Digite uma nota ou escreva sair para fechar programa: ");
			
			resposta = keyboard.nextLine();
			
			if(!resposta.equalsIgnoreCase("sair")) {
				double nota = Double.parseDouble(resposta);
				
				boolean isNotaValida = nota >= 0 && nota <= 10; 
				
				if(isNotaValida) {
					notasValidas++;
					
					total += nota;
				}  else {
					System.out.println("Nota inválida, digite novamente!!!");
				}
				
				System.out.println();
			}
		}
		
		keyboard.close();
		
		System.out.printf("Notas validas: %d %n", notasValidas);
		System.out.printf("Total: %.2f %n", total);
		System.out.printf("media: %.2f", total / notasValidas);
		
		System.out.println("\nPrograma finalizado!");
	}
}
