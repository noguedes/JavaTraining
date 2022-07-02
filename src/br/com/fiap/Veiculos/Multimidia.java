package br.com.fiap.Veiculos;

public class Multimidia {
	
		private String nomeMarca;
		private double vlMidia;
		private String tpMultMidia;
		
		public Multimidia(String nomeMarca, double vlMidia, String tpMultMidia) {
			super();
			this.nomeMarca = nomeMarca;
			this.vlMidia = vlMidia;
			this.tpMultMidia = tpMultMidia;
		}

		public String getNomeMarca() {
			return nomeMarca;
		}


		public void setNomeMarca(String nomeMarca) {
			this.nomeMarca = nomeMarca;
		}


		public double getVlMidia() {
			return vlMidia;
		}


		public void setVlMidia(double vlMidia) {
			this.vlMidia = vlMidia;
		}


		public String getTpMultMidia() {
			return tpMultMidia;
		}


		public void setTpMultMidia(String tpMultMidia) {
			this.tpMultMidia = tpMultMidia;
		}

}
