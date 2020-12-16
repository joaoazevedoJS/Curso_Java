package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc circ1 = new AreaCirc(7.8);
		AreaCirc circ2 = new AreaCirc(7.8);
		
		AreaCirc.pi = 3.141516;
		
		System.out.println(circ1.area());
		System.out.println(circ2.area());

		circ1.pi = 3.14;
		
		System.out.println(circ1.area());
		System.out.println(circ2.area());
	}
}
