package br.pucminas.aedsii20222.estruturadedados.arvorebuscabinaria;

public class Jogo {
	private int dia;
	private int mes;
	private int ano;
	private String etapa;
	private String selecao1;
	private String selecao2;
	private int placarSelecao1;
	private int placarSelecao2;
	private String local;

	public Jogo() {
	}

	public Jogo(int dia, int mes, int ano, String etapa, String selecao1, String selecao2, int placarSelecao1,
			int placarSelecao2, String local) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.etapa = etapa;
		this.selecao1 = selecao1;
		this.selecao2 = selecao2;
		this.placarSelecao1 = placarSelecao1;
		this.placarSelecao2 = placarSelecao2;
		this.local = local;
	}

	public boolean verificarJogo(int dia, int mes, int ano, String selecao) {
		if (this.dia != dia)
			return false;

		if (this.mes != mes)
			return false;

		if (this.ano != ano)
			return false;

		if (this.selecao1.equals(selecao) || this.selecao2.equals(selecao))
			return true;

		return false;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getSelecao1() {
		return selecao1;
	}

	public void setSelecao1(String selecao1) {
		this.selecao1 = selecao1;
	}

	public String getSelecao2() {
		return selecao2;
	}

	public void setSelecao2(String selecao2) {
		this.selecao2 = selecao2;
	}

	public int getPlacarSelecao1() {
		return placarSelecao1;
	}

	public void setPlacarSelecao1(int placarSelecao1) {
		this.placarSelecao1 = placarSelecao1;
	}

	public int getPlacarSelecao2() {
		return placarSelecao2;
	}

	public void setPlacarSelecao2(int placarSelecao2) {
		this.placarSelecao2 = placarSelecao2;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Jogo clone() throws CloneNotSupportedException {
		return (Jogo) super.clone();
	}

	public static Jogo ler(String linha) {
		Jogo jogo = new Jogo();
		String[] strings = linha.split("#");

		jogo.setAno(Integer.parseInt(strings[0]));
		jogo.setEtapa(strings[1]);
		jogo.setDia(Integer.parseInt(strings[2]));
		jogo.setMes(Integer.parseInt(strings[3]));
		jogo.setSelecao1(strings[4]);
		jogo.setPlacarSelecao1(Integer.parseInt(strings[5]));
		jogo.setPlacarSelecao2(Integer.parseInt(strings[6]));
		jogo.setSelecao2(strings[7]);
		jogo.setLocal(strings[8]);

		return jogo;
	}

	public void imprimir() {
		System.out.println("[COPA " + this.getAno() + "] [" + this.getEtapa() + "] [" + this.getDia() + "/"
				+ this.getMes() + "] [" + this.getSelecao1() + " (" + this.getPlacarSelecao1() + ") x ("
				+ this.getPlacarSelecao2() + ") " + this.getSelecao2() + "] [" + this.getLocal() + "]");
	}
}