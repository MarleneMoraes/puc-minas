package br.pucminas.progmod.controledeestoque;

public class ItemCompra {
	private Produto produto;
	private int quantidade;
	private double precoUnitario;

	// Calcula o total do item
	public double calcularTotal() {
		
		if (produto.getQuantidadeEmEstoque() < quantidade) {
			System.out.println("Estoque indisponível");
			return 0.00;
		}
		
		return quantidade * precoUnitario;
	}
}
