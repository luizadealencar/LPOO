public class Conta {
	String numero;
	Pessoa titular;
	double saldo;
	double limite;

	Conta (String n, Pessoa t){
		this.numero = n ;
		this.titular = t ;
		this.saldo = 0;
		this.limite = 200;
	}

	Conta (String n, Pessoa t, double l){
		this (n, t);
		this.limite = l;
	}

	double disponivel () {
		return this.saldo + this.limite;
	}
	
	void extrato () {
		System.out.println ("\n*** EXTRATO DA CONTA ***");
		System.out.println ("Conta: " + this.numero);
		System.out.println ("Titular: " + this.titular.cpf);
		System.out.println ("Valor disponivel para saque: " +
		this.disponivel () + "\n");
	}
	
	void sacar (double valor) {
		if (valor <= this.disponivel ()){
			this.saldo -= valor;
			System.out.println ("Saque de " + valor + " realizado com sucesso.");
			System.out.println ("Novo saldo: " + this.saldo);
		}else{
			System.out.println ("Erro: nao foi possivel sacar " + valor);
			System.out.println ("Valor disponivel para saque: " + this.disponivel ());
		}
	}
	
	void depositar (double valor) {
		this.saldo += valor;
		System.out.println ("Deposito de " + valor + " realizado com sucesso.");
		System.out.println ("Novo saldo: " + this.saldo);
	}
	
	void transferir (double valor , Conta destino) {
		if (valor <= this.disponivel ()) {
			this.sacar (valor);
			destino.depositar (valor);
			System.out.println ("Transferencia de " + valor + " realizado com sucesso.");
			System.out.println ("Origem: " + this.numero + " / Destino: " + destino.numero);
		}else{
			System.out.println ("Erro: nao foi possivel transferir " + valor);
			System.out.println ("Valor disponivel para transferencia: " + this.disponivel ());
		}
	}
}
