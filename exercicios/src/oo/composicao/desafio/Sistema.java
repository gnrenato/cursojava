package oo.composicao.desafio;

// 147 desafio composição
public class Sistema {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionatItem("Caneta", 9.67, 100);
		compra1.adicionatItem(new Produto("Notebook", 1897.88), 2);

		Compra compra2 = new Compra();
		compra1.adicionatItem("Caderno", 10, 10);
		compra1.adicionatItem(new Produto("Impressora", 998.90), 1);

		Cliente cliente = new Cliente("Maria Julia");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);

		System.out.println(cliente.obterValorTotal());

	}
}
