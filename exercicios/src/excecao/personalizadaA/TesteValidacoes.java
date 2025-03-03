package excecao.personalizadaA;

import excecao.Aluno;

// 223 - Exceção Personalizada 01
public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno aluno = new Aluno("Ana", 7);
			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException | NumeroForaIntervaloException  | IllegalArgumentException e) { // tratamos dois tipos de erros especificos criados
			System.out.println(e.getMessage());
		} 
		
		System.out.println("Fim");
	}
}
