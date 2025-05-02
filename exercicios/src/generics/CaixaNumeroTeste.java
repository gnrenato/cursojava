package generics;

//250 Generics e Herança #02
public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		// restringimos o generics a tipo number na classe CaixaNumero
		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		caixaA.guardar(123);
		
		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}
}
