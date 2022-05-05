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

package br.pucminas.estruturadedados.arquivostexto.labs;

import java.util.Scanner;

import br.pucminas.estruturadedados.ArquivoTextoEscrita;
import br.pucminas.estruturadedados.ArquivoTextoLeitura;
import br.pucminas.estruturadedados.MyIO;

public class Ex001 {
	// adicionar um try ... catch para tratar a excessao
	// ArquivoTextoLeitura input = new
	// ArquivoTextoLeitura("/home/sinaide/temp/TesteLeitura.txt"); //caminho
	// completo par a acesso em outro diretório
	ArquivoTextoLeitura input = new ArquivoTextoLeitura("TesteLeitura.txt"); // arquivo no diretorio src

	String lines = input.ler();
	String aux = "";
	
	while(lines != null) {
		MyIO.println(lines);
		aux += lines + "\n";
		lines = input.ler();
	}
	
	aux=aux.substring(0,aux.length()-1);// eliminar o último \n
	String nameArq = "TesteEscrita.txt";
	MyIO.println("Informe um nome para o arquivo de saída: ");
	String nameArq = MyIO.readLine();
	ArquivoTextoEscrita output = new ArquivoTextoEscrita(nameArq);
	output.escrever(aux);
	output.fecharArquivo();
	MyIO.println("Programa finalizado!");
}
