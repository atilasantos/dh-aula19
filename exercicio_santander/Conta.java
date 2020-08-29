package exercicio_santander;

public abstract class Conta{

	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		this.saldo -= valor;
		return true;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + "]";
	}
	
}