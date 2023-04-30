package br.pucminas.aedsii.jogadornba.leituradearquivo;

import java.io.File;
import java.io.FileNotFoundException;
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
	    int id;
	    
	    while(!isFim(entrada)){  
	      id = Integer.parseInt(entrada);
	      buscarJogador(jogadores, id);
	      entrada = MyIO.readLine();
	    }
	  }

	  public static void buscarJogador(Jogador[] jogador, int id) {
	    for (int i = 0; i < jogador.length; i++) {
	      if(jogador[i] == null) continue;
	      
	      if (jogador[i].verificarJogador(id)) 
	        jogador[i].imprimir();
	    }
	  }

	  public static boolean isFim(String s) {
	    return (s.length() == 3 && s.equals("FIM"));
	  }
}