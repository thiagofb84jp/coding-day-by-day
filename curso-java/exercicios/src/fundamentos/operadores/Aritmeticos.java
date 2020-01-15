package fundamentos.operadores;

public class Aritmeticos {
	
	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		double x = 34.56;
		double y = 2.2;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y + "\n");
		
		int a = 8;
		int b = 3;
		
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double) b); //Este tipo de operação também é possível, resultando em um double
		System.out.println(a / (float) b); //Este tipo de operação também é possível, resultando em um float
		
		System.out.println(a % b);
		System.out.println(8 % 3);
		
		System.out.println(x + y - a * b); 
	}
}