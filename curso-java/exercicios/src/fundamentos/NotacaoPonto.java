package fundamentos;

public class NotacaoPonto {
	/**
	 * Ponto importante:
	 * 1. Os TIPOS PRIMITIVOS da linguagem são marcados na cor 'roxo';
	 * 2. Eles NÃO possuem o operador ponto (.)
	 * @param args
	 */
	public static void main(String[] args) {
		double a = 2.3;
		System.out.println(a);
		
		String name = "José da Silva Lima Paiva";
		String s = "Bom dia X";
		
		s = s.replace("X", name);
		s = s.toUpperCase();
		s = s.concat("!!!!!");
		
		System.out.println(s);
		
		String x = "Mary Louise".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
							.replace("X", "Gui")
							.toUpperCase()
							.concat("!!!!!");
		System.out.println(y);
		
		//Tipos primitivos não tem o operador ponto (.)
		int b = 3;
		System.out.println(b);
	}
}