package br.com.fiap.ContaBanco;

public class ContaCorrente extends Conta {
	
	private double saldoInv;
	

	public ContaCorrente(long numConta, Cliente cliente) {
		super(numConta, cliente);
	}

	public void investir(double valor, String produto) throws SaldoInsuficiente {
		boolean teste = this.sacar(valor);
		if(teste == true) {
			if(produto.equals("CDB")){
				saldoInv += valor * (1 + 0.008);
			}else if(produto.equals("LCA")) {
				saldoInv += valor * (1 + 0.007);
			}else if(produto.equals("LCI")) {
				saldoInv += valor * (1 + 0.006);
			}
		}
	}
	
	public void resgatar(double valor) {
		saldoInv -= valor;
		this.saldo += valor;
		
	}
	
	
	
	
	//Método abstrato
	@Override
	public void exibirDados() {
		System.out.println("Saldo Investimento: R$" + saldoInv);
		System.out.println("Saldo conta: R$" + this.saldo);
		
	}
	
	

}
