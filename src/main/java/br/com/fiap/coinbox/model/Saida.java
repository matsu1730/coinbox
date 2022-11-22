package br.com.fiap.coinbox.model;

public class Saida extends Controle {

	private String dataCompra;

	public Saida(long id, String nome, String dataCompra, String valor, String descricao) {
		super();
		this.dataCompra = dataCompra;

	}

	public String getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}

}
