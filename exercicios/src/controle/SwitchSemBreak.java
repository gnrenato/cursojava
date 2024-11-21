package controle;

public class SwitchSemBreak {
// 80 - Switch #01 - Esse exemplo sem break executa todos os blocos abaixo quando entrar em um case. 
	public static void main(String[] args) {

		String faixa = "verde";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marron":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Sei de nada");
		}
	}
}
