package oo.heranca.desafio;

//169 Interface
public interface Luxo {

	void ligarAr();
	void desligaAr();
	
	default int velocidadeDoAr() { // implementação padrão da interface, não é obrigado a implementar o metodo.
		return 1;
	}
}
