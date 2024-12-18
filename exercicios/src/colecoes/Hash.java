package colecoes;

import java.util.HashSet;

// 138 - HashCode na pratica 
public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<Usuario>();
		
		usuarios.add(new Usuario("Renato"));
		usuarios.add(new Usuario("Ana"));
		usuarios.add(new Usuario("Guilherme"));
		
		System.out.println(usuarios.contains(new Usuario("Guilherme")));
	}
}
