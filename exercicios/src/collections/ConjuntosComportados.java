package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntosComportados {
	public static void main(String[] args) {
		// Essa lista vai so aceitar strings
		Set<String> listaDeStrings1 = new HashSet<String>();
		
		listaDeStrings1.add("Matheus");
		listaDeStrings1.add("João");
		listaDeStrings1.add("Ana");
		//	listaDeStrings.add(1.2);
		
		System.out.println("lista 01: ");
		for(String string: listaDeStrings1) {			
			System.out.println(string);
		}
		
		System.out.println();
		
		// Lista ordenada 
		SortedSet<String> listaDeStrings2 = new TreeSet<String>();
			
		listaDeStrings2.addAll(listaDeStrings1);
		
		System.out.println("lista 02: ");
		
		for(String string: listaDeStrings2) {			
			System.out.println(string);
		}
	}
}
