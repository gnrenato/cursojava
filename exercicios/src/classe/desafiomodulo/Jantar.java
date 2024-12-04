package classe.desafiomodulo;

//117 Desafio Modulo
public class Jantar {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Renato", 54);
		Pessoa p2 = new Pessoa("Amanda", 50);

		Comida c1 = new Comida("Coxinha", 0.3);
		Comida c2 = new Comida("Carne", 0.5);

		System.out.printf("Nome: %s\nPeso Antes: %.2f\n", p1.nome, p1.peso);
		p1.comer(c1);
		System.out.printf("Peso Depois %.2f\n", p1.peso);

		System.out.printf("Nome: %s\nPeso Antes: %.2f\nPeso Depois %.2f\n", p2.nome, p2.peso, p2.comer(c2.peso));

	}
}
