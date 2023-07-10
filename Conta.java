public class Conta{
	String numero;
	Pessoa titular;
	double saldo;
	Data criacao;
	Gerente gerente;
	
	public Conta (String numero, Pessoa titular, Gerente g, Data c){
		this.numero=numero;
		this.titular=titular;
		this.saldo=0;
		this.criacao=c;
		this.gerente=g;
	}
	
	void depositar (double valor){
		this.saldo+=valor;
		System.out.println ("\nDeposito na conta " + this.numero + " realizado com sucesso. Novo saldo: " + this.saldo);
	}
	
	public void extrato() {
    System.out.println("Saldo: " + saldo + "\n");
	}
}
