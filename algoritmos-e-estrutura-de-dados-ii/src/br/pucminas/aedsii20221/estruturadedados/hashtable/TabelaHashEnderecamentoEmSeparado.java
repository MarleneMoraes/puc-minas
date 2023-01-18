package br.pucminas.aedsii20221.estruturadedados.hashtable;

import br.pucminas.aedsii20221.estruturadedados.Inteiro;

public class TabelaHashEnderecamentoEmSeparado {
	private int M;
	private ListaEncadeada tabelaHash[];
	
	public TabelaHashEnderecamentoEmSeparado(int tamanho) {
		
		this.M = tamanho;
		
		tabelaHash = new ListaEncadeada[this.M];
		for (int i = 0; i < M; i++)
			tabelaHash[i] = new ListaEncadeada();
	}
	
	private int funcaoHash(int chave) {
		
		return (chave % this.M);
	}
	
	public void inserir(Inteiro novo) throws Exception {
		
		int posicao;
		
		posicao = funcaoHash(novo.getValor());
		
		if (tabelaHash[posicao].pesquisar(novo.getValor()) == null)
			tabelaHash[posicao].inserir(novo, 0);
		else
			throw new Exception("Não foi possível inserir o novo elemento na tabela hash: o elemento já havia sido inserido anteriormente!");
	}
	
	public Inteiro pesquisar(int chave) {
		
		int posicao;
		
		posicao = funcaoHash(chave);
		
		return tabelaHash[posicao].pesquisar(chave);
	}
	
	public void imprimir() {
		
		System.out.println("Conteúdo da tabela hash:");
		for (int i = 0; i < M; i++) {
			System.out.println("Posição: " + i);
			try {
				tabelaHash[i].imprimir();
			} catch (Exception erro) {
				System.out.println(erro.getMessage());
			}
		}
	}
}
