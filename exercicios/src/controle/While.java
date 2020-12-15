package controle;

import java.util.Scanner;

public class While {
	public static void main(String[] args) {
		final Scanner KEYBOARD = new Scanner(System.in);
		
		String response = "";
		int line = 1;
		
		while(!response.equalsIgnoreCase("sair")) {
			System.out.printf("Linha %d: ", line);
			
			response = KEYBOARD.nextLine();
		
			line++;
		}
		
		System.out.println("Programa finalizado!");
		
		KEYBOARD.close();
	}
}
