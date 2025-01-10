package oo.encapsulamento;

//166 Getter/Setter
public class Pessoa {

	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa(String nome, String sobrenome, int idade) {
		setNome(nome);
		setSobrenome(sobrenome);
		setIdade(idade);
	}

	public String getSobrenome() { // mostra informação
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) { // altera informação
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() { // get sem atributo definido
		return "Nome Completo: " + getNome() + " " + getSobrenome();
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
