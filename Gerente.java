import java.util.Scanner;

class Gerente extends Pessoa{
	String mat;
	String senha;
	
	Gerente(String nome, String cpf, Data d, char s, String mat, String p){
		super(nome, cpf, d, s);
		this.mat = mat;
		this.senha = p;
	}
	
	boolean validarAcesso (String pwd){
		return pwd.equals(this.senha);
	}
	
	boolean validarAcesso(){
		Scanner s = new Scanner (System.in);
		System.out.printf ("Digite a senha: ");
		String pwd = s.nextLine();
		return this.validarAcesso(pwd);
	}
}
