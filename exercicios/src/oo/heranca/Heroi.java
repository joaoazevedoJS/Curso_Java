package oo.heranca;

public class Heroi extends Jogador {
	public Heroi(int positionX, int positionY) {
		super(positionX, positionY);
	}
	
	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2;
	}
}
