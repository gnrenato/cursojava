package br.com.cod3r.cm.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

// 239 Classe Tabuleiro
public class Tabuleiro {

	private int linhas;
	private int colunas;
	private int minas;

	private final List<Campo> campos = new ArrayList<>();

	public Tabuleiro(int linhas, int colunas, int minas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.minas = minas;

		gerarCampos();
		associarVizinhos();
		sortearMinas();
	}

	public void abrir(int linha, int coluna) {
		try {
			campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
					.ifPresent(c -> c.abrir());
		} catch (Exception e) {
			// FIXME Ajusta implementação do metodo abrir
			campos.forEach(c -> c.setAberto(true));
			throw e;
		}
	}

	public void alternarMarcação(int linha, int coluna) {
		campos.parallelStream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna).findFirst()
				.ifPresent(c -> c.alternarMarcação());
	}

	private void gerarCampos() {
		for (int l = 0; l < linhas; l++) {
			for (int c = 0; c < colunas; c++) {
				campos.add(new Campo(l, c));
			}
		}
	}

	private void associarVizinhos() {
		for (Campo c1 : campos) {
			for (Campo c2 : campos) {
				c1.adicionarVizinho(c2);
			}
		}
	}

	private void sortearMinas() {
		long minasArmadas = 0;
		Predicate<Campo> minado = c -> c.isMinado();

		do {

			int aleatorio = (int) (Math.random() * campos.size()); // prioridade de cast utilizando () como na
																	// matematica
			campos.get(aleatorio).minar();
			minasArmadas = campos.stream().filter(minado).count();
		} while (minasArmadas < minas);
	}

	public boolean objetivoAlcancado() {
		return campos.stream().allMatch(c -> c.objetivoAlcancado());
	}

	public void reiniciar() {
		campos.stream().forEach(c -> c.reiniciar());
		sortearMinas();
	}


}
