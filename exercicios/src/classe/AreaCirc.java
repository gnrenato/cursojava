package classe;

// 105 106 Membros de Classe vs Instância #01#02
public class AreaCirc {

	double raio;
	final static double PI = 3.14; // definimos uma constante e o membro da classe utilizando a palavra static

	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}

	double area() {
		return PI * Math.pow(raio, 2);
	}

	static double area(double raio) { // podemos criar um metodo statico, assim não tendo necessidade de criar uma
										// instacia para acessa-lo
		return PI * Math.pow(raio, 2);
	}
}
