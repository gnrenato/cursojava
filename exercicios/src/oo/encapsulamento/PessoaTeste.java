package oo.encapsulamento;

// 166 Getter/Setter
public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa(30, "Renato");
		// p1.idade = -10; // alterar o valor da variavel
		
		p1.setIdade(-20);
		p1.setNome("Amanda");
		
		System.out.println(p1.getIdade()); // acessamos/lemos o valor da variavel
		System.out.println(p1.getNome());
		System.out.println(p1); // toString
	}
}
