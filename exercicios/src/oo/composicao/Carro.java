package oo.composicao;

public class Carro {
	public Motor motor;
	
	public Carro(Motor motor) {
		this.motor = motor;
	}
	
	public void acelerar() {
		if(motor.fatorInjecao < 2.6) {
			motor.fatorInjecao += 0.4;
		}
	}
	
	public void frear () {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;
		}
	}
	
	public void motor(boolean ligar) {
		motor.ligado = ligar;
	}
	
	public boolean estaLigado() {
		return motor.ligado;
	}
}
