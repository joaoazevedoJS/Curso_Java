package oo.composicao;

public class Motor {
	protected boolean ligado = false;
	protected double fatorInjecao = 1;
	
	public int giros() {
		if(!ligado) return 0;
		
		return (int) Math.round(fatorInjecao * 3000);
	}
}
