package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.ano = 2021;
//		d1.dia = 7;
//		d1.mes = 11;
//		d1.ano = 2021;
		
		String dataFormatada1 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);
		
		Data d2 = new Data(31, 12, 2020);
//		d2.dia = 31;
//		d2.mes = 12;
//		d2.ano = 2020;
		
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
	}
}