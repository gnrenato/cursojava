package controle;

public class Continue {
// 83 - CONTINUE #01 - o continue pula a repetição e continua para a proxima. 
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			
			System.out.println(i);
		}
	}
}
