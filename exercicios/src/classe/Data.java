package classe;

public class Data {
	// 94 - Desafio Classe Data - Criar uma classe Data com os atributos dia, mes
	// ano, criar uma
	// classe DataTeste e instaciar duas datas
	int dia;
	int mes;
	int ano;

	String obterDataFormata() {
		
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
