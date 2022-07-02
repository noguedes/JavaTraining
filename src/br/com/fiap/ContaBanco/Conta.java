package br.com.fiap.ContaBanco;

public abstract class Conta {

	protected long numConta;
	protected double saldo;
	protected Cliente cliente;
	private static int contador;

	public Conta(long numConta, Cliente cliente) {
		super();
		this.numConta = numConta;
		this.cliente = cliente;
		contador ++;
	}

	// DEPOSITAR
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	// SACAR
		public boolean sacar(double valor) throws SaldoInsuficiente {
			if (valor > 0) {
				if (this.saldo >= valor) {
					this.saldo -= valor;
					return true;
				}else {
					throw new SaldoInsuficiente("Saldo insuficiente");
				}
			}
			return false;
		}

	// TRANSFERIR
	public boolean transferir(Conta conta, double valor) throws SaldoInsuficiente {
		boolean teste = sacar(valor);
		if (teste == true) {
			conta.depositar(valor);
			return true;
		}
		return false;
	}
	
	public static void exibirContador() {
		System.out.println("Contas criadas: " + contador);
	}


	public abstract void exibirDados();
}
