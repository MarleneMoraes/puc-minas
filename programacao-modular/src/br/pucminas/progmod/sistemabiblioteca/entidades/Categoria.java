package br.pucminas.progmod.sistemabiblioteca.entidades;

import br.pucminas.progmod.sistemabiblioteca.enums.CategoriaNome;

public class Categoria {
	private CategoriaNome nome;
	private String descricao;

	public Categoria(CategoriaNome nome, String descricao) {
		this.nome = nome;
		this.descricao = descricao;
	}

	public CategoriaNome getNome() {
		return nome;
	}

	public void setNome(CategoriaNome nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
