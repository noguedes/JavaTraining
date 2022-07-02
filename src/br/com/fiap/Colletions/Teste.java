package br.com.fiap.Colletions;

import java.util.*;

public class Teste {

	public static void main(String[] args) {
		
		
		//Criando objetos
		Usuario user1 = new Usuario(1, "Arthur Guedes", "tutuguedes21*");
		Usuario user2 = new Usuario(2, "Juliao", "julio123");
		Usuario user3 = new Usuario(3, "Luizao", "luiz123");
		Usuario user4 = new Usuario(4, "Joazao", "joao123");
		Usuario user5 = new Usuario(5, "Matheuzao", "matheus123");
		
		//criando e adicionando na lista
		
		List<Usuario> list = new ArrayList<Usuario>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		list.add(user4);
		list.add(user5);
		
		Collections.sort(list);
		
		for(Usuario nome: list) {
			System.out.println("Nome: " + nome.getNomeUser() + " Senha: " + nome.getSenhaUser());
		}
		
		Map map = new HashMap();
		
		map.put("Arthur", user1);
		map.put("Julio", user2);
		
		Object objeto = map.get("Arthur");
		Usuario usuario = (Usuario) objeto;
		System.out.println(usuario.getNomeUser());
		
		Object objeto2 = map.get("Julio");
		Usuario usuario2 = (Usuario) objeto2;
		System.out.println(usuario2.getNomeUser());
		
		
		
		user1.exibirContador();

	}

}
