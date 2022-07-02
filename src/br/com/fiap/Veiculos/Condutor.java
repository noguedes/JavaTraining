package br.com.fiap.Veiculos;

public abstract class Condutor {
	
	protected String nome;
	protected String CPF;
	protected String dtNasc;
	protected String tpCarteira;
	
	public Condutor(String nome, String cPF, String dtNasc, String tpCarteira) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dtNasc = dtNasc;
		this.tpCarteira = tpCarteira;
	}
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(String dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getTpCarteira() {
		return tpCarteira;
	}

	public void setTpCarteira(String tpCarteira) {
		this.tpCarteira = tpCarteira;
	}

	public String getCPF() {
		return CPF;
	}
	
		

}
