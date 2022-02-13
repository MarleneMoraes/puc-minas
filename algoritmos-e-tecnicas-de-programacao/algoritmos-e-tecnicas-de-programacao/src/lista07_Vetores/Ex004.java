/*
    Faça um programa que receba a temperatura média de cada mês do ano, armazenando-as em um vetor. 
    Calcule e mostre a maior e a menor temperatura do ano e em que mês ocorreram (quando for imprimir, 
    mostrar o mês por extenso: 1- Janeiro, 2- fevereiro, ...) Desconsidere empates.
 */
package lista07_Vetores;

import java.util.Scanner;

public class Ex004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double []temperatura = new double [12];
        double maior = 0, menor = 0;

        for (int i = 0; i < temperatura.length; i++) {
            System.out.print("Digite a temperatura média do mês " + (i + 1) + ": ");
            temperatura[i] = sc.nextDouble();
        }

        for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[0] < 0) {
                menor = temperatura[0];
            } else {
                maior = temperatura[0];
            }

            if (temperatura[i] < menor) {
                menor = temperatura[i];
            }

            if (temperatura[i] > maior) {
                maior = temperatura[i];
            }
        }

        /*for (int i = 0; i < temperatura.length; i++) {
            if (temperatura[i] == menor) {
                System.out.println("Menor temperatura: ");
            }
        }*/

    }
}
