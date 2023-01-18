/*
 * Enunciado:
 * Faça  um  programa  que  leia,  da  entrada  padrão,  um  texto,  que  pode 
 * conter  várias  linhas.  Armazene  o  texto  lido  em  um  arquivo  texto.  Não  se 
 * esqueça  de  fechar  o  arquivo.  Em  seguida,  leia  o  texto  armazenado  no 
 * arquivo e imprima-o na tela. Solicite ao usuário o nome do arquivo texto 
 * em  que  os  dados  informados  serão  armazenados.  Utilize  as  classes 
 * ArquivoTextoEscrita.java e ArquivoTextoLeitura.java 
 * fornecidas pela professora. 
 */

/**
 * Java's Exercices from college
 * 
 * @author MarleneMoraes
 * @date 25 Feb 2022
 */

package br.pucminas.aedsii20221.estruturadedados.arquivostexto;

import java.util.Scanner;

public class Ex001 { 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String PATH = "/puc-minas/algoritmos-e-estrutura-de-dados-ii/src/br/pucminas/aedsii20221/estruturadedados/arquivostexto/TesteLeitura.txt";
		
		ArquivoTextoLeitura arqLeitura = new ArquivoTextoLeitura("/home/marlenemoraes/" + PATH); //user depends for machine
		
		String linha = arqLeitura.ler(); 
		
		while(linha != null){
			System.out.println(linha);
			linha = arqLeitura.ler();
		}
		arqLeitura.fecharArquivo();

		//armazena caminho do arquivo
		System.out.println("Caminho:");
		String path = scan.nextLine();

		//leitura do console e escrita no arquivo
		ArquivoTextoEscrita arqEscrita = new ArquivoTextoEscrita(path);
		linha = scan.nextLine();

		while(!linha.equals("FIM")){
			arqEscrita.escrever(linha);
			linha = scan.nextLine();
		}
		
		arqEscrita.fecharArquivo();

		scan.close();
	}
}
