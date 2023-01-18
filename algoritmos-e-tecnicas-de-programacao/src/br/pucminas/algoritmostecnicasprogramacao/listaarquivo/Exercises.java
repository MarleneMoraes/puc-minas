package br.pucminas.algoritmostecnicasprogramacao.listaarquivo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercises {
	static Scanner sc = new Scanner(System.in);

	protected static void ex001() throws IOException {
		/*
		 * Desenvolva um programa que solicite a entrada de nome, cidade e estado de um
		 * determinado usuário e grave em um arquivo de texto.
		 */

		final String PATH = "C:\\_workspace\\puc-minas\\algoritmos-e-tecnicas-de-programacao\\src\\br\\pucminas\\algoritmostecnicasprogramacao\\listaarquivo"; // mudar para pasta local
		File arquivo = new File(PATH + "\\archive.txt");

		String[] perguntas = { "Nome: ", "Cidade: ", "Estado: " };
		String[] respostas = new String[3];

		for (int i = 0; i < perguntas.length; i++) {
			System.out.print(perguntas[i]);
			respostas[i] = sc.nextLine();
		}

		if (!arquivo.exists()) {
			arquivo.createNewFile();

		} else {
			arquivo.delete();
			arquivo.createNewFile();
		}

		try {
			FileWriter fileWriter = new FileWriter(arquivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			for (String resposta : respostas) {
				bufferedWriter.write(resposta);
				bufferedWriter.newLine();
			}
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected static void ex002() throws IOException {
		/*
		 * Desenvolva um programa que exiba na tela as informações gravadas no arquivo
		 * de texto gerado no exercício 1.
		 */
		
		File arquivo = new File(
				"C:\\_workspace\\puc-minas\\algoritmos-e-tecnicas-de-programacao\\src\\br\\pucminas\\algoritmostecnicasprogramacao\\listaarquivo\\archive.txt"); // mudar para pasta local
		
		if (arquivo.exists()) {
			FileReader fileReader = new FileReader(arquivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
	
			while (bufferedReader.ready()) {
				String linha = bufferedReader.readLine();
				System.out.println(linha);
			}
	
			fileReader.close();
			bufferedReader.close();
		} else {
			ex001();
			ex002();
		}
	}

	protected static void ex003() throws IOException {
		/*
		 * Desenvolva um programa que acrescente mais um dado, o número de telefone, no
		 * arquivo gerado no exercício 1.
		 */
		File arquivo = new File(
				"C:\\_workspace\\puc-minas\\algoritmos-e-tecnicas-de-programacao\\src\\br\\pucminas\\algoritmostecnicasprogramacao\\listaarquivo\\archive.txt"); // mudar para pasta local
		
		if (arquivo.exists()) {
			FileWriter fileWriter = new FileWriter(arquivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			
			System.out.print("Telefone: ");
			String telephone = sc.nextLine();
			
			bufferedWriter.append(telephone);
			bufferedWriter.newLine();
			
			bufferedWriter.close();
			fileWriter.close();
		} else {
			ex001();
			ex003();
		}

	}

	protected static void ex004() throws IOException {
		/*
		 * Faça um programa que receba vários números inteiros positivos, finalizando a
		 * entrada de dados com a digitação de qualquer número negativo. Calcule e
		 * armazene em um arquivo: 
		 * 
		 * a) A quantidade de números digitados; 
		 * b) A soma dos números digitados; 
		 * c) O produto dos números digitados; 
		 * d) A média dos números digitados; 
		 * e) O maior número digitado; 
		 * f) O menor número digitado; 
		 * g) A quantidade de números pares entre todos os números digitados. 
		 * h) A quantidade de números ímpares entre todos os números digitados.
		 * 
		 * Obs.: Procure utilizar também aqueles métodos vistos da classe File...
		 */
		
		final String PATH = "C:\\_workspace\\puc-minas\\algoritmos-e-tecnicas-de-programacao\\src\\br\\pucminas\\algoritmostecnicasprogramacao\\listaarquivo"; // mudar para pasta local
		File arquivo = new File(PATH + "\\archive.txt");

		if (!arquivo.exists()) {
			arquivo.createNewFile();

		} else {
			arquivo.delete();
			arquivo.createNewFile();
		}
		
		
		try {
			FileWriter fileWriter = new FileWriter(arquivo);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			int numero = sc.nextInt();
			int soma = 0;
			int produto = 1;
			int maior = 0;
			int menor = 0;
			int qtde = 0;
			int qtdePar = 0;
			int qtdeImpar = 0;
			double media;

			while (!(numero < 0)) {
				qtde++;
				soma += numero;
				produto *= numero;

				if (numero % 2 == 0)
					qtdePar++;
				else
					qtdeImpar++;
				
				maior = Math.max(maior, numero);
				menor = Math.min(menor, numero);
			}

			media = soma / qtde;
			
			bufferedWriter.write("A quantidade de números digitados: " + qtde);
			bufferedWriter.newLine();
			
			bufferedWriter.write("A soma dos números digitados: " + soma);
			bufferedWriter.newLine();
			
			bufferedWriter.write("O produto dos números digitados: " + produto);
			bufferedWriter.newLine();

			bufferedWriter.write("A média dos números digitados: " + media);
			bufferedWriter.newLine();
			
			bufferedWriter.write("O maior número digitado: " + maior);
			bufferedWriter.newLine();
			
			bufferedWriter.write("O menor número digitados: " + menor);
			bufferedWriter.newLine();
			
			bufferedWriter.write("A quantidade de números pares entre todos os números digitados: " + qtdePar);
			bufferedWriter.newLine();

			bufferedWriter.write("A quantidade de números ímpares entre todos os números digitados: " + qtdeImpar);
			bufferedWriter.newLine();
			
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
