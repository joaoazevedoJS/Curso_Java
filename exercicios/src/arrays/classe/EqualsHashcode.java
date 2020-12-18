package arrays.classe;

public class EqualsHashcode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario("João Azevedo", "joao.azevedo@fakemail.com");
		Usuario u2 = new Usuario("João Azevedo", "joao.azevedo@fakemail.com");
	
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
	}
}
