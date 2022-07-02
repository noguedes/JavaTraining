package br.com.fiap.ContaBanco;

public class Executavel {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente(1, "Arthur", "3454567");
		Cliente cliente2 = new Cliente(2, "Juliao", "1213435");
		
		ContaCorrente contac1 = new ContaCorrente(1, cliente1);
		ContaCorrente contac2 = new ContaCorrente(2, cliente2);
		
		ContaPoupanca contap1 = new ContaPoupanca(1, cliente1);
		ContaPoupanca contap2 = new ContaPoupanca(2, cliente2);
		
		contac1.depositar(1000);
		contac1.exibirDados();
		
		try {
			contac1.investir(500, "CDB");
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contac1.exibirDados();
		
		try {
			contac1.transferir(contap1, 100);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contap1.exibirDados();
		
		try {
			contac1.transferir(contap1, 100);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		contap1.exibirDados();
		
		contac1.exibirDados();
		
		contac1.depositar(1000);
		contac1.exibirDados();
		
		try {
			contac1.sacar(1500);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		contac1.exibirContador();
	}
	
	

}
