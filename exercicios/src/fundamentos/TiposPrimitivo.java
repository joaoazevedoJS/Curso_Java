package fundamentos;

public class TiposPrimitivo {
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos numéricos inteiros
		
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 32767;
		int id = 56789; 
		long pontosAcumulados1 = 4_134_845_233L;
		long pontosAcumulados2 = 4134845233L;
		
		// Tipos numéricos reais
		
		float salario = 11445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
	
		// Tipo booleano
		
		boolean estaDeFerias = false;
		boolean estaHomeOffice = true;
	
		// Tipo caractere
		
		char status = 'A'; // ativo
		char tabelaUnicode = '\u0010';
		
		// Dias de empresa
		
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
	
		// Número de viagens
		
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por Real
		
		System.out.println(pontosAcumulados1 / vendasAcumuladas);
	
		System.out.println(pontosAcumulados2 / vendasAcumuladas);
		
		// Funcionario
		
		System.out.println(id + ": ganha " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status? " + status);
		
		System.out.println("Está home office? " + estaHomeOffice);
		
		System.out.println(tabelaUnicode);
	}
}
