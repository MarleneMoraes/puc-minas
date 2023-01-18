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
 * @date 29 set 2022
 */

package br.pucminas.aedsii20222.estruturadedados.arquivostexto;

import java.util.Scanner;

public class Ex002 {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final String PATH = "/home/marlenemoraes/puc-minas/algoritmos-e-estrutura-de-dados-ii/src/br/pucminas/aedsii20221/estruturadedados/arquivostexto/";
		
		ArquivoTextoLeitura leitura = new ArquivoTextoLeitura("/home/marlenemoraes/" + PATH + "TesteLeitura.txt");
        ArquivoTextoEscrita escrita = new ArquivoTextoEscrita("/home/marlenemoraes/" + PATH + "TesteEscrita.txt");

        String linha = leitura.ler(); 
		
		while(linha != null || !linha.equals("FIM")){			
            chrypto(linha);
            escrita.escrever(linha);

            linha = leitura.ler();
		}

        escrita.fecharArquivo();

        //Descriptografar
        linha = leitura.ler(); 
		
		while(linha != null){
            unchrypto(linha);
			System.out.println(linha);
            
			linha = leitura.ler();
		}

		leitura.fecharArquivo();
		
		scan.close();
    }

    public static String chrypto(String s){
        char c;
    	
    	for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
    		if(c == 'z') 
                c = 'a';
            else 
                c = s.charAt(i++);
        }
    
        return s;
    }

    public static String unchrypto(String s){
    	char c;
    	
    	for(int i = 0; i < s.length(); i++){
    		c = s.charAt(i);
    		
    		if(c == 'a') 
                c = 'z';
            else 
                c = s.charAt(i--);
        }
    
        return s;
    }
}
