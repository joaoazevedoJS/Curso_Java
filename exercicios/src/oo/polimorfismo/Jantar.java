package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(98.15);
		
		Arroz ingrediente1 = new Arroz(0.80);
		Feijao ingrediente2 = new Feijao(0.80);
		Comida sobremesa = new Sorvete(0.250);		
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(sobremesa);

		System.out.println(convidado.getPeso());
	}
}
