package collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		// vai adicionar no MAP e caso for repetido vai substituir
		usuarios.put(1, "Roberto");
		usuarios.put(1, "João Azevedo");
		usuarios.put(2, "Matheus");
		
		System.out.println(usuarios);
		
		System.out.println(usuarios.keySet()); // pegar somente as chaves
		System.out.println(usuarios.values()); // pegar somente os valores
		System.out.println(usuarios.entrySet()); // pegar chaves e valores
	}
}
