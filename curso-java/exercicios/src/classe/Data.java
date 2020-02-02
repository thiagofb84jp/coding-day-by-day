package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		dia = 01;
		mes = 01;
		ano = 1970;		
	}
	
	Data(int diaInicial, int mesInicial, int anoInicial){
		dia = diaInicial;
		mes = mesInicial;
		ano = anoInicial;
	}
	
	String obterDataFormatada(){
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		//System.out.printf("%d/%d/%d\n", dia, mes, ano);
		System.out.println(obterDataFormatada());
	}
}