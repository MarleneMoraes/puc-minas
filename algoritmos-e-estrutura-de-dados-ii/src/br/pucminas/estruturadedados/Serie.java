package br.pucminas.estruturadedados;

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
	
  public Serie(String nome, String formato, String duracao, String paisDeOrigem, String idiomaDeOrigem, String emissoraDeTelevisaoOriginal, String dataDeInicio, int numeroDeTemporadas, int numeroDeEpisodios) {
		this.nome = nome;
		this.formato = formato;
		this.duracao = duracao;
		this.paisDeOrigem = paisDeOrigem;
		this.idiomaDeOrigem = idiomaDeOrigem;
		this.emissoraDeTelevisaoOriginal = emissoraDeTelevisaoOriginal;
		this.DataDeInicio = dataDeInicio;
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
		this.DataDeInicio = dataDeInicio;
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

    public Serie clone() throws CloneNotSupportedException {
		return (Serie) super.clone();
  }

	public void ler() {
    Serie newSerie = new Serie();
		String s = MyIO.readLine();
		
		while (!s.equals("FIM")) {
			if ( s.indexOf(";") > -1 ) {
				String[] stringArray = s.split(";");
				
				if (stringArray.length > 0) {
					newSerie.setNome(stringArray[0]);
					newSerie.setFormato(stringArray[1]);
					newSerie.setDuracao(stringArray[2]);
					newSerie.setPaisDeOrigem(stringArray[3]);
					newSerie.setIdiomaDeOrigem(stringArray[4]);
					newSerie.setEmissoraDeTelevisaoOriginal(stringArray[5]);
					newSerie.setDataDeInicio(stringArray[6]);
					newSerie.setNumeroDeTemporadas(Integer.parseInt(stringArray[7]));
					newSerie.setNumeroDeEpisodios(Integer.parseInt(stringArray[8]));
				}
				
				newSerie.imprimir();				
			}			
			s = MyIO.readLine();
		}
	}
	
	public void imprimir() {
		MyIO.println(this.getNome() + " ## " + 
							this.getFormato() + " ## " +
							this.getDuracao() + " ## " + 
						    this.getPaisDeOrigem() + " ## " +
						    this.getIdiomaDeOrigem() + " ## " +                    							
							this.getEmissoraDeTelevisaoOriginal() + " ## " + 
						    this.getDataDeInicio() + " ## " + 
							this.getNumeroDeTemporadas() + " ## " + 
						    this.getNumeroDeEpisodios());
	}
	
}