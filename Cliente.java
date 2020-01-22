package br.com.modificadoresdeacesso;

public class Cliente {
	private String nome;
	private String endereco;
	
	public Cliente (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
		
		this.dizer_oi();
	}
	public void dizer_oi () {
		System.out.println("Oi!!!");
	}
}
