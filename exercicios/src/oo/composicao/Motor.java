package oo.composicao;

// 143 - Relacionamento Um pra Um - pode ser unidericional ou biderecional.
public class Motor {

	final Carro carro; // para manter seguro definimos como uma constante
	boolean ligado = false;
	double fatorInjecao = 1;

	Motor (Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
