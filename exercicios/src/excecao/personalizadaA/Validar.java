package excecao.personalizadaA;

import excecao.Aluno;

// 223 - Exceção Personalizada 01
public class Validar {

	private Validar() {
	}
	
	public static void aluno(Aluno aluno) {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo"); // exceção do java
		}
		
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome"); // Exceção criada 
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota"); // Exceção criada 
		}
		
		
	}
}
