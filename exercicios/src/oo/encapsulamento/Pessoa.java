package oo.encapsulamento;

//166 Getter/Setter
public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(int idade, String nome) {
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	// Getter
	public int getIdade() {
		return idade;
	}

	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}

	public String toString() {
		return "Nome: " + getNome() + "\nIdade: " + getIdade();
	}
}
