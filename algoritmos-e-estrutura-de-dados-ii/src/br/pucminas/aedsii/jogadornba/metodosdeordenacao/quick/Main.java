package br.pucminas.aedsii.jogadornba.metodosdeordenacao.quick;

import java.io.*;
import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {

		quicksort();

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

	// Armazenamento de jogadores encontrados para realizacao do quicksort
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

	// Construcao do vetor para realizar no quicksort com tamanho exato
	private static Jogador[] construirVetor(Jogador[] jogadoresEncontrados, int tamanho) {
		Jogador[] jogadoresOrdenados = new Jogador[tamanho];

		for (int i = 0; i < jogadoresOrdenados.length; i++)
			jogadoresOrdenados[i] = jogadoresEncontrados[i];

		return jogadoresOrdenados;
	}

	// Ordenacao rapida (metodo principal)
	public static void quicksort() throws FileNotFoundException {
		MyIO.setCharset("UTF-8");
		Scanner scan = new Scanner(System.in);
		Jogador[] jogadoresOrdenados = armazenarJogadores(scan);

		int troca = 0;
		int comparacao = 0;

		quicksort(jogadoresOrdenados, 0, jogadoresOrdenados.length - 1, comparacao, troca);

		for (Jogador jogador : jogadoresOrdenados)
			jogador.imprimir();

		criarArquivoLog(troca, comparacao);
	}

	// Ordenacao rapida
	private static void quicksort(Jogador[] jogadores, int esq, int dir, int comparacao, int troca) {
		if (esq < dir) {
			
			Jogador pivot = jogadores[dir];
			int part = esq - 1;
			
			for (int i = esq; i < dir; i++) {
				if ((jogadores[i].getEstadoNascimento().compareTo(pivot.getEstadoNascimento()) < 0)
						|| (jogadores[i].getEstadoNascimento().equals(pivot.getEstadoNascimento())
								&& (jogadores[i].getNome().compareTo(pivot.getNome()) < 0))) {
					comparacao++;
					part++;
					troca(jogadores, part, i);
					troca++;
				}
			}
			part++;
			troca(jogadores, part, dir);
			troca++;
		
			quicksort(jogadores, esq, part - 1, comparacao, troca);
			quicksort(jogadores, part + 1, dir, comparacao, troca);
		}
	}

	// Metodo para trocar os jogadores
	private static void troca(Jogador[] jogadores, int i, int j) {
		Jogador temp = jogadores[i];
		jogadores[i] = jogadores[j];
		jogadores[j] = temp;
	}

	// Criacao de arquivo de log de armazenamento
	private static void criarArquivoLog(int troca, int comparacao) {
		long tempoExecucao = System.currentTimeMillis();

		try {
			FileWriter arqEscrita = new FileWriter("717623_quicksort.txt");
			arqEscrita.write("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + tempoExecucao
					+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
					+ comparacao);
			arqEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}