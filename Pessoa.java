public class Pessoa{
	String nome;
	int idade;
	char sexo;
	String cpf;

	Pessoa (String n, int i, char s, String c){
		System.out.println ("Nova pessoa criada no sistema.");
		this.nome = n;
		this.idade = i;
		this.sexo = s;
		this.cpf = c;
	}

	void aniversario (){
		this.idade = this.idade+1;
	}
	void atribuiCPF ( String c ){
		this.cpf = c ;
	}
	
	int getIdade (){
		return this.idade ;
	}

}
