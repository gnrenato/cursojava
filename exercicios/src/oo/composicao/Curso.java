package oo.composicao;

import java.util.ArrayList;
import java.util.List;

//145 Relacionamento Muitos para Muitos
public class Curso {

	final String nome;
	final List<Aluno> alunos = new ArrayList<Aluno>();

	Curso(String nome) {
		this.nome = nome;
	}

	void adicionarAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
