package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosBangucados {
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
	}
}
