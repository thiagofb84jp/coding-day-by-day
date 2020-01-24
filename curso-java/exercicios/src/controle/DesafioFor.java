package controle;

public class DesafioFor {
	
	public static void main(String[] args) {
		String valor = "#";
		
		System.out.println("Entrando no primeiro laço...");
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor+= "#";
		}
		
		System.out.println("Entrando no segundo laço...");
		for(String v = "#"; !v.equals("#####"); v += "#") {
			System.out.println(v);
		}
	}
}