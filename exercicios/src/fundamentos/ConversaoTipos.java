package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoTipos {
	public static void main(String[] args) {
		// Número & String
		
		Integer num1 = 10000;
		
		System.out.println(num1.toString().length());
		
		int num2 = 10000;
		
		System.out.println(Integer.toString(num2));
		
		// String to Number
		
		String valor01 = JOptionPane.showInputDialog("DIgite o primeiro número: ");
		String valor02 = JOptionPane.showInputDialog("Digite outro número");
		
		double numero01 = Double.parseDouble(valor01);
		double numero02 = Double.parseDouble(valor02);
		
		double resultado = numero01 + numero02;
		
		System.out.println("Soma = " + resultado);
	}
}
