package fundamentos;

public class Wrappers {
	
	public static void main(String[] args) {
		// 33 - Wrappers
		// Wrappers são as classes dos tipos primitivos, que permite que realizemos algumas ações
		// Todos são definitos com a Primeira letra maiuscula menos o int que é Integer
		
		Byte b = 100;
		Short s = 1000;
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.10f;
		System.out.println(f);
		
		Double d = 12345.456789;
		System.out.println(d);
		
		
		Boolean bo = Boolean.parseBoolean("true");
		
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c.toString());
		
	}
}
