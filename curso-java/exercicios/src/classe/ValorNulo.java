package classe;

public class ValorNulo {

	/**
	 * Pontos Importantes:
	 * 1) Um 'null pointer exception' é ter uma variável nula, e essa variável nula e essa variável nula irá 
	 * 		tentar acessar alguma atributo da variável nula (podendo ser um método ou atributo);
	 * 2) Não se pode acessar atributo ou método de algo que está nulo, de algo que não aponta para um objeto
	 * 		real na memória;
	 * 3) Lembre-se: Runtime é um erro que ocorrerá em tempo de execução (apenas quando o código for executado).
	 */
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		
		if (d1 != null) {
			d1.mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa!" : null;
		
		if (s2 != null) {
			System.out.println(s2.concat("???????"));			
		}
	}	
}