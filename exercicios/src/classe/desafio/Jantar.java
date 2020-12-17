package classe.desafio;

public class Jantar {
	public static void main(String[] args) {
		Comida comida01 = new Comida("Arroz com Feij�o", 0.160);
		Comida comida02 = new Comida("Escondidinho", 0.430);
		
		Pessoa Joao = new Pessoa("Jo�o Azevedo", 94.20);
		
		System.out.println(Joao.verificarPeso());

		Joao.comer(comida01);
		Joao.comer(comida02);
		
		System.out.println(Joao.verificarPeso());
	}
}
