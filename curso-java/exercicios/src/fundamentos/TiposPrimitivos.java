package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário
		// Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		boolean houveAumentoSalarial = true;
		
		// Tipo caractere
		char status = 'A'; //Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Número de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		// Valor do salário + funcionário de férias
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Houve aumento salarial neste ano? " + houveAumentoSalarial);
		System.out.println("Status " + status);
	}
}