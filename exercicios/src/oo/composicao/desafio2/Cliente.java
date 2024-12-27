package oo.composicao.desafio2;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compra = new ArrayList<Compra>();

	Cliente(String nome) {
		this.nome = nome;
	}

	void adicionarCompra(Compra compra) {
		this.compra.add(compra);
	}

	double obterValorTotal() {
		double total = 0;

		for (Compra compra : compra) {
			total += compra.obterValorTotal();
		}

		return total;
	}

	void mostrarCompras() {

		for (Compra compra2 : compra) {
			System.out.println(compra2);
		}
	}
}
