package br.pucminas.progmod.sistemabiblioteca.entidades;

import br.pucminas.progmod.sistemabiblioteca.enums.CategoriaNome;
import br.pucminas.progmod.sistemabiblioteca.enums.StatusLivro;

public class Livro {
	private String titulo;
	private String autor;
	private String isbn;
	private Categoria categoria;
	private StatusLivro status;

	public Livro(String titulo, String autor, StatusLivro status) {
		this.titulo = titulo;
		this.autor = autor;
		this.status = status;
	}

	public Livro(String titulo, String autor, String isbn, CategoriaNome categoria, StatusLivro status) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.categoria.setNome(categoria);
		this.status = status;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public StatusLivro getStatus() {
		return status;
	}

	public void setStatus(StatusLivro status) {
		this.status = status;
	}

	// emprestarLivro

	// reservaLivro fila usuario

	// historico : data de empréstimo, data de devolução e o usuário que fez o
	// empréstimo

}
