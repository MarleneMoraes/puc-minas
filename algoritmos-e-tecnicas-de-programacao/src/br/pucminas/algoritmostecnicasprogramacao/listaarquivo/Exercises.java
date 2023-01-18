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
		 * determinado usu�rio e grave em um arquivo de texto.
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
		 * Desenvolva um programa que exiba na tela as informa��es gravadas no arquivo
		 * de texto gerado no exerc�cio 1.
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
		 * Desenvolva um programa que acrescente mais um dado, o n�mero de telefone, no
		 * arquivo gerado no exerc�cio 1.
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
		 * Fa�a um programa que receba v�rios n�meros inteiros positivos, finalizando a
		 * entrada de dados com a digita��o de qualquer n�mero negativo. Calcule e
		 * armazene em um arquivo: 
		 * 
		 * a) A quantidade de n�meros digitados; 
		 * b) A soma dos n�meros digitados; 
		 * c) O produto dos n�meros digitados; 
		 * d) A m�dia dos n�meros digitados; 
		 * e) O maior n�mero digitado; 
		 * f) O menor n�mero digitado; 
		 * g) A quantidade de n�meros pares entre todos os n�meros digitados. 
		 * h) A quantidade de n�meros �mpares entre todos os n�meros digitados.
		 * 
		 * Obs.: Procure utilizar tamb�m aqueles m�todos vistos da classe File...
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
			
			bufferedWriter.write("A quantidade de n�meros digitados: " + qtde);
			bufferedWriter.newLine();
			
			bufferedWriter.write("A soma dos n�meros digitados: " + soma);
			bufferedWriter.newLine();
			
			bufferedWriter.write("O produto dos n�meros digitados: " + produto);
			bufferedWriter.newLine();

			bufferedWriter.write("A m�dia dos n�meros digitados: " + media);
			bufferedWriter.newLine();
			
			bufferedWriter.write("O maior n�mero digitado: " + maior);
			bufferedWriter.newLine();
			
			bufferedWriter.write("O menor n�mero digitados: " + menor);
			bufferedWriter.newLine();
			
			bufferedWriter.write("A quantidade de n�meros pares entre todos os n�meros digitados: " + qtdePar);
			bufferedWriter.newLine();

			bufferedWriter.write("A quantidade de n�meros �mpares entre todos os n�meros digitados: " + qtdeImpar);
			bufferedWriter.newLine();
			
			bufferedWriter.close();
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
