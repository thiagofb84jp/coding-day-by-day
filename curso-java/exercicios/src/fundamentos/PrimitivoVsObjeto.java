package fundamentos;

public class PrimitivoVsObjeto {
	/**
	 * Wrapper são a versão dos objetos para os tipos primitivos
	 * @param args
	 */
	public static void main(String[] args) {
		String s = new String("texto qualquer");
		s.toUpperCase();
		
		//Wrappers
		int a = 123;
		System.out.println(a);
	}
}