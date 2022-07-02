package br.com.fiap.ContaBanco;

public class ContaPoupanca extends Conta {
	
	private double saldoAplicacao;
	
	//Construtor
	public ContaPoupanca(long numConta, Cliente cliente) {
		super(numConta, cliente);
	}
	
	
	//Getters and Setters
	public double getSaldoAplicacao() {
		return saldoAplicacao;
	}

	public void setSaldoAplicacao(double saldoAplicacao) {
		this.saldoAplicacao = saldoAplicacao;
	}

	
	
	//Método abstrato
	@Override
	public void exibirDados() {

		System.out.println("Saldo de Aplicação: R$" + this.saldo);
	}

}
