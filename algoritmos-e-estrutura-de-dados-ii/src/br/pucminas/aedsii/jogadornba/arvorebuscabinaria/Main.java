package br.pucminas.aedsii.jogadornba.arvorebuscabinaria;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.MyIO;

public class Main {
	public static void main(String[] args) throws Exception {
		MyIO.setCharset("UTF-8");

		Scanner scan = new Scanner(System.in);
		Jogador[] jogadores = preencherJogadores();
		int comparacao = 0;
		
		procedimentos(jogadores, scan, comparacao);
		
		scan.close();
	}

	// Metodo de verificacao se a string é "FIM"
	public static boolean isFim(String s) {
		return (s.length() == 3 && s.equals("FIM"));
	}

	// Metodo de busca do jogador no array criado para o programa
	public static Jogador buscar(Jogador[] jogadores, int id) {
		for (Jogador jogador : jogadores) {
			if (jogador == null) {
				continue;
			}
			if (jogador.getId() == id)
				return jogador;
		}
		return null;
	}

	// Preenchimento de um vetor base com todos os jogadores lidos do arquivo .txt
	public static Jogador[] preencherJogadores() throws FileNotFoundException {
		Jogador[] jogadores = new Jogador[4000];
		Scanner arqLeitura = new Scanner(new File("jogadores.txt"));

		int i = -1;

		while (arqLeitura.hasNextLine()) {
			String linha = arqLeitura.nextLine();
			if (i != -1) {
				jogadores[i] = Jogador.ler(linha);
			}
			i++;
		}
		arqLeitura.close();

		return jogadores;
	}

	// Preenchimento da arvore com os IDs encontrados na busca
	public static void procedimentos(Jogador[] jogadores, Scanner scan, int comparacao) throws Exception {
		Arvore arvore = new Arvore();
		Jogador jogador = new Jogador();

		String busca = scan.nextLine();

		while (!isFim(busca)) {
			int id = Integer.parseInt(busca);
			jogador = buscar(jogadores, id);

			if (jogador != null) {
				arvore.inserir(jogador);
				comparacao++;
			}

			busca = scan.nextLine();
		}
		
		caminhamentoArvore(jogadores, arvore, scan, comparacao);
	}

	// Busca na arvore pelos jogadores solicitados no terminal
	public static void caminhamentoArvore(Jogador[] jogadores, Arvore arvore, Scanner scan, int comparacao) throws Exception {
		String busca = scan.nextLine();

		while (!isFim(busca)) {
			if (arvore.pesquisar(busca) != null) {
				arvore.caminhamentoEmOrdem(busca);
				System.out.println("SIM");
			} else {
				arvore.caminhamentoEmOrdem(busca);
				System.out.println("NAO");
			}

			busca = scan.nextLine();
		}
		
		criarArquivoLog(comparacao);
	}

	// Criacao de arquivo de log de armazenamento
	private static void criarArquivoLog(int comparacao) {
		long tempoExecucao = System.currentTimeMillis();

		try {
			FileWriter arqEscrita = new FileWriter("717623_arvoreBinaria.txt");
			arqEscrita.write("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + tempoExecucao
					+ "\t Numero de comparações na arvore: " + comparacao);
			arqEscrita.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}