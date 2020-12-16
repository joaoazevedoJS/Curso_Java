package classe;

public class AreaCirc {
	double raio;
	static double pi = 3.1415;
	
	AreaCirc(double Raio) {
		raio = Raio;
	}
	
	double area() {
		return pi * Math.pow(raio, 2);
	}
}
