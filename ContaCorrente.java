public class ContaCorrente extends Conta{
	double limite;
	
	ContaCorrente(String n, Pessoa t, Gerente g, Data c){
		super (n, t, g, c);
		this.limite = 200.0;
	}

	double disponivel(){
		return this.saldo + this.limite;
	}

	@Override
	public void extrato() {
			System.out.println("\nEXTRATO DA CONTA-CORRENTE");
			super.extrato();
	}
	
	void chequeEspecial(double juro){
		if (this.saldo < 0){
			this.saldo = this.saldo + (juro * this.saldo)/100;
		}
	}

	void sacar (double valor) {
		if (valor <= this.disponivel ()){
			this.saldo -= valor;
			System.out.println ("\nSaque de " + valor + " realizado com sucesso da conta " + numero + ".");
			System.out.println ("Novo saldo: " + this.saldo + ".\n");
		}else{
			System.out.println ("\nErro: nao foi possivel sacar " + valor);
			System.out.println ("Valor disponivel para saque: " + this.disponivel ());
		}
	}
	
	void transferir (double valor , Conta destino) {
		if (valor <= this.disponivel ()) {
			this.sacar (valor);
			destino.depositar (valor);
			System.out.println ("\nTransferencia de " + valor + " realizado com sucesso.");
			System.out.println ("Origem: " + this.numero + " / Destino: " + destino.numero);
		}else{
			System.out.println ("\nErro: nao foi possivel transferir " + valor);
			System.out.println ("Valor disponivel para transferencia: " + this.disponivel ());
		}
	}
}