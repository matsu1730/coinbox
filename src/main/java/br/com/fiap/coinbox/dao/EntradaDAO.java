package br.com.fiap.coinbox.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.coinbox.model.Entrada;

public class EntradaDAO {

	private static Map<Long, Entrada> entradas = new HashMap<Long, Entrada>(Map.of(

			1L, new Entrada(1, "TAP", "27/10/2022", "33.45", "Tentando o DAO"), 
			2L, new Entrada(2, "Flying Blue", "26/9/2022", "48.45", "Não Acredito que funcionou!"), 
			3L, new Entrada(3, "Ryanair", "26/8/2022", "54.48", "Não Acredito que funcionou!"), 
			4L, new Entrada(4, "Livelo", "23/9/2022", "13.13", "Não Acredito que funcionou!")));

	public static List<Entrada> listar() {
		return new ArrayList<>(entradas.values());
	}

	public static void cadastrar(Entrada entrada) {
		System.out.println("Iniciando novo cadastro...");
		entradas.put(entrada.getId(), entrada);
		System.out.println("Cadastro finalizado!");
	}

	public static Entrada buscar(long id) {
		return entradas.get(id);
	}

	public static void editar(Entrada entrada) {
		System.out.println("Iniciando edicao de cadastro...");
		entradas.put(entrada.getId(), entrada);
		System.out.println("Edicao finalizada!");
	}

	public static void remover(long id) {
		System.out.println("Iniciando remocao de cadastro...");
		entradas.remove(id);
		System.out.println("Remocao finalizada!");
	}

}
