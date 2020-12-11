package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		final Scanner SCANNER = new Scanner(System.in);
		
		System.out.print("Digite salário 1: ");
		String funcionario1 = SCANNER.nextLine().replace(",", ".");
		
		System.out.print("Digite salário 1: ");
		String funcionario2 = SCANNER.nextLine().replace(",", ".");
		
		System.out.print("Digite salário 1: ");
		String funcionario3 = SCANNER.nextLine().replace(",", ".");
		
		Double salario1 = Double.parseDouble(funcionario1);
		Double salario2 = Double.parseDouble(funcionario2);
		Double salario3 = Double.parseDouble(funcionario3);
		
		final Double SALARIOS = salario1 + salario2 + salario3;
		final Double MEDIA = SALARIOS / 3;
		
		System.out.printf("Media do salário: %.2f", MEDIA);
		
		SCANNER.close();
	}
}
