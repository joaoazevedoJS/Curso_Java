package fundamentos;

import java.util.Scanner;

public class Pratica02 {
	public static void main(String[] args)  {
		final Scanner SCANNER = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		
		final String NUMBER01 = SCANNER.nextLine();
	
		System.out.println(""); 
		System.out.println("");  
		
		System.out.println("1) Soma");
		System.out.println("2) Subtração");
		System.out.println("3) Multiplicão");
		System.out.println("4) Divisão");
		System.out.print("Digite a operação: ");
		
		final String TYPECALC = SCANNER.nextLine();
		
		System.out.println(""); 
		System.out.println(""); 
		
		System.out.print("Digite um número: ");
		
		final String NUMBER02 = SCANNER.nextLine();
		
		SCANNER.close();
		
		System.out.println(""); 
		System.out.println(""); 
		System.out.println(""); 
		System.out.println(""); 
		System.out.println(""); 
		System.out.println(""); 
		
		double numberParsed01 = Double.parseDouble(NUMBER01);
		double numberParsed02 = Double.parseDouble(NUMBER02);
		double resultado = 0.0;
		
		if(TYPECALC.contains("1")) {
			resultado = numberParsed01 + numberParsed02;
		} else if (TYPECALC.contains("2")) {
			resultado = numberParsed01 - numberParsed02;
		} else if (TYPECALC.contains("3")) {
			resultado =  numberParsed01 * numberParsed02;
		} else if (TYPECALC.contains("4")) {
			resultado = numberParsed01 / numberParsed02;
		} else {
			System.out.print("Error!");
			return;
		}
		
		System.out.println("Resultado: " + resultado);
		
		
	}	
}
