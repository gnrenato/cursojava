package classe;

public class DataTeste {
//94 - Desafio Classe Data - Criar uma classe Data com os atributos dia, mes ano, criar uma 
//classe DataTeste e instaciar duas datas
	public static void main(String[] args) {

		Data data1 = new Data(22, 04, 1992); // Utilizando contrutor com parametro

		var data2 = new Data(); // Utilizando contrutor padrão
		data2.dia = 3;

		System.out.println(data1.obterDataFormata());
		System.out.println(data2.obterDataFormata());
	}
}
