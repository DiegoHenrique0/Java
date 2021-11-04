package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String dataFormatada() {
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	Data() {
//		dia = 28;
//		mes = 9;
//		ano = 2000;
		this(28, 9, 2000);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

}
