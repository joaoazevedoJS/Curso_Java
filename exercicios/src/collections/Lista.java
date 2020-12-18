package collections;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<Usuario>();
		
		Usuario u1 = new Usuario("Joao");
		
		lista.add(u1);
		lista.add(new Usuario("Ana"));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
		}
		
		System.out.println(lista.get(1));
	}
}
