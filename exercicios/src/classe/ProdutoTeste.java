package classe;

public class ProdutoTeste {
	// 93 - Classe Produto
	public static void main(String[] args) {

		// utilizando construtor criado com parametros
		Produto p1 = new Produto("Notebook", 4356.89); // instancia de produto

		// Utilizando construtor sem utilizar parametro
		var p2 = new Produto(); // instancia de produto
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;

		double precoFinal1 = p1.precoComDesconto(); // Chamando o metodo
		double precoFinal2 = p2.precoComDesconto(); // Chamando o metodo
		System.out.println(p1.nome);
		System.out.printf("R$ %.2f\n", precoFinal1);
		System.out.println(p2.nome);
		System.out.printf("R$ %.2f\n", precoFinal2);

		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

		System.out.printf("A media do carrinho é R$ %.2f", mediaCarrinho);
		
		// 107 - Desafio Membros de Classe vs Instância
		Produto.desconto = 0.30; // mudança de valor do membro da classe
		
		precoFinal1 = p1.precoComDesconto(); // Chamando o metodo
		precoFinal2 = p2.precoComDesconto(); // Chamando o metodo
		
		System.out.println(p1.nome);
		System.out.printf("R$ %.2f\n", precoFinal1);
		System.out.println(p2.nome);
		System.out.printf("R$ %.2f\n", precoFinal2);


	}
}
