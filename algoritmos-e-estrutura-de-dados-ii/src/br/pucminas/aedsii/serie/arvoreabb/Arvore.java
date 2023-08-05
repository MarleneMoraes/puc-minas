package br.pucminas.aedsii.serie.arvoreabb;

import br.pucminas.aedsii.serie.Serie;

public class Arvore {
	private No raiz;

    public Arvore() {
        raiz = null;
    }

    public Serie pesquisar(String chave) {
        return pesquisar(this.raiz, chave);
    }

    private Serie pesquisar(No raizSubarvore, String chave) {

        if (raizSubarvore == null)
            return null;
        else if (chave.compareTo(raizSubarvore.getItem().getNome()) == 0)
            return raizSubarvore.getItem();
        else if (chave.compareTo(raizSubarvore.getItem().getNome()) > 0)
            return pesquisar(raizSubarvore.getDireita(), chave);
        else
            return pesquisar(raizSubarvore.getEsquerda(), chave);
    }

    public void inserir(Serie novo) throws Exception {
        this.raiz = inserir(this.raiz, novo);
    }

    private No inserir(No raizSubarvore, Serie novo) throws Exception {

        if (raizSubarvore == null)
            raizSubarvore = new No(novo);
        else if (novo == raizSubarvore.getItem())
            throw new Exception("Não foi possível inserir o item na árvore: chave já inseriada anteriormente!");
        else if (novo.getNome().compareTo(raizSubarvore.getItem().getNome()) < 0)
            raizSubarvore.setEsquerda(inserir(raizSubarvore.getEsquerda(), novo));
        else
            raizSubarvore.setDireita(inserir(raizSubarvore.getDireita(), novo));

        return raizSubarvore;
    }

    public void remover(Serie chaveRemover) throws Exception {
        this.raiz = remover(this.raiz, chaveRemover);
    }

    private No remover(No raizSubarvore, Serie chaveRemover) throws Exception {

        if (raizSubarvore == null)
            throw new Exception("Não foi possível remover o item da árvore: chave não encontrada!");
        else if (chaveRemover.getNome().equals(raizSubarvore.getItem().getNome())) {
            if (raizSubarvore.getEsquerda() == null)
                raizSubarvore = raizSubarvore.getDireita();
            else if (raizSubarvore.getDireita() == null)
                raizSubarvore = raizSubarvore.getEsquerda();
            else
                raizSubarvore.setEsquerda(antecessor(raizSubarvore, raizSubarvore.getEsquerda()));
        } else if (chaveRemover.getNome().compareTo(raizSubarvore.getItem().getNome()) > 0)
            raizSubarvore.setDireita(remover(raizSubarvore.getDireita(), chaveRemover));
        else
            raizSubarvore.setEsquerda(remover(raizSubarvore.getEsquerda(), chaveRemover));

        return raizSubarvore;
    }

    private No antecessor(No noRetirar, No raizSubarvore) {

        if (raizSubarvore.getDireita() != null)
            raizSubarvore.setDireita(antecessor(noRetirar, raizSubarvore.getDireita()));
        else {
            noRetirar.setItem(raizSubarvore.getItem());
            raizSubarvore = raizSubarvore.getEsquerda();
        }

        return raizSubarvore;
    }

    public void caminhamentoEmOrdem() {
        caminhamentoEmOrdem(this.raiz);
    }

    private void caminhamentoEmOrdem(No raizSubarvore) {

        if (raizSubarvore != null) {
            caminhamentoEmOrdem(raizSubarvore.getEsquerda());
            raizSubarvore.getItem().imprimir();
            caminhamentoEmOrdem(raizSubarvore.getDireita());
        }
    }
}
