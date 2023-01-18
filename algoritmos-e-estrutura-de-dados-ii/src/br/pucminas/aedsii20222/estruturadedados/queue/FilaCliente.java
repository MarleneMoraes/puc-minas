package br.pucminas.aedsii20222.estruturadedados.queue;

import java.time.LocalDateTime;

public class FilaCliente {

	private CelulaCliente frente; // referência ao cliente que está na frente da fila. Esse cliente é utilizado apenas para controle.
    private CelulaCliente tras;   // referência ao cliente que está na última posição da fila.

    // Construtor que cria uma fila vazia inicializando o cliente da frente da fila e os atributos de controle da fila (frente e tras).
    public FilaCliente() {
        LocalDateTime horaChegada = LocalDateTime.now();
        Cliente cli = new Cliente(" ", horaChegada);
        CelulaCliente celula = new CelulaCliente(cli);
        
        frente = celula;
        tras = celula;
    }

    // Verifica se a fila está vazia. Em caso afirmativo, retorna true e em caso negativo retorna false.
    public Boolean filaVazia() {
        // Se a fila apresentar apenas o elemento de controle, ela está vazia.
        if (frente == tras)
            return true;
        
        return false;
    }

    // Insere o item da fila cli, passado como parâmetro para esse método, no final da fila.
    public void enfileirar(Cliente cli) {
    	// inserção do novo cliente no final da fila.
        tras.proximo = new CelulaCliente(cli);
    	
    	// atualização do atributo de controle tras.
        tras = tras.proximo;
    	tras.item = cli;
    }

    // Retira o cliente que ocupa a primeira posição da fila. Se a fila estiver vazia, esse método deve retornar null; caso contrário, esse método deve retornar o cliente retirado da fila.
    public Cliente desenfileirar() {
    	
        if (!(filaVazia())) {
        	// aux aponta para o cliente da fila que será retornado/desenfileirado, ou seja, o primeiro cliente da fila.
        	CelulaCliente aux = frente.proximo;
        	
            // atualização do primeiro cliente da fila.
            frente.proximo = aux.proximo;
            
            Cliente cli = aux.item;
            aux.proximo = null;
            
            if (aux == tras)
            	tras = frente;

            return (cli);
        }
        
        return null;
    }
}