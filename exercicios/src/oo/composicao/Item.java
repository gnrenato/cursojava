package oo.composicao;

//144 Relacionamento um para Muitos
public class Item {

	String nome;
	int quantidade;
	double preco;
	Compra compra;
	
	Item (String nome, int quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}
}
