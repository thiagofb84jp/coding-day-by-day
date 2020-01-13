package fundamentos;

public class Wrappers {
	
	/**
	 * Pontos importantes:
	 * 1. Para cada tipo primitivo existe uma versão da mesma orientada a objetos
	 * @param args
	 */
	
	public static void main(String[] args) {
		//byte
		Byte b = 100;
		Short s = 1000;
		
		//Int e Long
		Integer i = Integer.parseInt("10000");
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		//Float
		Float f = 123F;
		System.out.println(f);
		
		//Boolean
		Boolean bo = Boolean.parseBoolean("true"); //conversor de booleano para valor 'String'	
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		//Char
		Character c = '#';
		System.out.println(c + "...");
	}
}