package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter = 
				texto -> new StringBuilder(texto).reverse().toString();
				
		Function<String, Integer> binarioParaInteger = 
				texto -> Integer.parseInt(texto, 2);
				
		numbers.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInteger)
			.forEach(System.out::println);
	}
}
