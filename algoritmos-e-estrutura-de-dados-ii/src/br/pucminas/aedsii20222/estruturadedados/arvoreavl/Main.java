package br.pucminas.aedsii20222.estruturadedados.arvoreavl;

import java.util.Scanner;

import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();
		Arvore arvoreAVL = preencherArvore(jogos, scan);

		arvoreAVL = procedimentos(arvoreAVL, scan);
		
		scan.close();
	}
	// Metodos

	public static Jogo buscarJogo(Jogo[] jogos, String busca) {
		String[] dadosJogo = busca.split(";");
		String[] data = dadosJogo[0].split("/");

		int dia = Integer.parseInt(data[0]);
		int mes = Integer.parseInt(data[1]);
		int ano = Integer.parseInt(data[2]);
		String selecao = dadosJogo[1];

		for (Jogo jogo : jogos) {
			if (jogo == null)
				break;

			if (jogo.verificarJogo(dia, mes, ano, selecao))
				return jogo;
		}

		return null;
	}
	
	public static Jogo buscarJogo(Arvore arvore, String busca) {
		String[] dadosJogo = busca.split(";");
		String[] data = dadosJogo[0].split("/");

		int dia = Integer.parseInt(data[0]);
		int mes = Integer.parseInt(data[1]);
		int ano = Integer.parseInt(data[2]);
		String selecao = dadosJogo[1];
		
		Jogo jogo = new Jogo();
		jogo.setDia(dia);
		jogo.setMes(mes);
		jogo.setAno(ano);
		jogo.setSelecao1(selecao);

		if (arvore.pesquisar(ano) == null)
			break;
		else if ((arvore.pesquisar(mes) == null))
			break;
		else if (arvore.pesquisar(dia) == null)
			break;
		else if ((arvore.pesquisar(selecao) == null))
			break;
		else
			return jogo;
		

		return null;
	}

	// Preenchimento do vetor de objetos da classe Jogo
	public static Jogo[] preencherJogos() {
		Jogo[] jogos = new Jogo[900];

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("partidas.txt"); // ao testar, substituir por
																					// \tmp\partidas

		for (int i = 0; i < jogos.length; i++) {
			String linha = arqLeitura.ler();

			if (linha == null)
				break;

			jogos[i] = Jogo.ler(linha);
		}

		arqLeitura.fecharArquivo();

		return jogos;
	}

	public static Arvore preencherArvore(Jogo[] jogos, Scanner scan) {
		String busca = scan.nextLine();
		Arvore arvore = new Arvore();

		while (!busca.equals("FIM")) {
			Jogo jogo = buscarJogo(jogos, busca);

			if (jogo != null) {
				try {
					arvore.inserir(jogo);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			busca = scan.nextLine();
		}

		return arvore;
	}

	public static Arvore procedimentos(Jogo[] jogos, Arvore arvore, Scanner scan) {
		String busca = scan.nextLine();
		
		buscarJogos(arvore, busca);

		while(!busca.equals("FIM")) {
			if(arvore.pesquisar(serie) != null)
				System.out.println("SIM");
			else 
			  	System.out.println("NAO");
		}

		return arvore;
	}

	// Arquivo log

	private static void criarArquivoLog() {
		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_arvoreAVL.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de comparacoes realizadas: " + comparacao);

		escrita.fecharArquivo();
	}
}
