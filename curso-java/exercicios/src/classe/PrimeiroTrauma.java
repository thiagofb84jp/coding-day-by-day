package classe;

public class PrimeiroTrauma {
	//Este � um atributo no qual pertence a inst�ncia
	//S� se consegue acessar um atributo de inst�ncia se for criada uma inst�ncia
	//Mesmo que esteja dentro da classe, n�o � poss�vel acessar esse valor
	//S� � poss�vel acessar um membro de inst�ncia a partir de um m�todo est�tico se a inst�ncia for criada
	int a = 3;
	static int b = 4;
	
	public static void main(String[] args) {
		PrimeiroTrauma p = new PrimeiroTrauma();
		System.out.println(p.a);
		
		System.out.println(b);
	}
}