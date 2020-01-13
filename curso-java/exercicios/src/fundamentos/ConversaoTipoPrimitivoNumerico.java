package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	/**
	 * Pontos importantes:
	 * 1. Conversão implítica -> Não há perda de informação no momento da conversão dos tipos
	 * 2. Conversão explícita -> Há (possível) perda das informações no momento da conversão dos tipos
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		double a = 1; //conversão implícita
		System.out.println(a);
		
		float b = (float) 1.1234567890; //conversão explícita (há um cast nele) -> Neste caso, pode haver perda de informação
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //conversão explícita
		System.out.println(d);
		
		double e = 1.87559999992;
		int f = (int) e; //conversão explícita
		System.out.println(f);
	}
}