package oo.heranca.desafio;
//desafio heranca 01 e 02
public class Ferrari extends Carro {
	
	public Ferrari(){
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		delta = 15;
	}
	
}
