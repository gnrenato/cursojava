package classe;

// 128 - Entendendo Equal e Hashcode
// 129 - Equal na pratica
public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {
			Usuario outro = (Usuario) objeto;

			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailgual = outro.email.equals(this.email);

			return nomeIgual && emailgual;
		} else {
			return false;
		}

	}
}
