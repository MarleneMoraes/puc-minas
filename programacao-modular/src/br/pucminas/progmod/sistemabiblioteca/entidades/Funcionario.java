package br.pucminas.progmod.sistemabiblioteca.entidades;

public class Funcionario extends Pessoa {
	private String cargo;

	public Funcionario(String cargo) {
		super();
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
}
