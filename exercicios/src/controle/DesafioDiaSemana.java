package controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		// Domingo - 1 ... Sabado - 7
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Digite a semana: ");
		
		String semana = keyboard.nextLine().trim().replace("ç", "c");
		
		if("domingo".equalsIgnoreCase(semana)) {
			System.out.println(1);
		} else if("segunda".equalsIgnoreCase(semana)) {
			System.out.println(2);
		} else if("terca".equalsIgnoreCase(semana)) {
			System.out.println(3);
		} else if("quarta".equalsIgnoreCase(semana)) {
			System.out.println(4);
		} else if("quinta".equalsIgnoreCase(semana)) {
			System.out.println(5);
		} else if("sexta".equalsIgnoreCase(semana)) {
			System.out.println(6);
		} else {
			System.out.println(7);			
		}
		
		keyboard.close();
	}
}
