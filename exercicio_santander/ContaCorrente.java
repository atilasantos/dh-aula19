package exercicio_santander;

public class ContaCorrente extends Conta {
	
	private final double limite = 700.00;
	private Cheque cheque;
	
	public ContaCorrente(double saldo) {
		super(saldo);

	}
	
	@Override
	public boolean sacar(double valor) {
		if(valor > (super.getSaldo() + this.getLimite())) {
			System.out.println("Valor superior ao limite de saque, saldo: " + this.getSaldo() + " limite: " + this.getLimite() + " Valor de saque solicitado: " + valor);
			return false;
		}
		super.sacar(valor);
		return true;
	}
	
	@Override
	public void depositar(double valor) {
		super.depositar(valor);
	}

	public double getLimite() {
		return limite;
	}
	
	public void depositarCheque(Cheque cheque) {
		double valor = cheque.getValor();
		this.cheque = cheque;
		super.depositar(valor);
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [Limite=" + limite + ", deposito cheque=" + cheque + " Saldo=" + super.getSaldo() +"]";
	}
}
