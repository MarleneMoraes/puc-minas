package br.pucminas.aedsii.jogadornba.metodosdeordenacao.heap;

import java.io.*;
import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		heapsort();

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
		Scanner arqLeitura = new Scanner(new File("jogadores.txt"));

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

	// Ordenacao por arvore (metodo principal)
	public static void heapsort() throws FileNotFoundException {
		MyIO.setCharset("UTF-8");
		Scanner scan = new Scanner(System.in);
		Jogador[] jogadoresOrdenados = armazenarJogadores(scan);

		int troca = 0;
		int comparacao = 0;

		heapsort(jogadoresOrdenados, jogadoresOrdenados.length, comparacao, troca);

		for (Jogador jogador : jogadoresOrdenados)
			jogador.imprimir();

		criarArquivoLog(troca, comparacao);
	}

	// Ordenacao por arvore
	private static void heapsort(Jogador[] jogadores, int n, int comparacao, int troca) {
		Jogador[] tmp = new Jogador[n + 1];
		for (int i = 0; i < n; i++)
			tmp[i + 1] = jogadores[i];

		jogadores = tmp;

		// Contrucao do heap
		for (int tamHeap = 2; tamHeap <= n; tamHeap++)
			constroi(jogadores, tamHeap, comparacao, troca);

		// Ordenacao propriamente dita
		int tamHeap = n;
		while (tamHeap > 1) {
			troca(jogadores, 1, tamHeap--);
			reconstroi(jogadores, tamHeap);
		}

		// Alterar o vetor para voltar a posição zero
		tmp = jogadores;
		jogadores = new Jogador[n];
		for (int i = 0; i < n; i++) {
			jogadores[i] = tmp[i + 1];
		}
	}

	private static void constroi(Jogador[] jogador, int tamHeap, int comparacao, int troca) {

		for (int i = tamHeap; i > 1 && (jogador[i].getAltura() > jogador[i / 2].getAltura()
				|| jogador[i].getAltura() == jogador[i / 2].getAltura()
						&& jogador[i].getNome().compareTo(jogador[i / 2].getNome()) > 0); i /= 2) {
			comparacao++;
			troca(jogador, i, i / 2);
			troca++;
		}

	}

	private static void reconstroi(Jogador[] jogadores, int tamHeap) {

		int i = 1;

		while (i <= (tamHeap / 2)) {
			int filho = getMaiorFilho(jogadores, i, tamHeap);

			if ((jogadores[i].getAltura() < jogadores[filho].getAltura()
					|| jogadores[i].getAltura() == jogadores[filho].getAltura()
							&& jogadores[i].getNome().compareTo(jogadores[filho].getNome()) < 0)) {
				troca(jogadores, i, filho);
				i = filho;
			} else
				i = tamHeap;
		}
	}

	private static int getMaiorFilho(Jogador[] jogadores, int i, int tamHeap) {

		if (2*i == tamHeap || ((jogadores[2*i].getAltura() > jogadores[2*i+1].getAltura()) 
				|| (jogadores[2*i].getAltura() == jogadores[2*i+1].getAltura() && 
						jogadores[2*i].getNome().compareTo(jogadores[2*i+1].getNome()) > 0))) 
	        	return 2*i;
	      
	    return 2*i + 1;
	}

	private static void troca(Jogador[] jogadores, int i, int j) {
		Jogador temp = jogadores[i];
		jogadores[i] = jogadores[j];
		jogadores[j] = temp;
	}

	// Criacao de arquivo de log de armazenamento
	private static void criarArquivoLog(int troca, int comparacao) {
		long tempoExecucao = System.currentTimeMillis();

		try {
			FileWriter arqEscrita = new FileWriter("717623_heapsort.txt");
			arqEscrita.write("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + tempoExecucao
					+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
					+ comparacao);
			arqEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}