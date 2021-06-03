package heranca;

import java.util.Date;

public class Gerente extends Funcionario{
	
	private double sal_gerente;
	private String get_responsavel;
	private double sal_vendendor;
	
	public Gerente(String nome, String cpf, Date data_nascimento) {
		super(nome, cpf, data_nascimento);
	}
	
	public void setDados( int num_vendas_vendedor, String resp_vendendor) {
		this.sal_gerente = num_vendas_vendedor * 1350;
		this.get_responsavel = resp_vendendor;
		this.sal_vendendor    = num_vendas_vendedor * 753;
	}
	
	public String toStringPessoa() {
		return "seu nome = " + nome + " CPF = " + cpf + " Nascimento = " + data_nascimento; 
		
	}
	
	@Override
	public String toString() {
		return "Salario do Gerente = " + sal_gerente + " Resp. pelo vendendor = " + get_responsavel + " Salario vendendor = "
				+ sal_vendendor;
	}
	
	

}
