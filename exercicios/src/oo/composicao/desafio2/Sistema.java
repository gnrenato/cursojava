package oo.composicao.desafio2;

public class Sistema {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem(new Produto("Caneta", 10), 10);
		
		Cliente cliente1 = new Cliente("Renato");
		cliente1.adicionarCompra(compra1);
		
		
		System.out.println(cliente1.nome);
		
		System.out.println(cliente1.obterValorTotal());
		cliente1.mostrarCompras();

	}
}
