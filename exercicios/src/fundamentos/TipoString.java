package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		// String é imultavel!
		
		String talk = "Hello world";

		talk.toUpperCase(); 

		System.out.println(talk);

		talk = talk.toLowerCase();

		System.out.println(talk); 
		
		// ----------------------- Method --------------------------- //
		
		String string = "Bom dia meus jovens"; 
		
		System.out.println(string.charAt(4));

		System.out.println(string.startsWith("Bom dia"));
		System.out.println(string.startsWith("bom dia"));
		
		System.out.println(string.endsWith("dia!"));
		
		System.out.println(string.length());
		
		string = "Boa tarde!";
		
		System.out.println(string.equals("boa tarde!"));
		System.out.println(string.equalsIgnoreCase("boa tarde!"));
		
		var nome = "João";
		var sobrenome = "Azevedo";
		var idade = 20;
		var salario = 5000.00;
		
		System.out.printf("Menu nome é %s %s e tenho %d anos. Queria ter um salário de R$ %.2f", nome, sobrenome, idade, salario);

		talk = String.format("\nMenu nome é %s %s e tenho %d anos. Queria ter um salário de R$ %.2f", nome, sobrenome, idade, salario);
	
		System.out.println(talk);
		
		System.out.println(talk.contains("João"));
		
		System.out.println(talk.indexOf("João"));
	}
}
