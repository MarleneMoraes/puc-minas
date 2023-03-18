package br.pucminas.aedsii.jogadornba.poo;

public class Jogador {

	private int id;
	private String nome;
	private int altura;
	private int peso;
	private String universidade;
	private int anoNascimento;
	private String cidadeNascimento;
	private String estadoNascimento;

	public Jogador() { }

	public Jogador(int id, String nome, int altura, int peso, String universidade, int anoNascimento,
			String cidadeNascimento, String estadoNascimento) {
		super();
		this.id = id;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.universidade = universidade;
		this.anoNascimento = anoNascimento;
		this.cidadeNascimento = cidadeNascimento;
		this.estadoNascimento = estadoNascimento;
	}

	public boolean verificarJogador(int id) {
		if (this.id == id)
			return true;

		return false;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getUniversidade() {
		return universidade;
	}

	public void setUniversidade(String universidade) {
		this.universidade = universidade;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public String getCidadeNascimento() {
		return cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}

	public String getEstadoNascimento() {
		return estadoNascimento;
	}

	public void setEstadoNascimento(String estadoNascimento) {
		this.estadoNascimento = estadoNascimento;
	}

	public Jogador clone() throws CloneNotSupportedException {
		return (Jogador) super.clone();
	}

	public static Jogador ler(String linha) {
		Jogador jogador = new Jogador();
		String[] strings = linha.split(",");

		jogador.setId(Integer.parseInt(strings[0]));
		jogador.setNome(strings[1]);
		
		if(strings[2].equals("")) {
			jogador.setAltura(Integer.parseInt("nao informado"));
		} else {
			jogador.setAltura(Integer.parseInt(strings[2]));			
		}
		
		if(strings[3].equals("")) {
			jogador.setPeso(Integer.parseInt("nao informado"));
		} else {
			jogador.setPeso(Integer.parseInt(strings[3]));			
		}
		
		jogador.setUniversidade(strings[4]);
		
		if(strings[5].equals("")) {
			jogador.setAnoNascimento(Integer.parseInt("nao informado"));
		} else {
			jogador.setAnoNascimento(Integer.parseInt(strings[5]));			
		}

		jogador.setCidadeNascimento(strings[6]);
		
		jogador.setEstadoNascimento(strings[7]);

		// Caso o jogador tenha informacoes vazias

		for (int i = 0; i < strings.length; i++) {
			if (strings[i].equals("")) {
				switch (i) {
				case 4:
					jogador.setUniversidade("nao informado");
					break;
				case 6:
					jogador.setCidadeNascimento("nao informado");
					break;
				case 7:
					jogador.setEstadoNascimento("nao informado");
					break;
				}
			}
		}
		return jogador;
	}

	public void imprimir() {
		System.out.println("[" + this.getId() + " ## " + this.getNome() + " ## " + this.getAltura() + " ## "
				+ this.getPeso() + " ## " + this.getAnoNascimento() + " ## " + this.getUniversidade() + " ## "
				+ this.getCidadeNascimento() + " ## " + this.getEstadoNascimento() + "]");
	}
}