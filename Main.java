import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
		ArrayList<Pessoa> p = new ArrayList<>();
		ArrayList<Gerente> g = new ArrayList<>();
		ArrayList<Conta> c = new ArrayList<>();
		int op = menuInicial();
		while (op != 0){
			if (op == 1){
				menuCadastro(p, g, c);
			}
			if (op == 2){
				menuMovimentacoes(p, g, c);
			}
				op = menuInicial();
		}
		System.out.println ("\nBye! :-)");
	}

	public static int menuInicial(){
		Scanner s = new Scanner(System.in);
		System.out.println("Bem vindo!Escolha uma opcao.\n");
		System.out.println("1) Cadastro");
		System.out.println("2) Movimentacao Financeira");
		System.out.println("0) Sair");
		System.out.println("Escolha: ");
		return s.nextInt();
	}
	public static void menuCadastro(ArrayList<Pessoa> p, ArrayList<Gerente> g, ArrayList<Conta> c) {
        Scanner s = new Scanner(System.in);
        System.out.println("O que deseja cadastrar ?");
        System.out.println("1) Novo cliente");
        System.out.println("2) Novo gerente");
        System.out.println("3) Nova conta corrente");
        System.out.println("4) Nova poupanca");
				System.out.println("Escolha: ");
        int op = s.nextInt();
		
        if (op == 1){
          System.out.println("Cadastro de novo cliente:");
        	System.out.print("Nome: ");
        	String nome = s.next();
        	System.out.print("CPF: ");
        	String cpf = s.next();
        	System.out.print("Data de Nascimento (dia mês ano): ");
        	int dia = s.nextInt();
        	int mes = s.nextInt();
        	int ano = s.nextInt();
       		System.out.print("Sexo (M/F): ");
        	char sexo = s.next().charAt(0);
        	Pessoa novoCliente = new Pessoa(nome, cpf, new Data(dia, mes, ano), sexo);
        	p.add(novoCliente);
        	System.out.println("Cliente cadastrado com sucesso!");
        }
        if (op == 2) {
          System.out.println("Cadastro de novo gerente:");
	        System.out.print("Nome: ");
	        String nome = s.next();
	        System.out.print("CPF: ");
	        String cpf = s.next();
	        System.out.print("Data de Nascimento (dia mês ano): ");
	        int dia = s.nextInt();
	        int mes = s.nextInt();
	        int ano = s.nextInt();
	        System.out.print("Sexo (M/F): ");
	        char sexo = s.next().charAt(0);
	        System.out.print("Matrícula: ");
	        String matricula = s.next();
	        System.out.print("Senha: ");
	        String senha = s.next();
	        Gerente novoGerente = new Gerente(nome, cpf, new Data(dia, mes, ano), sexo, matricula, senha);
	        g.add(novoGerente);
	        System.out.println("Gerente cadastrado com sucesso!");
        }
        if (op == 3){
            Pessoa tit = escolherPessoa(p);
            Gerente ger = escolherGerente(g);
            c.add(new ContaCorrente("Numero", tit, ger, new Data(1, 1, 2023)));
        }
        if (op == 4){
            Pessoa tit = escolherPessoa(p);
            Gerente ger = escolherGerente(g);
            c.add(new Poupanca("Numero", tit, ger, new Data(1, 1, 2023)));
        }
    }
	
	public static Pessoa escolherPessoa(ArrayList<Pessoa> p){
		Scanner s = new Scanner(System.in);
		int i = 1;
		System.out.println ("Escolha o cliente da conta:");
		for (Pessoa tit : p){
			System.out.println(i + ") " + tit.getCpf() + " - " + tit.getNome());
			
			i++;
		}
		System.out.println("Escolha: ");
		int index = s.nextInt();
		return p.get(index -1);
	}
	
	public static Gerente escolherGerente(ArrayList<Gerente> g){
		Scanner s = new Scanner(System.in);
		int i = 1;
		System.out.println ("Escolha o gerente da conta:");
		for (Gerente ger : g){
			System.out.println (i + ") " + ger.getCpf() + " - " + ger.getNome());
			i++;
		}
		int index = s.nextInt();
		return g.get (index -1);
	}

	public static Conta escolherConta (ArrayList<Conta> c){
		Scanner s = new Scanner(System.in);
		int i = 1;
		System.out.println("Escolha uma conta:");
		for (Conta cc : c){
			System.out.println (i + ") " + cc.getNumero() + " - " + cc.getTitular().getNome());
			i++;
		}
		int index = s.nextInt ();
		return c.get(index -1);
	}
	
	public static void menuMovimentacoes(ArrayList<Pessoa> p, ArrayList<Gerente> g, ArrayList<Conta> c){
		Scanner s = new Scanner(System.in);
		Conta conta1 = escolherConta(c);
		System.out.println("O que deseja realizar?");
		System.out.println("1) Extrato");
		System.out.println("2) Saque");
		System.out.println("3) Deposito");
		System.out.println("4) Transferencia");
		/*int op = s.nextInt();
		if (op == 1) conta1.extrato();
		if (op == 2) conta1.sacar();
		if (op == 3) conta1.depositar();
		if (op == 4){
			System.out.println("Qual a conta destino ?");
			Conta conta2 = escolherConta (c);
			conta1.transferir (conta2);
		}*/
	}
}
