package lanche;

public class Massa extends Lanche{
	
	private String molho;
	private TipoMassa massa;

	
	public Massa(double preco, String molho, TipoMassa massa) {
		super(preco);
		this.molho = molho;
		this.massa = massa;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public int tempoEntrega(int km) {
		return 30 + super.tempoEntrega(km);
	}

	@Override
	public String toString() {
		return "Massa [molho=" + molho + ", massa=" + massa + "]";
	}
	

}
