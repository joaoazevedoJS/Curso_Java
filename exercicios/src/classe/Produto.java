package classe;

public class Produto {
	// Atributos
	String nome;
	Double preco;
	static Double desconto = 0.25;
	
	Produto() {
		
	}
	
	Produto(String Nome, Double Preco){
		nome = Nome;
		preco = Preco;
	}
	
	Double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	Double precoComDesconto(double descontoEspecial) {
		return preco * (1 - descontoEspecial);
	}
}


