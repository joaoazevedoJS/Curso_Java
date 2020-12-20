package oo.composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Motor motor = new Motor();
		
		Carro c1 = new Carro(motor);
		
		System.out.println(c1.estaLigado());
		
		c1.motor(true);
		
		System.out.println(c1.estaLigado());
		
		System.out.println(c1.motor.giros());
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();

		System.out.println(c1.motor.giros());

		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		System.out.println(c1.motor.giros());

		c1.motor(false);
		
		System.out.println(c1.motor.giros());
	}
}
