package oo.composicao;

public class CursoTeste {
// 145 Relacionamento Muitos para Muitos
	public static void main(String[] args) {

		// Instanciando os alunos
		Aluno aluno1 = new Aluno("Joao");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		// Instanciando os cursos
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web Completo");
		Curso curso3 = new Curso("React Native");

		// Adicionando o aluno no curso
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);

		// Adicionando o curso no aluno
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);

		// Percorrendo os alunos do curso
		for (Aluno aluno : curso3.alunos) {
			System.out.println("Estou Matriculado no curso: " + curso3.nome);
			System.out.println("Meu nome é: " + aluno.nome);
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado !=null) {
			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}

	}
}
