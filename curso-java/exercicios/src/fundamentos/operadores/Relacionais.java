package fundamentos.operadores;

public class Relacionais {
	
	public static void main(String[] args) {
		int a = 97;
		int b = 'a'; //número na base hexadecimal
		
		System.out.println(a == b); //true
		System.out.println(30 != 7); //true
		
		System.out.println(3 > 4); //false
		System.out.println(3 >= 3); //true
		System.out.println(3 < 4); //true
		System.out.println(30 <= 7); //false
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("\nTem desconto? " + temDesconto);
	}	
}