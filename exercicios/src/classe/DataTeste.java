package classe;

public class DataTeste {
//94 - Desafio Classe Data - Criar uma classe Data com os atributos dia, mes ano, criar uma 
//classe DataTeste e instaciar duas datas
	public static void main(String[] args) {

		Data data1 = new Data();
		data1.dia = 22;
		data1.mes = 04;
		data1.ano = 1992;

		var data2 = new Data();
		data2.dia = 06;
		data2.mes = 03;
		data2.ano = 1995;

		System.out.printf("%d/%d/%d\n", data1.dia, data1.mes, data1.ano);
		System.out.printf("%d/%d/%d", data2.dia, data2.mes, data2.ano);
	}
}
