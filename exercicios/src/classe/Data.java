package classe;

public class Data {
	// 94 - Desafio Classe Data - Criar uma classe Data com os atributos dia, mes
	// ano, criar uma
	// classe DataTeste e instaciar duas datas
	// 113 - This e This()
	// 114 - Variaveis Locais
	int dia;
	int mes;
	int ano;

	// Contrutor
	Data(int dia, int mes, int ano) {
		this.dia = dia; // utilizando this para referenciar o objeto atual.
		this.mes = mes;
		this.ano = ano;
	}

	// Contrutor
	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // utilizando o this() para chamar um construtor
	}

	String obterDataFormata() {
		String formato = "%d/%d/%d"; // variavel local acessivel somente dentro do metodo
		return String.format(formato, this.dia, mes, ano); // utilizando o this para acessar uma variavel da instancia
	}

	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormata()); // utilizando o this para chamar um metodo
	}
}
