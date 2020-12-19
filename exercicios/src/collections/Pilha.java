package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.push("O Pequeno Príncipe");
		livros.push("Don quixote");
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());
		
		System.out.println(livros.pop());
		
		System.out.println(livros);
	}
}
