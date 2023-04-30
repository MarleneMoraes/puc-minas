package br.pucminas.aedsii.jogadornba.metodosdeordenacao.bubble;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Main {
	public static void main(String[] args) throws FileNotFoundException {
		MyIO.setCharset("UTF-8");
		Jogador[] jogadores = new Jogador[4000];
		Scanner arqLeitura = new Scanner(new File("jogadores.txt"));

		int i = -1;
		// Leitura de arquivo
		while (arqLeitura.hasNextLine()) {
			String linha = arqLeitura.nextLine();
			if (i != -1) {
				jogadores[i] = Jogador.ler(linha);
			}
			i++;
		}
		arqLeitura.close();

		// Busca do jogador
		String entrada = MyIO.readLine();
		Jogador[] jogadoresOrdenados = new Jogador[1000];
		int tamanho = 0;

		for (int j = 0; !isFim(entrada); j++) {
			int id = Integer.parseInt(entrada);

			for (Jogador jogador : jogadores) {
				if (jogador.verificarJogador(id)) {
					jogadoresOrdenados[j] = jogador;
					tamanho++;
				}
			}
			entrada = MyIO.readLine();
		}

		// Bubble Sort
		int troca = 0;
		int comparacao = 0;

		for (int k = (tamanho - 1); k > 0; k--) {
			for (int j = 0; j < i; j++) {
				comparacao++;

				if ((jogadoresOrdenados[j].getCidadeNascimento().compareTo(jogadoresOrdenados[j + 1].getCidadeNascimento()) > 0)
						|| ((jogadoresOrdenados[j].getCidadeNascimento().compareTo(jogadoresOrdenados[j + 1].getCidadeNascimento()) == 0)
								&& (jogadoresOrdenados[j].getNome().compareTo(jogadores[j + 1].getNome()) > 0))) {
					Jogador temp = jogadoresOrdenados[j];
					jogadoresOrdenados[j] = jogadoresOrdenados[j + 1];
					jogadoresOrdenados[j + 1] = temp;
					troca++;
				}
			}
		}
		
		// Impressao dos jogadores ordenados
		for (Jogador jogador : jogadoresOrdenados) {
			jogador.imprimir();
		}

		// Arquivo log de armazenamento
		long tempoExecucao = System.currentTimeMillis();

		try {
			FileWriter arqEscrita = new FileWriter("717623_bolha.txt");
			arqEscrita.write("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + tempoExecucao
					+ "\t Numero de trocas entre elementos: " + troca
					+ "\t Numero de movimentacoes no vetor: " + comparacao);
			arqEscrita.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	public static void buscarJogador(Jogador[] jogador, int id) {
		for (int i = 0; i < jogador.length; i++) {
			if (jogador[i] == null)
				continue;

			if (jogador[i].verificarJogador(id))
				jogador[i].imprimir();
		}
	}

	public static boolean isFim(String s) {
		return (s.length() == 3 && s.equals("FIM"));
	}
}