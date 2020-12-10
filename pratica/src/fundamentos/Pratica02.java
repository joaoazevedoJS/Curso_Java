package fundamentos;

import java.util.Scanner;

public class Pratica02 {
	public static void main(String[] args)  {
		final Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		final String number01 = scanner.nextLine();
	
		System.out.println(""); 
		System.out.println("");  
		
		System.out.println("1) Soma");
		System.out.println("2) Subtração");
		System.out.println("3) Multiplicão");
		System.out.println("4) Divisão");
		System.out.print("Digite a operação: ");
		
		final String typeCalc = scanner.nextLine();
		
		System.out.println(""); 
		System.out.println(""); 
		
		System.out.print("Digite um número: ");
		
		final String number02 = scanner.nextLine();
		
		System.out.println(""); 
		System.out.println(""); 
		System.out.println(""); 
		System.out.println(""); 
		System.out.println(""); 
		System.out.println(""); 
		
		double numberParsed01 = Double.parseDouble(number01);
		double numberParsed02 = Double.parseDouble(number02);
		double resultado = 0.0;
		
		if(typeCalc.contains("1")) {
			resultado = numberParsed01 + numberParsed02;
		} else if (typeCalc.contains("2")) {
			resultado = numberParsed01 - numberParsed02;
		} else if (typeCalc.contains("3")) {
			resultado =  numberParsed01 * numberParsed02;
		} else if (typeCalc.contains("4")) {
			resultado = numberParsed01 / numberParsed02;
		} else {
			System.out.print("Error!" + typeCalc == "1");
			return;
		}
		
		System.out.println("Resultado: " + resultado);
		
		
	}	
}
