package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5; // declaração e inicialização
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "..." // Error
		
		// A inferência pega o tipo da variável a partir do valor
		var b = 7.7;
		
		System.out.println(b);
		
		// c é do tipo String
		var c = "Texto";
		System.out.println(c);

		c = "Outro Texto";
		System.out.println(c);
		
		// c = 4.5 // Error
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inserida
		System.out.println(d); // variável foi usada
	}
}
