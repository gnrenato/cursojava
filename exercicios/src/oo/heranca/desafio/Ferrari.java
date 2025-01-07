package oo.heranca.desafio;
//desafio heranca 01 e 02
public class Ferrari extends Carro {
	
	Ferrari(){
		this(315);
	}
	
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
}
