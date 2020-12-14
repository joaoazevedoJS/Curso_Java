package fundamentos;

import javax.swing.JOptionPane;

public class DesafioCalc {
	public static void main(String[] args) {
		// Fazer sem o if
		// Ler num1
		// Ler num2
		// + - * / %
		
		String num1 = JOptionPane.showInputDialog("Digite um número: ");
		String num2 = JOptionPane.showInputDialog("Digite outro número: ");
		String operador = JOptionPane.showInputDialog("Operador: ");
		
		Double value01 = Double.parseDouble(num1.replace(",", "."));
		Double value02 = Double.parseDouble(num2.replace(",", "."));	
		
		boolean soma = operador.equals("+");
		boolean sub = operador.equals("-");
		boolean mult = operador.equals("*");
		boolean div = operador.equals("/");
		boolean modulo = operador.equals("%");
		
		Double result = soma ? value01 + value02 
							: sub ? value01 - value02 
								: mult ? value01 * value02 
									: div ? value01 / value02 
										: modulo ? value01 % value02 : 0;
		
		System.out.printf("Resultado %.2f", result);
	}
}
