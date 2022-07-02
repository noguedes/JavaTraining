package br.com.fiap.Veiculos;

public class Motor {
	
		private String nomeMarca;
		private int cilindrada;
		private int qtdVelas;
		private int cavalos;
		
		public Motor(String nomeMarca, int cilindrada, int qtdVelas, int cavalos) {
			super();
			this.nomeMarca = nomeMarca;
			this.cilindrada = cilindrada;
			this.qtdVelas = qtdVelas;
			this.cavalos = cavalos;
		}
		
		
		public String getNomeMarca() {
			return nomeMarca;
		}

		public void setNomeMarca(String nomeMarca) {
			this.nomeMarca = nomeMarca;
		}

		public int getCilindrada() {
			return cilindrada;
		}

		public void setCilindrada(int cilindrada) {
			this.cilindrada = cilindrada;
		}

		public int getQtdVelas() {
			return qtdVelas;
		}

		public void setQtdVelas(int qtdVelas) {
			this.qtdVelas = qtdVelas;
		}

		public int getCavalos() {
			return cavalos;
		}

		public void setCavalos(int cavalos) {
			this.cavalos = cavalos;
		}

}
