package br.pucminas.aedsii.jogo.arvorebuscabinaria;

import br.pucminas.aedsii.jogo.Jogo;

public class No {
    private Jogo item;
    private No esquerda;
    private No direita;

    public No() {
        item = new Jogo();
        esquerda = null;
        direita = null;
    }

    public No(Jogo registro) {
        item = registro;
        esquerda = null;
        direita = null;
    }

    public Jogo getItem() {
        return item;
    }
    public void setItem(Jogo item) {
        this.item = item;
    }

    public No getEsquerda() {
        return esquerda;
    }
    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }
    public void setDireita(No direita) {
        this.direita = direita;
    }
}
