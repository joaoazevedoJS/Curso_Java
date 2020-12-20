package oo.composicao.desafio;

import java.util.ArrayList;

public class ClienteTeste {
	public static void main(String[] args) {
		ArrayList<Item> itensCompra1 = new ArrayList<Item>();
		ArrayList<Item> itensCompra2 = new ArrayList<Item>();
		
		Produto p1 = new Produto("Notebook", 4332.21);
		Produto p2 = new Produto("Cardeno", 22.72);
		Produto p3 = new Produto("Caneta", 2.10);
		Produto p4 = new Produto("Estojo", 12.50);
		
		itensCompra1.add(new Item(p1));
		itensCompra1.add(new Item(2, p2));
		itensCompra1.add(new Item(5, p3));
		
		itensCompra2.add(new Item(2, p3));
		itensCompra2.add(new Item(2, p4));
		
		ArrayList<Compra> compras = new ArrayList<Compra>();
		
		Compra c1 = new Compra(itensCompra1);
		Compra c2 = new Compra(itensCompra2);
		
		compras.add(c1);
		compras.add(c2);
	
		System.out.println(c1.obterValorCompra());
		System.out.println(c2.obterValorCompra());

		Cliente cliente = new Cliente("João Azevedo", compras);
		
		System.out.println(cliente.obterValorTotalCompras());
	}
}
