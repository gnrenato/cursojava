package classe;

public class Produto {
	// 93 - Classe Produto
	String nome;
	double preco;
	double desconto;

	// 98 - Metodos 02
	// abaixo temos um metodo onde é calculado o valor do desconto;
	double precoComDesconto() {

		double descontoProduto = preco * (1 - (desconto));
		return descontoProduto;
	}

	// Podemos criar um metodo com o mesmo nome desde que os parametros sejam diferentes. 
	double precoComDesconto(double descontoDoGerente) {

		double descontoProduto = preco * (1 - (desconto + descontoDoGerente));
		return descontoProduto;
	}

}
