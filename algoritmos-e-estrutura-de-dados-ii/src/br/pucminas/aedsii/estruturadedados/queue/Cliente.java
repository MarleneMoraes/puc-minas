package br.pucminas.aedsii.estruturadedados.queue;

import java.time.LocalDateTime;

public class Cliente {

	private String nome;                  // nome do cliente.
	private LocalDateTime horarioChegada; // data e hora de chegada do cliente.
	
	// Construtor que inicializa os atributos nome e horarioChegada com os valores passados através dos parâmetros nomeCliente e chegada desse método, respectivamente.
	public Cliente(String nomeCliente, LocalDateTime chegada){
	    this.nome = nomeCliente;
	    setHorarioChegada(chegada);
	}
	
	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}
	
	public LocalDateTime getHorarioChegada(){
		return horarioChegada;
	}

	public void setHorarioChegada(LocalDateTime horarioChegada){
		this.horarioChegada = horarioChegada;
	}
}
