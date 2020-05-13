package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		/*
		 * Calculo calculo = (x, y) -> { return x + y; };
		 */

		Calculo calcular = (x, y) -> {
			return x + y;
		};

		System.out.println(calcular.executar(2, 3));

		calcular = (x, y) -> {
			return x * y;
		};
		
		System.out.println(calcular.executar(2, 3));
		
		calcular = (x, y) -> x / y; //Esse tipo de operação é permitido! Não é preciso acrescentar o 'return'
		
		System.out.println(calcular.executar(10, 5));
		
		System.out.println(calcular.legal());
		
		System.out.println(Calculo.muitoLegal());
	}
}