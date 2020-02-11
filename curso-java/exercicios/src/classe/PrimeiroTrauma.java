package classe;

public class PrimeiroTrauma {
	//Este é um atributo no qual pertence a instância
	//Só se consegue acessar um atributo de instância se for criada uma instância
	//Mesmo que esteja dentro da classe, não é possível acessar esse valor
	//Só é possível acessar um membro de instância a partir de um método estático se a instância for criada
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		System.out.println(b);
	}
}