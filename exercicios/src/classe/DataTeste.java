package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data date1 = new Data();
		
		date1.dia = 15;
		date1.mes = 12;
		date1.ano = 2020;
		
		Data date2 = new Data();
		
		date2.dia = 25;
		date2.mes = 12;
		date2.ano = 2020;
		
		System.out.printf("Hoje é %d/%d/%d %n", date1.dia, date1.mes, date1.ano);
		System.out.printf("Falta apenas %d dias para o natal", date2.dia - date1.dia);
	}
}
