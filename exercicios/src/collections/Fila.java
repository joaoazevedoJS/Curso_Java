package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Ana");
		
		fila.offer("Bia");
		
		System.out.println(fila);
	}
}
