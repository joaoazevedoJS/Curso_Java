package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	String nome;
	ArrayList<Compra> compras;
	
	public Cliente(String nome, ArrayList<Compra> compras) {
		this.nome = nome;
		this.compras = compras;
	}
	
	public double obterValorTotalCompras() {
		double total = 0.0;
		
		for(Compra compra: compras) {
			total += compra.obterValorCompra();
		}
		
		return total;
	}
}
