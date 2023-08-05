/*	
	Enunciado:
		Impressao aleatoria de dados de series
		Crie   uma   classe  Serie  com   os   atributos   privados:  nome  (String), 
		formato (String), duracao (String), pais de origem (String), idioma de
		origem (String), emissora de televisao original (String), data de inicio
		da transmissao original (String), numero de temporadas (int), numero
		de episodios (int).
		Sua classe tambem tera, pelo menos, dois construtores, e os metodos
		gets, sets, clone, ler e imprimir. O m�todo imprimir exibe os valores
		dos atributos do objeto (observe o formato de cada linha da sa�da
		esperada) e o ler l� os atributos de um objeto.
		Seu programa deve ler e processar a entrada padrao que apresenta,
		em sua primeira linha, a quantidade de series que devem ser tratadas
		em seguida. Voce deve entao preencher um vetor de objetos da classe
		Serie com os dados das diversas series informadas na entrada padrao.
		Depois, serao informadas, tambem na entrada padrao, varias linhas,
		cada uma contendo uma string indicando o nome da serie cujos dados
		devem ser exibidos na saida padrao. A ultima linha da entrada contem
		a palavra FIM.
		Na saida padrao, para cada nome lido da entrada, escreva uma linha
		com os dados do registro correspondente.
		A saida padrao deve obedecer o seguinte formato:
		
		nome  ##  formato  ##  duracao  ##  pais de origem  ##  idioma de
		origem  ##  emissora   de   televisao   original  ##  data   de   inicio   da
		transmissao   original  ##  numero   de   temporadas  ##  numero   de
		episodios
*/


/**
* Java's Exercices from college
* 
* @author ArthurAguiar, MarleneMoraes, MiguelCruz
* @date 24 mar 2022
*/

package br.pucminas.aedsii.serie.poo.labs.atividade001;

import br.pucminas.aedsii.estruturadedados.MyIO;
import br.pucminas.aedsii.serie.Serie;

public class Atividade01SeriesNetflix {
	public static void main(String[] args) {
		MyIO.setCharset("UTF-8");
		
		
		String input = MyIO.readLine();
		
		int numSeries = Integer.parseInt(input);
		
		Serie[] series = new Serie[numSeries];
		int i = 0;
		
		while(series[i].equals("FIM")) {
			series[i] = Serie.ler();
			series[i].imprimir();
			i++;
		}
			
		
    
	}
}
