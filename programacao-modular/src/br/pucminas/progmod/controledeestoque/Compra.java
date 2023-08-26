package br.pucminas.progmod.controledeestoque;

import java.util.List;

public class Compra {
  private Fornecedor fornecedor;
  private List<ItemCompra> itens;

  // Adiciona um item a compra
  public void adicionarItem(Produto produto, int quantidade, double precoUnitario){
    //itens.addAll(produto);
  } 

  // Calcula o total da compra somando os totais de todos os itens
  public double calcularTotal() {
    return 0;
  }

  // Gera um relatorio da compra, incluindo os itens, quantidades e totais
  public void gerarRelatorio(){
    
  }
  
}