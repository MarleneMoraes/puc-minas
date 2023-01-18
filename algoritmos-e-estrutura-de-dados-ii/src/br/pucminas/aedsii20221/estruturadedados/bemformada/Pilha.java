package br.pucminas.aedsii20221.estruturadedados.bemformada;

public class Pilha {

	private Character pilha[];
	private char topo;

	public Pilha(int tamanho) {
		pilha = new Character[tamanho];
		topo = 0;
	}

	public boolean pilhaCheia() {
		if (topo == pilha.length)
			return true;

		return false;
	}

	public boolean pilhaVazia() {
		if (topo == 0)
			return true;

		return false;
	}

	public Character desempilhar() {
    
		if (!pilhaVazia()) {
			topo--;
			return pilha[topo];
		} 

    return null;
	}

	public void empilhar(Character novo) {
    
		if (!pilhaCheia()) {
			pilha[topo] = novo;
			topo++;
		} 
	
  }

	public Character consultarTopo() {

		if (!pilhaVazia()) {
			return (pilha[topo - 1]);
		} 

    return null;
	}
}