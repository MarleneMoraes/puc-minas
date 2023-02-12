package br.pucminas.aedsii.serie.tabelahashemseparado;

import br.pucminas.aedsii.estruturadedados.Celula;
import br.pucminas.aedsii.estruturadedados.Inteiro;

public class ListaEncadeada {
	private Celula primeiro;
	private Celula ultimo;
	private int tamanho;
	
	ListaEncadeada() {
	
		Celula sentinela = new Celula();
		primeiro = sentinela;
		ultimo = sentinela;
		tamanho = 0;
	}
	
	public boolean listaVazia() {
		
		if (primeiro == ultimo)
			return true;
		
		return false;
	}
	
	public void inserir (Inteiro item, int posicao) throws Exception {
		
		if ((posicao >= 0) && (posicao <= tamanho)) {
			Celula aux = this.primeiro;
			
			for (int i = 0; i < posicao; i++)
				aux = aux.getProximo();
				
			Celula nova = new Celula(item);
			
			Celula proxima = aux.getProximo();
			aux.setProximo(nova);
			nova.setProximo(proxima);
				
			if (posicao == tamanho)
				ultimo = nova;
				
			tamanho++;
		} else
			throw new Exception ("Não foi possível inserir o item na lista: posição inválida!");
	}
	
	public Inteiro retirar (int posicao) throws Exception {
	
		Inteiro item = null;
		
		if (! listaVazia() ) {
			if ((posicao >= 0) && (posicao < tamanho)) {
				Celula aux = this.primeiro;
				
				for (int i = 0; i < posicao; i++)
					aux = aux.getProximo();
				
				Celula retirada = aux.getProximo();
				
				Celula proxima = retirada.getProximo();
				
				aux.setProximo(proxima);
				
				if (ultimo == retirada)
					ultimo = aux;
				
				tamanho--;
				
				item = retirada.getItem();
				
			} else
				throw new Exception ("Não foi possível retirar o item da lista: posição inválida!");
		} else
			throw new Exception ("Não foi possível retirar o item da lista: a lista está vazia!");
	
		return item;
	}
	
	public Inteiro pesquisar(int dado) {
	    
    	Celula aux = primeiro.getProximo();
    	
    	while (aux != null) {
    		if (aux.getItem().getValor() == dado) {
    			return aux.getItem();
    		}
    		aux = aux.getProximo();
    	}
    	return null;
    }
	
	public void imprimir() throws Exception {
		
		if (! listaVazia() ) {
			Celula aux = primeiro.getProximo();
			
			while (aux != null) {
				aux.getItem().imprimir();
				aux = aux.getProximo();
			}
		} else
			throw new Exception ("A lista está vazia!");
	}
}

