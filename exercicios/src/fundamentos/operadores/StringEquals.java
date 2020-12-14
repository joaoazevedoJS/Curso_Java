package fundamentos.operadores;

import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2"); // true
		
		String string1 = new String("2");
		
		System.out.println(string1 == "2"); // false
		System.out.println("2".equals(string1)); // true
		
		Scanner keyboard = new Scanner(System.in);
		
		String string2 = keyboard.nextLine();
		
		System.out.println(string2.trim() == "2"); // false
		System.out.println(string2.trim().equals("2")); // true

		System.out.println("2" == string2.trim()); // false
		System.out.println("2".equals(string2.trim())); // true
		
		keyboard.close();
	}
}
