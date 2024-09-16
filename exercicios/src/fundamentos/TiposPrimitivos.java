package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// 26 - Tipos Primitivos #02
		// Informações de um funcionario
		
		// Tipos Numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; //Quando você utiliza um valor literal e passar a capacidade do int tem que ser colocado o L para indicar que é um long
		
		// Tipos numeros com ponto flutuante (reais)
		float salario = 11_445.44F; //por padrão quando inserimos um valor literal no codigo, o tipo padrão é double como o valor fere o tamanho e queremos indicar que o valor é um float temos que colocar a letra F no final do valor. 
		double vendasAcumuldas = 2_991_797_103.01;
		
		// Tipo booleado
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos /2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuldas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
	}
}
