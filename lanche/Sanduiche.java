package lanche;

import java.util.ArrayList;
import java.util.List;

public class Sanduiche extends Lanche{
	
	private List<String> ingredientes = new ArrayList<>();
	
	
	public Sanduiche(List<String> ingredientes, double preco) {
		super(preco);
		
		this.ingredientes = ingredientes;
	}

	public List<String> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public int tempoEntrega(int km) {
		return 15 + super.tempoEntrega(km);
	}

	@Override
	public String toString() {
		return "Sanduiche [ingredientes=" + ingredientes + ", preco: " + super.getPreco() + "]";
	}
	
	
	
	

}
