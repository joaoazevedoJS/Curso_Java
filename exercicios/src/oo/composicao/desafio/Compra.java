package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	ArrayList<Item> itens;
	
	public Compra(ArrayList<Item> itens) {
		this.itens = itens;
	}
	
	public double obterValorCompra() {
		double total = 0.0;
		
		for (Item item : itens) {
			total += item.qtde * item.produto.preco;
		}
		
		return total;
	}
	
	public void adicionarItem(Item item) {
		itens.add(item);
	}
}
