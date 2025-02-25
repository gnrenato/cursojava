package excecao;

// 221 Exceção checada vc Exceção não checada
public class ChecadaVsNaoChecada {

	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}

		try {
			geraErro2();
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim ");
	}

	// Não verificada ou não checada - não gera erro de compilação eu escolho se
	// quero ou não tratar o erro
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01!"); // lançamos um erro
	}

	// Checada ou verificada - deixar claro na assinatura do metodo que posso lançar
	// uma exceção excepiton
	static void geraErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem legal #02!");
	}
}
