public class Data{
	int dia;
	int mes;
	int ano;
	
	Data(int d, int m, int a){
		this.dia=d;
		this.mes=m;
		this.ano=a;
	}
	
	public int getDia(){
		return dia;
	}
	
	public int getMes(){
		return mes;
	}
	
	public int getAno(){
		return ano;
	}
	
	String getString(){
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}