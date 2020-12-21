package oo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
		Carro ferrari = new Ferrari();
		Carro civic = new Civic();
		
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.frear();
		
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		civic.frear();
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
	}
}
