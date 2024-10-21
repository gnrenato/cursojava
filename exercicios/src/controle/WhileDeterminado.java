package controle;

public class WhileDeterminado {
// 70 - While 01
	public static void main(String[] args) {
		
		int contador = 1;
		// A demonstração do While abaixo, enquanto o contador for menor igual a 10 continue contando
		while (contador <= 10) {
			System.out.printf("Bom dia! i = %d\n", contador);
			contador += 2; // incremento do contador
		}
		
	}
}
