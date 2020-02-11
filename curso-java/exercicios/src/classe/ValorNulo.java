package classe;

public class ValorNulo {

	/**
	 * Pontos Importantes:
	 * 1) Um 'null pointer exception' � ter uma vari�vel nula, e essa vari�vel nula e essa vari�vel nula ir� 
	 * 		tentar acessar alguma atributo da vari�vel nula (podendo ser um m�todo ou atributo);
	 * 2) N�o se pode acessar atributo ou m�todo de algo que est� nulo, de algo que n�o aponta para um objeto
	 * 		real na mem�ria;
	 * 3) Lembre-se: Runtime � um erro que ocorrer� em tempo de execu��o (apenas quando o c�digo for executado).
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