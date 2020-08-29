package lanche;

public class Lanche {
	
	private double preco;
	
	public Lanche(double preco) {
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
	
	public int tempoEntrega(int km) {
		return 10 * km;
	}

	@Override
	public String toString() {
		return "Lanche [preco=" + preco + ", getPreco()=" + getPreco() + "]";
	}
	
}
