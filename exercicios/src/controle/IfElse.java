package controle;

import javax.swing.JOptionPane;

public class IfElse {
	// 66 - If/Else
	public static void main(String[] args) {
		
		String valor = JOptionPane.showInputDialog("Informe o numero: ");
		int numero = Integer.parseInt(valor);
		
		// utilizando o if e o else(se (condição true), senão (condição false))
		if (numero % 2 == 0) {
			System.out.println("numero par");
		} else {
			System.out.println("numero impar");
		}
	}
}
