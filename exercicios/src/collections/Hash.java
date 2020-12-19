package collections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Pedro"));
		usuarios.add(new Usuario("João"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Camila"));
		
		boolean resultado = usuarios.contains(new Usuario("João"));
		
		System.out.println(resultado);
		System.out.println(new Usuario("João").hashCode());
	}
}
