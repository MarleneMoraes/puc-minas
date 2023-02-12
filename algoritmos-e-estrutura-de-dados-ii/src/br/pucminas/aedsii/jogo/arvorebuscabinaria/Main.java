package br.pucminas.aedsii.jogo.arvorebuscabinaria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();

		int jogosAdd = 0;
		Jogo[] jogosBuscados = preencherVetor(jogos, scan, jogosAdd);

		//jogosBuscados = bubbleSort(jogosBuscados, jogosAdd);

		for (Jogo jogo : jogosBuscados) {
			if(jogo != null) 
				jogo.imprimir();
		}

		scan.close();
	}

	//Preenchimento do vetor de Jogos atraves da leitura de arquivos
	private static Jogo[] preencherJogos() {
		String PATH = "C:\\_workspace\\puc-minas\\algoritmos-e-estrutura-de-dados-ii"
				+ "\\src\\br\\pucminas\\aedsii20222\\estruturadedados\\partidas.txt"; // No VERDE: "tmp\partidas.txt"
		
		Jogo[] jogos = new Jogo[900];

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura(PATH);

		String linha = arqLeitura.ler();

		for (int i = 0; i < jogos.length; i++) {
			if(linha != null) 
				jogos[i] = Jogo.ler(linha);

			linha = arqLeitura.ler();
		}

		arqLeitura.fecharArquivo();

		return jogos;
	}

	//Preenchimento do vetor de Jogos atraves da busca inserida no console
	private static Jogo[] preencherVetor(Jogo[] jogos, Scanner scan, int jogosAdd) {
		Jogo[] jogosBuscados = new Jogo[350];

		int numeroBuscas = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < numeroBuscas; i++) {
			String busca = scan.nextLine();

			if (buscarJogo(jogos, busca) != null)
				jogosBuscados[jogosAdd++] = buscarJogo(jogos, busca);

		}

		return jogosBuscados;
	}

	// Busca de jogo solicitada pelo console
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
}
