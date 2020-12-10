package fundamentos;

import java.util.Scanner;

public class Pratica01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Digite uma mensagem: ");
		
		String i = sc.nextLine();
		
		System.out.println(i);
		
		sc.close();
	}	
}
