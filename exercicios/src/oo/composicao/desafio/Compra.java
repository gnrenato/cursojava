package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

//147 desafio composição
public class Compra {

	final List<Item> itens = new ArrayList<Item>();

	void adicionatItem(Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}

	void adicionatItem(String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}

	double obterValorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.produto.preco;
		}

		return total;
	}
}
