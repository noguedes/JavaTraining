package br.com.fiap.Veiculos;

public class Roda {
	
		private String marca;
		private int numAro;
		
		public Roda(String marca, int numAro) {
			super();
			this.marca = marca;
			this.numAro = numAro;
		}
		
		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public int getNumAro() {
			return numAro;
		}

		public void setNumAro(int numAro) {
			this.numAro = numAro;
		}

}
