package padroes.observer;

import java.util.Date;

//259 - Padrão Observer #2
public class EventoChegadaAniversariante {
	
	private final Date momento;

	public EventoChegadaAniversariante(Date momento) {
		this.momento = momento;
	}

	public Date getMomento() {
		return momento;
	}
	
}
