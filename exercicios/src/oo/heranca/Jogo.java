package oo.heranca;

// 154 Enum
public class Jogo {

	public static void main(String[] args) {

		Jogador j1 = new Jogador();

		j1.andar(Direcao.NORTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.LESTE);
		j1.andar(Direcao.OESTE);
		j1.andar(Direcao.NORTE);

		System.out.println(j1.y);
		System.out.println(j1.x);
	}
}
