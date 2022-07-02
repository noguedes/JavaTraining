package br.com.fiap.ContaBanco;

public class Cliente {
	
	private long numConta;
	private String nomeUser;
	private String CPF;
	
	public Cliente(long numConta, String nomeUser, String cPF) {
		super();
		this.numConta = numConta;
		this.nomeUser = nomeUser;
		CPF = cPF;
	}

	public long getNumConta() {
		return numConta;
	}

	public void setNumConta(long numConta) {
		this.numConta = numConta;
	}

	public String getNomeUser() {
		return nomeUser;
	}

	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

}
