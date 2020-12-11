package fundamentos.operadores;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao01 = true;
		boolean condicao02 = 4 > 7;
		
		System.out.println(condicao01 && condicao02);
		System.out.println(condicao01 || condicao02);
		System.out.println(condicao01 ^ condicao02); // sgnifica diferente
		System.out.println(!condicao01 ^ condicao02); // false !== false = false
	}
}
