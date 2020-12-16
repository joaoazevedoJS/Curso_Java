package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data date1 = new Data(16, 12, 2020);
		
		Data date2 = new Data();
		
		date2.dia = 25;
		
		System.out.printf("Hoje é %s %n", date1.formatarData());
		System.out.printf("Falta apenas %d dias para o dia 25 %n", date2.dia - date1.dia);
		System.out.println(date2.formatarData());
	}
}
