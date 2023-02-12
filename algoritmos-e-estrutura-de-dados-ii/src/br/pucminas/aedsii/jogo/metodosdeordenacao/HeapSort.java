package br.pucminas.aedsii.jogo.metodosdeordenacao;

import java.util.Scanner;

import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii20222.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii20222.estruturadedados.Jogo;

public class HeapSort {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();

		int jogosAdd = 0;
		int comparacao = 0;
		int troca = 0;
		
		Jogo[] jogosBuscados = preencherVetor(jogos, scan, jogosAdd);

		jogosBuscados = heapSort(jogosBuscados, jogosAdd, comparacao, troca);

		for (Jogo jogo : jogosBuscados) {
			if(jogo != null) 
				jogo.printValues();
		}

		scan.close();
	}
	
	//Preenchimento do vetor de Jogos através da leitura de arquivos
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

	//Preenchimento do vetor de Jogos através da busca inserida no console
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
	
	public static Jogo[] heapSort(Jogo[] jogos, int n, int comparacao, int troca) {
		//gols sel 1
		//nome sel 1, ano, mes, dia
		
		Jogo[] tmp = new Jogo[n + 1];
		
		for (int i = 0; i < n; i++) 
			tmp[i + 1] = jogos[i];		
	
		jogos = tmp;

		
		// Contrução do heap
		for (int tamHeap = 2; tamHeap <= n; tamHeap++) {
			constroi(jogos, tamHeap);
		}

		// Ordenação propriamente dita
		int tamHeap = n;
		while (tamHeap > 1) {
			comparacao++;
			troca(jogos, 1, tamHeap--);
			troca++;
			
			reconstroi(jogos, tamHeap);
		}

		// Alterar o vetor para voltar à posição zero
		tmp = jogos;
		jogos = new Jogo[n];
		for (int i = 0; i < n; i++) {
			jogos[i] = tmp[i + 1];
		}
		
		criarArquivoLog(comparacao, troca);

		return jogos;
	}

	private static void constroi(Jogo[] jogos, int tamHeap) {
		
		int golsJogo1 = 0;
		int golsJogo2 = 0;
		int diaJogo1 = 0;
		int diaJogo2 = 0;
		int mesJogo1 = 0;
		int mesJogo2 = 0;
		int anoJogo1 = 0;
		int anoJogo2 = 0;
		String selecaoJogo1 = null;
		String selecaoJogo2 = null;
		
		for(int i = tamHeap; i > 1; i /= 2) {
			golsJogo1 = jogos[i].getPlacarSelecao1();
			golsJogo2 = jogos[i / 2].getPlacarSelecao1();
			
			selecaoJogo1 = jogos[i].getSelecao1();
			selecaoJogo2 = jogos[i / 2].getSelecao1();
			
			anoJogo1 = jogos[i].getAno();
			anoJogo2 = jogos[i / 2].getAno();			
			
			mesJogo1 = jogos[i].getMes();
			mesJogo2 = jogos[i / 2].getMes();
			
			diaJogo1 = jogos[i].getDia();
			diaJogo2 = jogos[i / 2].getDia();			
		}
		
		
		
		for (int i = tamHeap; i > 1 && golsJogo1 > golsJogo2; i /= 2) {
			if (golsJogo1 > golsJogo2)
				troca(jogos, i, i / 2);
			
			if (golsJogo1 == golsJogo2) {
				//comparacao de selecao
				if (selecaoJogo1.compareTo(selecaoJogo2) == 1) 
					troca(jogos, i, i / 2);
				
				if (selecaoJogo1.equals(selecaoJogo2)) {
					if (anoJogo1 > anoJogo2) 
						troca(jogos, i, i / 2);
					
					if (anoJogo1 == anoJogo2) {
						if (mesJogo1 > mesJogo2)
							troca(jogos, i, i / 2);
						
						if (mesJogo1 == mesJogo2) {
							if (diaJogo1 > diaJogo2)
								troca(jogos, i, i / 2);
						}
					}
					
				}
				
			}
		}
		
	}

	private static void reconstroi(Jogo[] jogo, int tamHeap) {
		int i = 1;

		while (i <= (tamHeap / 2)) {
			int filho = getMaiorFilho(jogo, i, tamHeap);
			if (jogo[i] < jogo[filho]) {
				troca(jogo, i, filho);
				i = filho;
			} else {
				i = tamHeap;
			}
		}
	}

	private static int getMaiorFilho(Jogo[] jogos, int i, int tamHeap) {

		int filho;

		if (2 * i == tamHeap || jogos[2 * i] > jogos[2 * i + 1]) {
			filho = 2 * i;
		} else {
			filho = 2 * i + 1;
		}
		
		return filho;
	}

	private static void troca(Jogo[] jogos, int i, int j) {
		Jogo temp = jogos[i];
		jogos[i] = jogos[j];
		jogos[j] = temp;
	}
	
	private static void criarArquivoLog(int comparacao, int troca) {
		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_heap.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();
		
	}
}