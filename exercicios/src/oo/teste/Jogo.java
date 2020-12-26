package oo.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;
import oo.heranca.Monstro;

public class Jogo {
	public static void main(String[] args) {
		Monstro  monstro = new Monstro();
		Jogador heroi = new Heroi(10, 10);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		
		monstro.atacar(heroi);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
	}
}
