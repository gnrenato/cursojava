package oo.abstrato;

//170 171 - Classe Abstrada 1 2
public abstract class Mamifero extends Animal {
	
	public abstract String mamar();
	
	public final String mover() { //metodo final nao pode ser subscrito - metodo concreto. 
		return "Saindo do lugar";
	}
}
