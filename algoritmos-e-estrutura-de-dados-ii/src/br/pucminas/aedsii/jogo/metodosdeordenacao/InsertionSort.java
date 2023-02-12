package br.pucminas.aedsii.jogo.metodosdeordenacao;

import java.util.Scanner;

import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class InsertionSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();

		int jogosAdd = 0;
		int comparacao = 0;
		int troca = 0;
		
		Jogo[] jogosBuscados = preencherVetor(jogos, scan, jogosAdd);

		jogosBuscados = insertionSort(jogosBuscados, jogosAdd, comparacao, troca);

		for (Jogo jogo : jogosBuscados) {
			if(jogo != null) 
				jogo.printValues();
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

		// Metodo Insertion sort
		public static Jogo[] insertionSort(Jogo[] jogos, int numEntradas, int comparacao, int troca) {
			for (int i = 1; i < numEntradas; i++) {
				Jogo tmp = jogos[i];
				int j = i - 1;

				while ((j >= 0) && (jogos[j] > tmp)) {
					jogos[j + 1] = jogos[j];
					j--;
					
					comparacao++;
				}
				
				jogos[j + 1] = tmp;
				troca++;
			}
			
			criarArquivoLog(comparacao, troca);
		}
		
		
	void sort(int[] array, int n) {
		for (int i = 1; i < n; i++) {
			int tmp = array[i];
			int j = i - 1;

			while ((j >= 0) && (array[j] > tmp)) {
				array[j + 1] = array[j];
				j--;
			}
			array[j + 1] = tmp;
		}
	}
	
	private static boolean maiorValor(Jogo jogo1, Jogo jogo2) {
		int anoJogo1, anoJogo2, diaJogo1, diaJogo2, mesJogo1, mesJogo2;
		String selecaoJogo1, selecaoJogo2;

		diaJogo1 = jogo1.getDia();
		diaJogo2 = jogo2.getDia();

		mesJogo1 = jogo1.getMes();
		mesJogo2 = jogo2.getMes();

		anoJogo1 = jogo1.getAno();
		anoJogo2 = jogo2.getAno();

		selecaoJogo1 = jogo1.getSelecao1();
		selecaoJogo2 = jogo2.getSelecao2();

		if (diaJogo1 > diaJogo2)
			return true;

		if (diaJogo1 == diaJogo2) {
			if (mesJogo1 > mesJogo2)
				return true;

			if (mesJogo1 == mesJogo2) {
				if (anoJogo1 > anoJogo2)
					return true;

				if (anoJogo1 == anoJogo2) {
					if (selecaoJogo1.compareTo(selecaoJogo2) == 1)
						return true;

					if (selecaoJogo1.equals(selecaoJogo2))
						return false;
				}
			}
		}
		return false;
	}
	
	private static void troca(Jogo[] jogos, int j, int k) {
		Jogo temp = jogos[j];
		jogos[j] = jogos[k];
		jogos[k] = temp;
	}
	
	private static void criarArquivoLog(int comparacao, int troca) {
		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_bolha.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();
		
	}
}
