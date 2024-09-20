package fundamentos;

import java.util.Scanner;

public class Console {
	// 30 - Console
	public static void main(String[] args) {
		
		// utilizando print mantemos a sentença na mesma linha
		System.out.print("Bom");
		System.out.print(" Dia!\n");
		
		// utilizando o println é impresso em linhas separadas
		System.out.println("Bom");
		System.out.println("dia!");
		
		// utilizando o printf podemos imprimir utilizando a formatação como no exemplo acima
		System.out.printf("Megasenha %d %d %d %d %d %d \n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salario: %.2f %n", 1234.5665);
		System.out.printf("Nome: %s", "Case");
		
		// podemos utilizar também para pular a linha o \n ou %n
		
		// Utilizamos o Scanner para ler as entradas do teclado
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o seu nome: ");
		String nome = entrada.nextLine(); // utilizado para armazenar na variavel o valor digitado 
		System.out.print("Digite o seu Sobrenome: ");
		String sobrenome = entrada.nextLine(); // utilizado para armazenar na variavel o valor digitado 
		System.out.print("Digite sua idade:");
		int idade = entrada.nextInt(); // utilizado para gravar na armazenar o valor digitado 
		System.out.printf("\nNome: %s \nSobrenome: %s \nIdade: %d", nome, sobrenome, idade);
		
		entrada.close(); // Temos que fechar o metodo Scanner
	}
}
