package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		
		String name = console.nextLine();
		
		System.out.printf("%nNome: %s", name);
		
		console.close();
	}
}
