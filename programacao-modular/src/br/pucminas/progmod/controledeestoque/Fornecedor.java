package br.pucminas.progmod.controledeestoque;

public class Fornecedor {
	private final int codigo;
	private String nome;
	private String contato;

	public Fornecedor(int codigo, String nome, String contato) {
		this.codigo = codigo;
		this.nome = nome;
		this.contato = contato;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
}