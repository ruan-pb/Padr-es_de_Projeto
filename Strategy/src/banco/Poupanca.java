package banco;

public class Poupanca implements Conta {
	private int TransID;
	private int numero;
	
	private double saldo;
	
	public Poupanca(int numero) {
		super();
		this.numero = numero;
	}
	public Poupanca(int id,Correntista correntista, int numero) {
		this.TransID = id;
		this.numero = numero;
	}
	

		@Override
	public double sacar(double valor) {
		return this.saldo -= valor;
	}
		@Override
		public double depositar(double valor) {
			return this.saldo += valor +0.1;
		}


}
