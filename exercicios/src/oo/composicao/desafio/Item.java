package oo.composicao.desafio;

public class Item {
	int qtde;
	Produto produto;
	
	public Item(Produto produto) {
		this(1, produto);
	}
	
	public Item(int qtde, Produto produto) {
		this.qtde = qtde;
		this.produto = produto;
	}
}
