package br.com.fiap.Colletions;

public class Usuario implements Comparable<Usuario> {
	
	protected int idUser;
	protected String nomeUser;
	protected String senhaUser;
	private static int contador;
	
	
	public Usuario(int idUser, String nomeUser, String senhaUser) {
		super();
		this.idUser = idUser;
		this.nomeUser = nomeUser;
		this.senhaUser = senhaUser;
		contador++;
	}


	public int getIdUser() {
		return idUser;
	}


	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}


	public String getNomeUser() {
		return nomeUser;
	}


	public void setNomeUser(String nomeUser) {
		this.nomeUser = nomeUser;
	}


	public String getSenhaUser() {
		return senhaUser;
	}


	public void setSenhaUser(String senhaUser) {
		this.senhaUser = senhaUser;
	}
	
	public static void exibirContador() {
		System.out.println("Número de Usuários criados: " + contador);
	}


	@Override
	public int compareTo(Usuario user) {
		if(this.getIdUser()<user.getIdUser()) {
			return -1;
		}
		if(this.getIdUser()>user.getIdUser()) {
			return 1;
		}
		return 0;
	};
	
	
	
	
}
