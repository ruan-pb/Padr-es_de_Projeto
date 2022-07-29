package banco;

public class Correntista implements Conta{
	private String cpf;
	private String nome;
	private double saldo;
	private Conta conta;
	
	
	public Correntista(String cpf, String nome, double saldo) {
		this.cpf = cpf;
		this.nome = nome;
		this.saldo = saldo;
	}
	public String getCpf() {
		return cpf;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public double sacar(double valor) {
		return this.saldo -= valor - 5;
	}
	@Override
	public double depositar(double valor) {
		return this.saldo += valor;
	}

	
	
	
	

}
