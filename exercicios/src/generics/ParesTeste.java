package generics;

//253 - Criando uma Estrutura Chave/Valor com Generics
public class ParesTeste {

	public static void main(String[] args) {
		
		Pares<Integer, String> resultadoConcursos = new Pares<>();
		
		resultadoConcursos.adicionar(1, "Maria");
		resultadoConcursos.adicionar(2, "Pedro");
		resultadoConcursos.adicionar(3, "Ana");
		resultadoConcursos.adicionar(4, "Gui");
		resultadoConcursos.adicionar(2, "Gustavo");
		
		System.out.println(resultadoConcursos.getValor(1));
		System.out.println(resultadoConcursos.getValor(2));
		System.out.println(resultadoConcursos.getValor(3));
	}
}
