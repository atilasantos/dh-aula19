package exercicio_santander;

public class ContaPoupanca extends Conta{
	
	private double TAX = 0.05;
	
	public ContaPoupanca(double saldo) {
		super(saldo);
	}
	
	public double getTAX() {
		return TAX;
	}
	
	public boolean sacar(double valor) {
		if(valor > super.getSaldo()) {
			System.out.println("Saque nao realizado, valor supera saldo!");
			return false;
		}
		super.sacar(valor);
		return true;
	}

	public void setTAX(double tAX) {
		TAX = tAX;
	}
	
	public double recolherJuros() {
		return super.getSaldo() * TAX;
	}

	@Override
	public String toString() {
		return "ContaPoupanca: TAX=" + TAX + ", Saldo=" + super.getSaldo();
	}
}
