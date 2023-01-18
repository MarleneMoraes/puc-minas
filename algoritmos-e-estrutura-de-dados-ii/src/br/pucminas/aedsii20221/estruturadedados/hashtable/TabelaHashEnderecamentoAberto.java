package br.pucminas.aedsii20221.estruturadedados.hashtable;

import br.pucminas.aedsii20221.estruturadedados.Inteiro;

public class TabelaHashEnderecamentoAberto {
	private int M;
	private Inteiro tabelaHash[];
	
	public TabelaHashEnderecamentoAberto(int tamanho) {
		
		this.M = tamanho;
		
		tabelaHash = new Inteiro[this.M];
		for (int i = 0; i < this.M; i++)
			tabelaHash[i] = null;
	}
	
	private int funcaoHash(int chave, int i) {
		
		return (((chave % this.M) + i) % this.M);
	}
	
	public void inserir(Inteiro novo) throws Exception {
		
		int posicao, tentativa;
		boolean inseriu = false;
		
		tentativa = 0;
		
		while ((!inseriu) && (tentativa < this.M)) {
			posicao = funcaoHash(novo.getValor(), tentativa);
		
			if (tabelaHash[posicao] == null) {
				tabelaHash[posicao] = novo;
				inseriu = true;
			} else if (tabelaHash[posicao].getValor() == novo.getValor())
				throw new Exception("Erro ao tentar inserir o novo elemento na tabela hash: o elemento já foi inserido anteriormente!");
			else
				// colisão
				tentativa++;
		}
	}
	
	public Inteiro pesquisar(int chave) {
		
		int posicao, tentativa;
		
		tentativa = 0;
		
		while (tentativa < this.M) {
			posicao = funcaoHash(chave, tentativa);
		
			if ((tabelaHash[posicao] == null) || (tabelaHash[posicao].getValor() == chave))
				return tabelaHash[posicao];
			else
				// colisão
				tentativa++;
		}
		
		return null;
	}
	
	public void imprimir() {
		
		System.out.println("Conteúdo da tabela hash:");
		for (int i = 0; i < this.M; i++) {
			System.out.print("Posição: " + i + " --> ");
			if (tabelaHash[i] != null)
				tabelaHash[i].imprimir();
			else
				System.out.println("posição vazia");
		}
	}
}
