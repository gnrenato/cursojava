package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		// 29 - Tipo String
		System.out.println("Ola pessoal".charAt(0));
		
		String s = "Boa Tarde"; // declaração de uma String
		System.out.println(s.concat("!!!")); // utilizando a função para concatenar
		System.out.println(s + "!!!"); // utilizando o '+' para concatenar
		System.out.println(s.startsWith("Boa")); // utilizando a função para identificar a sentença Boa
		System.out.println(s.toLowerCase().startsWith("boa")); // utilizando a função para deixar a sentença da variavel s em minusculo e buscar a palavra boa
		System.out.println(s.endsWith("Tarde")); // utilizando a função para identificar se a sentença de s termina em Tarde
		System.out.println(s.length()); // função para descobrir o tamanho da sentença
		System.out.println(s.equals("Boa Tarde")); // função para identificar se s é igual a sentença informada
		System.out.println(s.equalsIgnoreCase("boa tarde"));// função para identificar se s é igual a sentença informada ignorando o case sensitive
		
		// utilizando inferencia para criar as variaveis
		var nome = "Renato";
		var sobrenome = "Gomes";
		var idade = 32;
		var salario = 2000.595;
		
		//Concatenação de variavel utilizando o +
		//Podese colocar dentro de uma variavel a frase e passar no syso somente a variavel
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario);
		
		//utilizando o printf format para organizar a sentença
		System.out.printf("O senhor %s %s tem %d anos com o salario R$%.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos com o salario R$%.2f", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}
}
