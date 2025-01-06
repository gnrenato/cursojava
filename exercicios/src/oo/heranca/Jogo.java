package oo.heranca;

// 154 Enum
//155 - Heranca 01
//156 - Heranca 02
public class Jogo {

	public static void main(String[] args) {

		Jogador monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Monstro tem " + monstro.vida + " vida");
		System.out.println("Heroi tem " + heroi.vida + " vida");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem " + monstro.vida + " vida");
		System.out.println("Heroi tem " + heroi.vida + " vida");
		
		// utilizando o enum
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.OESTE);
//		j1.andar(Direcao.NORTE);

//		System.out.println(j1.y);
//		System.out.println(j1.x);
	}
}
