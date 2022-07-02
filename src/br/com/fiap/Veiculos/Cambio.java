package br.com.fiap.Veiculos;

public class Cambio {
	
		private String nomeMarca;
		private String tpCambio;
		private int numMarchas;
		
		public Cambio(String nomeMarca, String tpCambio, int numMarchas) {
			super();
			this.nomeMarca = nomeMarca;
			this.tpCambio = tpCambio;
			this.numMarchas = numMarchas;
		}

		public String getNomeMarca() {
			return nomeMarca;
		}

		public void setNomeMarca(String nomeMarca) {
			this.nomeMarca = nomeMarca;
		}

		public String getTpCambio() {
			return tpCambio;
		}

		public void setTpCambio(String tpCambio) {
			this.tpCambio = tpCambio;
		}

		public int getNumMarchas() {
			return numMarchas;
		}

		public void setNumMarchas(int numMarchas) {
			this.numMarchas = numMarchas;
		}

}
