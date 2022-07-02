package br.com.fiap.Veiculos;

public abstract class Veiculos {
	
	protected String marca;
	protected String modelo;
	protected String cor;
	protected int anoFabricacao;
	protected int anoModelo;
	protected String renavm;
	protected Condutor condutor;
	protected Motor motor;
	protected Cambio cambio;
	protected Multimidia multimidia;
	protected Roda roda;
	
	public Veiculos(String marca, String modelo, String cor, int anoFabricacao, int anoModelo, String renavm,
			Condutor condutor, Motor motor, Cambio cambio, Multimidia multimidia, Roda roda) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.renavm = renavm;
		this.condutor = condutor;
		this.motor = motor;
		this.cambio = cambio;
		this.multimidia = multimidia;
		this.roda = roda;
	}
	
	public abstract void exibirDados();
	
	
	

}
