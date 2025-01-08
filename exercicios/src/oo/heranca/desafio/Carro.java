package oo.heranca.desafio;
//desafio heranca 01 e 02
public class Carro {

	protected final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	protected int delta = 5;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}

	public void acelerar() {
		if (velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {
			velocidadeAtual += delta;
		}
	}

	public void frear() {
		if (velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}

	public String toString() {
		return "Velocidade Atual: " + velocidadeAtual + "Km/h";
	}
}
