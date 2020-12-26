package oo.heranca;

public class Jogador {
	public int vida = 100;
	protected int positionX;
	protected int positionY;

	public Jogador(int positionX, int positionY) {
		this.positionX = positionX;
		this.positionY = positionY;
	}
	
	public boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(positionX - oponente.positionX);
		int deltaY = Math.abs(positionY - oponente.positionY); 
		
		if(deltaX == 0 && deltaY == 1 || deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			
			return true;
		} 
		
		return false;
	}
	
	public boolean andar(Direcao direcao) {
		switch (direcao) {
			case NORTE: 
				positionY--;
				break;
			case LESTE:
				positionX++;
				break;
			case SUL: 
				positionY++;
				break;
			case OESTE: 
				positionX--;
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + direcao);
		}
		
		return true;
	}
}
