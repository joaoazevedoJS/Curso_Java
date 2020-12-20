package oo.composicao;

public class Carro {
	Motor motor;
	
	Carro(Motor motor) {
		this.motor = motor;
	}
	
	void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	void frear () {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	void motor(boolean ligar) {
		motor.ligado = ligar;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
