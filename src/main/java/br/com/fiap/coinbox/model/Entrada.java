package br.com.fiap.coinbox.model;

public class Entrada extends Controle {
	
	private String dataRecebimento;
	
	
	public Entrada(long id, String nome, String dataRecebimento, String valor, String descricao) {
		super();
		this.dataRecebimento = dataRecebimento;
		
	}
	public String getDataCompra() {
		return dataRecebimento;
	}
	public void setDataCompra(String dataRecebimento) {
		this.dataRecebimento = dataRecebimento;
	}
	


}
