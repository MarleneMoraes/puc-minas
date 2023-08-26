package br.pucminas.progmod.sistemabiblioteca.entidades;

import java.util.List;

import br.pucminas.progmod.sistemabiblioteca.enums.StatusUsuario;

public class Usuarios extends Pessoa {

	private String endereco;
	private StatusUsuario status;
	private List<Livro> livrosEmprestados;
	private List<Livro> hitoricoEmprestimos;
	private List<Livro> listaReserva;

	public Usuarios(String id, String nome, String endereco) {
		super();
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
