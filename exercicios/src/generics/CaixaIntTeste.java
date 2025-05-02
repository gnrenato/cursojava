package generics;

//250 Generics e Herança #01
public class CaixaIntTeste {

	public static void main(String[] args) {

		CaixaInt caixaA = new CaixaInt(); // generics foi resolvido na classe CaixaInt na herença
		caixaA.guardar(123);

		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
	}
}
