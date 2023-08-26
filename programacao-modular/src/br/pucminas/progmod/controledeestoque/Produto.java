package br.pucminas.progmod.controledeestoque;

public class Produto {
	private final int codigo;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEmEstoque;
	
	public Produto(int codigo, String nome, String descricao, double precoUnitario, int quantidadeEmEstoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	// Retorna a quantidade em estoque do produto
	public int getQuantidadeEmEstoque() {
		return this.quantidadeEmEstoque;
	}

	// Registra a entrada de produtos no estoque
	public void registrarEntrada(int quantidade) {
		this.quantidadeEmEstoque += quantidade;
	}

	// Registra a saida de produtos do estoque
	public void registrarSaida(int quantidade) {
		this.quantidadeEmEstoque -= quantidade;
	}
}