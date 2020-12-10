package fundamentos;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		// Formula = (ºF - 32) * 5/9 = ºC
		
		Scanner scan = new Scanner(System.in); 
				
		final int AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		System.out.print("Digite uma temperatura em fahrenheit: ");
		
		final String INPUT = scan.nextLine();
		
		scan.close();
		
		final double FAHRENHEIT = Double.parseDouble(INPUT);
	
		final double CELSIUS = (FAHRENHEIT - AJUSTE) * FATOR;
		
		System.out.println("Fahrenheit de " + FAHRENHEIT + " em celsius é " + CELSIUS);
	}
}
