package br.pucminas.aedsii.jogadornba.metodosdeordenacao.insertion;

import java.io.*;
import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		MyIO.setCharset("UTF-8");
		Scanner scan = new Scanner(System.in);
		Jogador[] jogadoresOrdenados = armazenarJogadores(scan);

		// Insertion Sort
		int troca = 0;
		int comparacao = 0;

		for (int i = 1; i < jogadoresOrdenados.length; i++) {
			Jogador aux = jogadoresOrdenados[i];
			int j;

			for (j = (i - 1); (j >= 0) && (jogadoresOrdenados[j].getAnoNascimento() > aux.getAnoNascimento()
					|| (jogadoresOrdenados[j].getAnoNascimento() == aux.getAnoNascimento()
							&& jogadoresOrdenados[j].getNome().compareTo(aux.getNome()) > 0)); j--) {
				jogadoresOrdenados[j + 1] = jogadoresOrdenados[j];
				comparacao++;
			}

			jogadoresOrdenados[j + 1] = aux;
			troca++;
		}

		// Impressao dos jogadores ordenados
		for (Jogador jogador : jogadoresOrdenados)
			jogador.imprimir();

		criarArquivoLog(troca, comparacao);

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
	public static Jogador[] preencherJogadores() throws FileNotFoundException {
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

	// Armazenamento de jogadores encontrados para realizacao do insertionsort
	public static Jogador[] armazenarJogadores(Scanner scan) throws FileNotFoundException {
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

	// Construcao do vetor para realizar no insertion com tamanho exato
	public static Jogador[] construirVetor(Jogador[] jogadoresEncontrados, int tamanho) {
		Jogador[] jogadoresOrdenados = new Jogador[tamanho];

		for (int i = 0; i < jogadoresOrdenados.length; i++)
			jogadoresOrdenados[i] = jogadoresEncontrados[i];

		return jogadoresOrdenados;
	}

	// Criacao de arquivo de log de armazenamento
	public static void criarArquivoLog(int troca, int comparacao) {
		long tempoExecucao = System.currentTimeMillis();

		try {
			FileWriter arqEscrita = new FileWriter("717623_insercao.txt");
			arqEscrita.write("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + tempoExecucao
					+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
					+ comparacao);
			arqEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}