package classe.desafio;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		this.peso += comida.peso;
	}
	
	String verificarPeso() {
		return String.format("No momento estou pesando %.2f quilos", this.peso);
	}
}
