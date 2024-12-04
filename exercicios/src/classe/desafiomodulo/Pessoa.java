package classe.desafiomodulo;

//117 Desafio Modulo
public class Pessoa {

	String nome;
	double peso;

	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}

	double comer(double pesoComida) {
		return this.peso + pesoComida;
	}

	void comer(Comida comida) {
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
}
