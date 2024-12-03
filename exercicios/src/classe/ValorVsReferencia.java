package classe;

public class ValorVsReferencia {
// 109 - 110 - Atribuição: Valor vs Referencia #01#02
	public static void main(String[] args) {
		
//		O java faz uma copia do valor para a variavel
		double a = 2;
		double b = a; // Atribuição por valor (Tipo Primitivo)

		a++;
		b--;

		System.out.println(a + " " + b);
		
// 		O java atribui a referencia da memoria
		Data d1 = new Data(1, 6, 2022);
		Data d2 = d1; // Atribuição por referencia (Objeto)

		d1.dia = 31;
		d2.mes = 12;

		d1.ano = 2025;

		System.out.println(d1.obterDataFormata());
		System.out.println(d2.obterDataFormata());

		voltarDataParaValorPadrao(d1);

		System.out.println(d1.obterDataFormata());
		System.out.println(d2.obterDataFormata());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);

	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}

}
