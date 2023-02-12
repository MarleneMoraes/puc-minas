package br.pucminas.aedsii.estruturadedados.queue;

import java.time.LocalDateTime;

public class TestaFila {

	public static void main(String[] args) throws InterruptedException {
		
        FilaCliente filaLanchonete = new FilaCliente();
        Cliente cli = new Cliente("Eveline", LocalDateTime.now());
        filaLanchonete.enfileirar(cli);
        Thread.sleep(1000);
        
        cli = new Cliente("João", LocalDateTime.now());
        filaLanchonete.enfileirar(cli);
        Thread.sleep(1000);
        
        cli = new Cliente("Ana", LocalDateTime.now());
        filaLanchonete.enfileirar(cli);
        Thread.sleep(1000);
        
        cli = filaLanchonete.desenfileirar();
        System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Eveline
        
        cli = filaLanchonete.desenfileirar();
        System.out.println("O cliente " + cli.getNome() + " foi atendido."); // João
        
        cli = filaLanchonete.desenfileirar();
        System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Ana
    	
        cli = new Cliente("Joaquim", LocalDateTime.now());
        filaLanchonete.enfileirar(cli);
        
        cli = filaLanchonete.desenfileirar();
        System.out.println("O cliente " + cli.getNome() + " foi atendido."); // Joaquim
	}
}