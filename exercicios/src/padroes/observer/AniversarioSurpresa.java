package padroes.observer;

//259 - Padrão Observer #2
public class AniversarioSurpresa {

	public static void main(String[] args) {
		Porteiro porteiro = new Porteiro();

		Namorada namorada = new Namorada();
		porteiro.registrarObservadores(namorada);

		porteiro.registrarObservadores(e -> {
			System.out.println("Surpresa via Lambda");
			System.out.println("Ocorreu em: " + e.getMomento());
		});

		porteiro.monitorar();

	}
}
