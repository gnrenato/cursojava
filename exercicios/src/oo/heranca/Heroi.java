package oo.heranca;
//155 - Heranca 01
//156 - Heranca 02
public class Heroi extends Jogador {
	
	// reescrita do metodo da classe pai jogador
	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente); // chamar o metodo da classe super(pai)
		boolean ataque2 = super.atacar(oponente);
		return ataque1 || ataque2;
	}
}
