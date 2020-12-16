package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto("Notebook", 2334.32);
		
		Produto p2 = new Produto();
		p2.nome = "Teste";
		p2.preco = 2933.23;
		
		Produto.desconto = 0.55;
		
		final String DESC = Produto.desconto.toString().replace("0.", "");
		
		System.out.printf(
			"O produto: '%s' está com um mega desconto de %s%% saindo pelo bargatela de %.2f %n", 
			p1.nome, DESC, p1.precoComDesconto()
		);

		System.out.printf(
			"O produto: '%s' está com um mega desconto ESPECIAL de %s%% saindo pelo bargatela de %.2f %n", 
			p1.nome, 45, p1.precoComDesconto(0.45)
		);
		
		System.out.printf(
			"O produto: '%s' está com um mega desconto ESPECIAL de %s%% saindo pelo bargatela de %.2f", 
			p2.nome, DESC, p2.precoComDesconto()
		);
	}
}
