package excecao;

// 220 - O Basico sobre Exceção
public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		
		// utilizamos o try/catch para tratar o erro
		try { 
		imprimirNomeAluno(a1); // gerar um erro de null pointerExepetion
		} catch(Exception excecao) {
			System.out.println("Ocorreu um erro na impressão do nome do aluno");
		}
		
		
		try {
			// Gera um erro de ArithmeticException
			System.out.println(7 / 0);
			// tratando o erro mais especifico
		} catch (ArithmeticException e) { 
			// utilizando o e.getMessage para mostrar a mensagem da exceção 
			System.out.println("Ocorreu o erro: " + e.getMessage());
			// e.printStackTrace(); // mostra o rastreamento da stack para verificar aonde ocorreu o erro
		}
		
		System.out.println("Fim ");
	}
	
	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome); // pode gerar um erro porque está fulneravel, pode ser passado um aluno null
	}
}
