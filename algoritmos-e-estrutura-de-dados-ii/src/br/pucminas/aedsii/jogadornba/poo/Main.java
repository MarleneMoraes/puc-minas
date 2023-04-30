package br.pucminas.aedsii.jogadornba.poo;

import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.jogadornba.Jogador;

public class Main {

    public static void main(String[] args) {
        MyIO.setCharset("UTF-8");
        String[] entrada = new String[4000];
        int numEntrada = 0;

        //Leitura da entrada padrao
        do {
            entrada[numEntrada] = MyIO.readLine();
        } while (isFim(entrada[numEntrada++]) == false);
        numEntrada--; //Desconsiderar a ultima linha contendo a palavra FIM

        Jogador[] jogador = new Jogador[numEntrada];
        for (int i = 0; i < numEntrada; i++) {
            jogador[i] = Jogador.ler(entrada[i]);
        }

        int numeroBuscas = Integer.parseInt(MyIO.readLine());

        for (int i = 0; i < numeroBuscas; i++) {
            int busca = Integer.parseInt(MyIO.readLine());
            buscarJogador(jogador, busca);
        }

    }

    public static void buscarJogador(Jogador[] jogador, int id) {
        for (int i = 0; i < jogador.length; i++) {
        	if (jogador[i].verificarJogador(id)) 
        		jogador[i].imprimir();        	
        }
    }
    
    public static boolean isFim(String s) {
        return (s.length() == 3 && s.equals("FIM"));
    }

}