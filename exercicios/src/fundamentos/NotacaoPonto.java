package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String morning = "Bom dia, X";
		
		morning.toUpperCase();
		
		System.out.println(morning);
		
		morning = morning.toUpperCase();
		
		System.out.println(morning);
		
		String morningMale = morning.replace("X", "Senhor!");

		System.out.println(morningMale);
		
		String morningFamele = morning.replace("X", "Senhora");
		
		morningFamele = morningFamele.concat("!!!")
							.toUpperCase();
		
		System.out.println(morningFamele);
		
		// Tipos primitivos não tem a notação ponto!
		
		int points = 3;
		
		String game = "Total de Pontos: ".concat(Integer.toString(points));
		
		// points.

		System.out.println(game);
	}
}
