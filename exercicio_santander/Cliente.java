package exercicio_santander;

public class Cliente {
	
	private int id;
	private String sobrenome;
	private int rg;
	private String cpf;
	private Conta conta;
	
	public Cliente(int id, String sobrenome, int rg, String cpf) {
		this.id = id;
		this.sobrenome = sobrenome;
		this.rg = rg;
		this.cpf = cpf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", sobrenome=" + sobrenome + ", rg=" + rg + ", cpf=" + cpf + ", conta=" + conta
				+ "]";
	}
	
	
	
	

}
