public class Pessoa {
	String nome, cpf;
	char sexo;
	Data dataNas;
	
	Pessoa(String n, String c, Data d, char s) {
		System.out.println("\nNova pessoa criada no sistema.");
		this.nome = n;
		this.dataNas = d;
		this.sexo = s;
		this.cpf = c;
	}

	void atribuiCPF(String c) {
		this.cpf = c;
	}
	
	public String getCpf() {
		return cpf;
	}
	public String getNome() {
		return nome;
	}
}
