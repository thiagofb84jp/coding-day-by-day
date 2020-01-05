package fundamentos;

public class AreaCircunferencia {
	
	public static void main(String[] args) {
		double raio = 3.4;

		double area = Math.PI * raio * raio;
		System.out.println(area);
		
		raio = 10;
		area = Math.PI * raio * raio;
		System.out.println("Área = " + area + " m2.");
	}
}