package padroes.observer;

//259 - Padrão Observer #2
public class Namorada implements ObservadorChegadaAniversariante{

	
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("Avisar os convidados");
		System.out.println("Apagar as luzes");
		System.out.println("Esperar um pouco");
		System.out.println("Surpresa");
	}
	
	
}
