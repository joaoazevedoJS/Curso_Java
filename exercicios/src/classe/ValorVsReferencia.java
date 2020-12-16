package classe;

public class ValorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // atribuição por valor (Tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(19, 6, 2020);
		Data d2 = d1; // atribuição por referência (Objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		System.out.println(d1.formatarData()); // 31/12/2020
		System.out.println(d2.formatarData()); // 31/12/2020
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.formatarData()); // 1/1/1970
		System.out.println(d2.formatarData()); // 1/1/1970
		
		int c = 5;
		
		alterarPadrao(c);
		
		System.out.println(c);// 5
	}
	
	static void voltarDataParaValorPadrao(Data date) {
		// vai alterar o valor da referência
		date.dia = 1;
		date.mes = 1;
		date.ano = 1970;
	}
	
	static void alterarPadrao(int variable) {
		variable++;
	}
}
