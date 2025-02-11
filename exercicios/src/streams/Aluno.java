package streams;

//203 Filter 2
public class Aluno {

	final String nome;
	final double nota;
	final boolean bomComportmento;

	public Aluno(String nome, double nota) {
		this(nome, nota, true);
	}

	public Aluno(String nome, double nota, boolean bomComportmento) {
		this.nome = nome;
		this.nota = nota;
		this.bomComportmento = bomComportmento;
	}

}
