package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		boolean trabalho1 = false;
		boolean trabalho2 = true;
		
		System.out.println("Comprou tv de 32? " + (trabalho1 ^ trabalho2));
		System.out.println("Comprou tv de 50? " + (trabalho1 && trabalho2));
		System.out.println("Tomou sorverte? " + (trabalho1 || trabalho2));
		System.out.println("Ficou saudável? " + !(trabalho1 || trabalho2));
	}
}
