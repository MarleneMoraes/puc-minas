package br.pucminas.algoritmosestruturadedadosii.labs.listaiv;

/*	
Enunciado:
	Impressão aleatória de dados de séries
	Crie   uma   classe  Serie  com   os   atributos   privados:  nome  (String), 
	formato (String), duração (String), país de origem (String), idioma de
	origem (String), emissora de televisão original (String), data de início
	da transmissão original (String), número de temporadas (int), número
	de episódios (int).
	Sua classe também terá, pelo menos, dois construtores, e os métodos
	gets, sets, clone, ler e imprimir. O método imprimir exibe os valores
	dos atributos do objeto (observe o formato de cada linha da saída
	esperada) e o ler lê os atributos de um objeto.
	Seu programa deve ler e processar a entrada padrão que apresenta,
	em sua primeira linha, a quantidade de séries que devem ser tratadas
	em seguida. Você deve então preencher um vetor de objetos da classe
	Serie com os dados das diversas séries informadas na entrada padrão.
	Depois, serão informadas, também na entrada padrão, várias linhas,
	cada uma contendo uma string indicando o nome da série cujos dados
	devem ser exibidos na saída padrão. A última linha da entrada contém
	a palavra FIM.
	Na saída padrão, para cada nome lido da entrada, escreva uma linha
	com os dados do registro correspondente.
	A saída padrão deve obedecer o seguinte formato:
	
	nome  ##  formato  ##  duração  ##  país de origem  ##  idioma de
	origem  ##  emissora   de   televisão   original  ##  data   de   início   da
	transmissão   original  ##  número   de   temporadas  ##  número   de
	episódios
*/


/**
* Java's Exercices from college
* 
* @author MarleneMoraes
* @date 24 mar 2022
*/

public class Atividade1_SeriesNetflix {
	public static void main(String[] args) {
		Serie serie = new Serie();
		serie.ler();
		
		while (!serie.equals("FIM")) {
			serie.imprimir();
			serie.ler();
		}
		
	}
	
}
