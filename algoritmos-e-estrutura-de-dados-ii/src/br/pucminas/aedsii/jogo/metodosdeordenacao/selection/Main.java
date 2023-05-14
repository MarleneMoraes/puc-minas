package br.pucminas.aedsii.jogo.metodosdeordenacao.selection;

import java.util.Scanner;

import br.pucminas.aedsii.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.aedsii.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.aedsii.jogo.Jogo;

/**
 * @authors 
 * Marcus Vinicius 
 * Marlene Moraes 
 * Matheus Mello
 *
 */

public class Main {
	public static void main(String[] args) {

		selectionSort();

	}

	// Preenchimento do vetor de Jogos atraves da leitura de arquivos
	private static Jogo[] preencherJogos() {
		String PATH = "partidas.txt"; // No VERDE:
										// "tmp\partidas.txt"

		Jogo[] jogos = new Jogo[1000];

		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura(PATH);

		String linha = ArquivoTextoLeitura.ler();

		for (int i = 0; i < jogos.length; i++) {
			if (linha != null)
				jogos[i] = Jogo.ler(linha);

			linha = ArquivoTextoLeitura.ler();
		}

		arqLeitura.fecharArquivo();

		return jogos;
	}

	// Preenchimento do vetor de Jogos atraves da busca inserida no console
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

	// Ordenacao por selecao
	public static void selectionSort() {
		Scanner scan = new Scanner(System.in);
		Jogo[] jogos = preencherJogos();

		int jogosAdd = 0;
		int comparacao = 0;
		int troca = 0;
		Jogo[] jogosBuscados = preencherVetor(jogos, scan, jogosAdd);

		for (int i = 0; i < (jogosBuscados.length - 1); i++) {
			int menor = i;

			for (int j = (i + 1); j < jogosBuscados.length; j++) {

				if (maiorValor(jogosBuscados[menor], jogosBuscados[j])) {
					menor = j;
					comparacao++;
				}
			}

			troca(jogosBuscados, i, menor);
			troca++;
		}

		criarArquivoLog(comparacao, troca);

		for (Jogo jogo : jogosBuscados) {
			if (jogo != null)
				jogo.imprimir();
		}

		scan.close();
	}

	// Verificacao do maior valor para realizar a troca
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

		if ((selecaoJogo1.compareTo(selecaoJogo2) > 0) || selecaoJogo1.equals(selecaoJogo2) && anoJogo1 > anoJogo2
				|| selecaoJogo1.equals(selecaoJogo2) && anoJogo1 == anoJogo2 && diaJogo1 > diaJogo2
				|| selecaoJogo1.equals(selecaoJogo2) && anoJogo1 == anoJogo2 && diaJogo1 == diaJogo2
						&& mesJogo1 > mesJogo2)
			return true;

		return false;
	}

	// Trocar um elemento pelo outro
	private static void troca(Jogo[] jogos, int j, int k) {
		Jogo temp = jogos[j];
		jogos[j] = jogos[k];
		jogos[k] = temp;
	}	
	
	// Criacao do Arquivo Log
	private static void criarArquivoLog(int comparacao, int troca) {
		long executionTime = System.currentTimeMillis();

		ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("pucminas_selecao.txt");

		escrita.escrever("Matricula: 717623 \t" + "Tempo de execução em milisegundos: " + executionTime
				+ "\t Numero de trocas entre elementos: " + troca + "\t Numero de movimentacoes no vetor: "
				+ comparacao);

		escrita.fecharArquivo();

	}

}