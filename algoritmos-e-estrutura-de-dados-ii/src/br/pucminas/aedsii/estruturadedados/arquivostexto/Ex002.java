/*
 * Enunciado:
 * Faça  um  programa  que  criptografe  o  texto  informado,  ou  seja,  um 
 * programa capaz de ler, de um arquivo informado pelo usuário, um texto, 
 * que pode conter várias linhas; criptografar esse texto por meio de alguma 
 * técnica  de  alteração  do  código  ASCII;  e  escrever  em  um  outro  arquivo  o 
 * texto codificado. Solicite ao usuário o nome do arquivo texto que contém 
 * os  dados  originais  e  o  do  arquivo  em  que  os  dados  codificados  serão 
 * armazenados.  Em  seguida,  crie  um  outro  programa  que  descriptografe  o 
 * arquivo  criado  pelo  programa  de  criptografia,  realizando  a  operação 
 * inversa,  ou  seja,  um  programa  capaz  de  ler  o  arquivo  com  o  texto 
 * codificado; decodificá-lo e escrever o texto descriptografado em um novo 
 * arquivo. Lembre-se que para que seja possível criptografar/descriptografar 
 * um texto a função de codificação deve possuir uma função inversa.
 */

/**
 * Java's Exercices from college
 * 
 * @author MarleneMoraes
 * @date 25 Feb 2022
 */

package br.pucminas.aedsii.estruturadedados.arquivostexto;

import java.util.Scanner;

public class Ex002 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String PATH = "/home/marlenemoraes/puc-minas/algoritmos-e-estrutura-de-dados-ii/src/br/pucminas/aedsii20221/estruturadedados/arquivostexto/";
		
		ArquivoTextoLeitura leitura = new ArquivoTextoLeitura("/home/marlenemoraes/" + PATH + "TesteLeitura.txt");
        ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("/home/marlenemoraes/" + PATH + "TesteEscrita.txt");

        String linha = leitura.ler(); 
		
		while(linha != null || !linha.equals("FIM")){			
            changeLetters(linha);
            escrita.escrever(linha);

            linha = leitura.ler();
		}

		leitura.fecharArquivo();
		
		escrita.fecharArquivo();

		scan.close();

    }

    public static String changeLetters(String s){
        char caractere;
        
    	for(int i = 0; i < s.length(); i++){
    		caractere = s.charAt(i);
    		
            if(caractere == 'z') 
            	caractere = 'a';
            else 
                s.charAt(i++);
        }
    
        return s;
    }
}
