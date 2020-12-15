package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		
		p1.nome = "Notebook";
		p1.preco = 2334.32;
		p1.desconto = 0.25;
		
		final String DESC = p1.desconto.toString().replace("0.", "");
		
		System.out.printf(
					"O produto: '%s' está com um mega desconto de %s%% saindo pelo bargatela de %.2f", 
					p1.nome, DESC, p1.preco * (1 - p1.desconto)
				);
	}
}
