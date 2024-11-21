package controle;

public class Break {
// 82 - BREAK #01 - utilizado para para o laço if, ele pode ser utilizado para parar a exucução de um bloco de codigo, 
	//é mais usado em estruturas de repetição
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim");
	}
}
