package br.com.fiap.ContaBanco;

public class SaldoInsuficiente extends Exception {
	
	SaldoInsuficiente(String mensagem){
		super(mensagem);
	}

}
