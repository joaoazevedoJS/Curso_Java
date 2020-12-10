package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		Byte bt = 100;
		Short sht = 1000;
		Integer intg = 10000; // int
		Long lng = 100000L;
		
		System.out.printf("%d; %d; %d; %d %n%n", bt, sht, intg, lng);
		
		Float flt = 132.10F;
		Double dbl = 1234.5678;
		
		System.out.printf("%.2f; %.3f %n%n", flt, dbl);
	
		Boolean bool = Boolean.parseBoolean("true");
		
		System.out.println(bool);
		
		Character chr = '#'; // char
		System.out.println("C" + chr);
	}
}
