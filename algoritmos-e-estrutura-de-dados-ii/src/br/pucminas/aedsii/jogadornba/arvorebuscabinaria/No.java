package br.pucminas.aedsii.jogadornba.arvorebuscabinaria;

public class No {
    private Jogador item;
    private No esquerda;
    private No direita;

    public No() {
        item = new Jogador();
        esquerda = null;
        direita = null;
    }

    public No(Jogador registro) {
        item = registro;
        esquerda = null;
        direita = null;
    }

    public Jogador getItem() {
        return item;
    }
    public void setItem(Jogador item) {
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