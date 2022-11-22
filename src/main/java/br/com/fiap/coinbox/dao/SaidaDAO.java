package br.com.fiap.coinbox.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fiap.coinbox.model.Saida;

public class SaidaDAO {

	private static Map<Long, Saida> saidas = new HashMap<Long, Saida>(Map.of(

			1L, new Saida(1, "McDonalds", "15/11/2022", "33.50", "Tentando o DAO"), 
			2L, new Saida(2, "Pão de Açúcar", "29/10/2022", "13.50", "Não Acredito que funcionou!")));

	public static List<Saida> listar() {
		return new ArrayList<>(saidas.values());
	}

	public static void cadastrar(Saida entrada) {
		System.out.println("Iniciando novo cadastro...");
		saidas.put(entrada.getId(), entrada);
		System.out.println("Cadastro finalizado!");
	}

	public static Saida buscar(long id) {
		return saidas.get(id);
	}

	public static void editar(Saida entrada) {
		System.out.println("Iniciando edicao de cadastro...");
		saidas.put(entrada.getId(), entrada);
		System.out.println("Edicao finalizada!");
	}

	public static void remover(long id) {
		System.out.println("Iniciando remocao de cadastro...");
		saidas.remove(id);
		System.out.println("Remocao finalizada!");
	}
	
}
