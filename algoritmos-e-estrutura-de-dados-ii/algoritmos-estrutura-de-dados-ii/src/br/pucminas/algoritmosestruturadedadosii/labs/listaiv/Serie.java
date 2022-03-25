package br.pucminas.algoritmosestruturadedadosii.labs.listaiv;

import java.util.Scanner;

public class Serie {
	private String nome;
	private String formato;
	private String duracao;
	private String paisDeOrigem;
	private String idiomaDeOrigem;
	private String emissoraDeTelevisaoOriginal;
	private String DataDeInicio;
	private int numeroDeTemporadas;
	private int numeroDeEpisodios;
	
	
	
	
	public Serie() { }
	
	public Serie(String nome, String formato, String duracao, String paisDeOrigem, String idiomaDeOrigem,
			String emissoraDeTelevisaoOriginal, String dataDeInicio, int numeroDeTemporadas, int numeroDeEpisodios) {
		this.nome = nome;
		this.formato = formato;
		this.duracao = duracao;
		this.paisDeOrigem = paisDeOrigem;
		this.idiomaDeOrigem = idiomaDeOrigem;
		this.emissoraDeTelevisaoOriginal = emissoraDeTelevisaoOriginal;
		DataDeInicio = dataDeInicio;
		this.numeroDeTemporadas = numeroDeTemporadas;
		this.numeroDeEpisodios = numeroDeEpisodios;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getPaisDeOrigem() {
		return paisDeOrigem;
	}

	public void setPaisDeOrigem(String paisDeOrigem) {
		this.paisDeOrigem = paisDeOrigem;
	}

	public String getIdiomaDeOrigem() {
		return idiomaDeOrigem;
	}

	public void setIdiomaDeOrigem(String idiomaDeOrigem) {
		this.idiomaDeOrigem = idiomaDeOrigem;
	}

	public String getEmissoraDeTelevisaoOriginal() {
		return emissoraDeTelevisaoOriginal;
	}

	public void setEmissoraDeTelevisaoOriginal(String emissoraDeTelevisaoOriginal) {
		this.emissoraDeTelevisaoOriginal = emissoraDeTelevisaoOriginal;
	}

	public String getDataDeInicio() {
		return DataDeInicio;
	}

	public void setDataDeInicio(String dataDeInicio) {
		DataDeInicio = dataDeInicio;
	}

	public int getNumeroDeTemporadas() {
		return numeroDeTemporadas;
	}

	public void setNumeroDeTemporadas(int numeroDeTemporadas) {
		this.numeroDeTemporadas = numeroDeTemporadas;
	}

	public int getNumeroDeEpisodios() {
		return numeroDeEpisodios;
	}

	public void setNumeroDeEpisodios(int numeroDeEpisodios) {
		this.numeroDeEpisodios = numeroDeEpisodios;
	}

	public void ler() {
		MyIO.print("Título: ");
		this.setNome(MyIO.readString());
		
		MyIO.print("Formato: ");
		this.setFormato(MyIO.readString());
		
		MyIO.print("Duração: ");
		this.setDuracao(MyIO.readString());
		
		MyIO.print("País de Origem: ");
		this.setPaisDeOrigem(MyIO.readString());
		
		MyIO.print("Idioma de Origem: ");
		this.setIdiomaDeOrigem(MyIO.readString());
		
		MyIO.print("Emissora de televisão original: ");
		this.setEmissoraDeTelevisaoOriginal(MyIO.readString());
		
		MyIO.print("Data de Início da Transmissão Original: ");
		this.setDataDeInicio(MyIO.readString());
		
		MyIO.print("Número de Temporadas: ");
		this.setNumeroDeTemporadas(MyIO.readInt());
		
		MyIO.print("Número de Episódios: ");
		this.setNumeroDeEpisodios(MyIO.readInt());
		
	}
	
	public void imprimir() {
		System.out.println(this.getNome() + " ## " + this.getFormato() + " ## " + this.getDuracao() + " ## " + 
						   this.getPaisDeOrigem() + " ## " + this.getEmissoraDeTelevisaoOriginal() + " ## " + 
						   this.getDataDeInicio() + " ## " + this.getNumeroDeTemporadas() + " ## " + 
						   this.getNumeroDeEpisodios());
	}
	
	
}
