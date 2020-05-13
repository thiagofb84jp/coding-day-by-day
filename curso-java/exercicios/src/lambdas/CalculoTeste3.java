package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		/*
		 * Calculo calculo = (x, y) -> { return x + y; };
		 */

		/**
		 * O Java n�o permite o seguinte tipo de comportamento:
		 * - N�O permite a convers�o do tipo inteiro (primitivo) para Double (object);
		 * - Permite o tipo de convers�o de double (primitivo) para Double (object);
		 */
		
		BinaryOperator<Double> calcular1 = (x, y) -> {
			return x + y;
		};

		System.out.println(calcular1.apply(2.0, 3.0));

		calcular1 = (x, y) -> {
			return x * y;
		};
		
		System.out.println(calcular1.apply(2.0, 3.0));
		
		calcular1 = (x, y) -> x / y; //Esse tipo de opera��o � permitido! N�o � preciso acrescentar o 'return'
		
		System.out.println(calcular1.apply(10.0, 5.0));
		
		/*************************************************************/
		
		BinaryOperator<Integer> calcular2 = (x, y) -> {
			return x + y;
		};

		System.out.println(calcular2.apply(2, 3));

		calcular2 = (x, y) -> {
			return x * y;
		};
		
		System.out.println(calcular2.apply(2, 3));
		
		calcular2 = (x, y) -> x / y; //Esse tipo de opera��o � permitido! N�o � preciso acrescentar o 'return'
		
		System.out.println(calcular2.apply(10, 5));
	}
}