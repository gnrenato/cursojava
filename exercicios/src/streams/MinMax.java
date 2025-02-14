package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//213 Min e Max
public class MinMax {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		//funcção para comparação
		Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return 1;
			if (aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(melhorNota).get()); // utiliza um comparator para retornar o melhor aluno baseado na nota
		System.out.println(alunos.stream().min(melhorNota).get()); // utiliza um comparator para retornar o pior aluno baseado na nota
	}
}
