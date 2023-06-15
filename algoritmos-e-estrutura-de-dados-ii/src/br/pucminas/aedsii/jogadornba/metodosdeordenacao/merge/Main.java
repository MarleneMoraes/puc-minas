package br.pucminas.aedsii.jogadornba.metodosdeordenacao.merge;

import java.io.*;
import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		mergesort();

	}

	// Busca jogador pelo id
	public static Jogador buscarJogador(Jogador[] jogador, int id) {
		for (int i = 0; i < jogador.length; i++) {
			if (jogador[i] == null)
				continue;

			if (jogador[i].verificarJogador(id))
				return jogador[i];
		}

		return null;
	}

	// Verificacao da palavra "FIM", na entrada
	public static boolean isFim(String s) {
		return (s.length() == 3 && s.equals("FIM"));
	}

	// Preenchimento do vetor principal atraves da leitura de arquivos
	private static Jogador[] preencherJogadores() throws FileNotFoundException {
		Jogador[] jogadores = new Jogador[4000];
		Scanner arqLeitura = new Scanner(new File(
				"jogadores.txt"));

		int i = -1;

		while (arqLeitura.hasNextLine()) {
			String linha = arqLeitura.nextLine();
			if (i != -1)
				jogadores[i] = Jogador.ler(linha);

			i++;
		}
		arqLeitura.close();

		return jogadores;
	}

	// Armazenamento de jogadores encontrados para realizacao do mergesort
	private static Jogador[] armazenarJogadores(Scanner scan) throws FileNotFoundException {
		String entrada = scan.nextLine();
		Jogador[] jogadores = preencherJogadores();
		Jogador[] jogadoresEncontrados = new Jogador[4000];
		int tamanho = 0;

		for (int j = 0; !isFim(entrada); j++) {
			int id = Integer.parseInt(entrada);

			Jogador jogador = buscarJogador(jogadores, id);

			if (jogador != null) {
				tamanho++;
				jogadoresEncontrados[j] = jogador;
			}

			entrada = scan.nextLine();
		}

		return construirVetor(jogadoresEncontrados, tamanho);
	}

	// Construcao do vetor para realizar no mergesort com tamanho exato
	private static Jogador[] construirVetor(Jogador[] jogadoresEncontrados, int tamanho) {
		Jogador[] jogadoresOrdenados = new Jogador[tamanho];

		for (int i = 0; i < jogadoresOrdenados.length; i++)
			jogadoresOrdenados[i] = jogadoresEncontrados[i];

		return jogadoresOrdenados;
	}

	// Ordenacao por mescla (metodo principal)
	public static void mergesort() throws FileNotFoundException {
		MyIO.setCharset("UTF-8");
		Scanner scan = new Scanner(System.in);
		Jogador[] jogadoresOrdenados = armazenarJogadores(scan);

		int troca = 0;
		int comparacao = 0;

		mergesort(jogadoresOrdenados, 0, jogadoresOrdenados.length - 1, comparacao, troca);

		for (Jogador jogador : jogadoresOrdenados)
			jogador.imprimir();

		criarArquivoLog(troca, comparacao);
	}

	// Ordenacao por mescla
	private static void mergesort(Jogador[] jogadores, int esq, int dir, int comparacao, int troca) {
		if (esq < dir) {
			int meio = (esq + dir) / 2;
			mergesort(jogadores, esq, meio, comparacao, troca);
			mergesort(jogadores, meio + 1, dir, comparacao, troca);

			int i, j, k;

			// Definir tamanho dos dois subarrays
			int n1 = meio - esq + 1;
			int n2 = dir - meio;

			Jogador[] a1 = new Jogador[n1];
			Jogador[] a2 = new Jogador[n2];

			for (i = 0; i < n1; i++)
				a1[i] = jogadores[esq + i];

			for (j = 0; j < n2; j++)
				a2[j] = jogadores[meio + j + 1];

			for (i = j = 0, k = esq; (i < n1 && j < n2); k++) {
				if ((a1[i].getUniversidade().compareTo(a2[j].getUniversidade()) <= 0)
						|| (a1[i].getUniversidade().equals(a2[j].getUniversidade()))
								&& (a1[i].getNome().compareTo(a2[j].getNome()) <= 0))
					jogadores[k] = a1[i++];
				else
					jogadores[k] = a2[j++];
			}

			if (i == n1)
				for (; k <= dir; k++)
					jogadores[k] = a2[j++];

			else
				for (; k <= dir; k++)
					jogadores[k] = a1[i++];

		}
	}

	// Criacao de arquivo de log de armazenamento
	private static void criarArquivoLog(int troca, int comparacao) {
		long tempoExecucao = System.currentTimeMillis();

		try {
			FileWriter arqEscrita = new FileWriter("717623_mergesort.txt");
			arqEscrita.write("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + tempoExecucao
					+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
					+ comparacao);
			arqEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}