package swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

//206 - Padrão Observer no Swing
public class Observador {

	public static void main(String[] args) {

		JFrame janela = new JFrame("Observador"); // criando janela
		janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		janela.setSize(600, 200);
		janela.setLayout(new FlowLayout());
		janela.setLocationRelativeTo(null); // centralizar na tela do computador

		JButton botao = new JButton("Clicar!");
		janela.add(botao);

//		botao.addActionListener(new ActionListener() {
//			// classe anonima criada pelo action listener
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Evento ocorreu");
//			}
//		});

		botao.addActionListener(e -> {
			System.out.println("Evento ocorreu");
		});

		janela.setVisible(true);
	}
}
