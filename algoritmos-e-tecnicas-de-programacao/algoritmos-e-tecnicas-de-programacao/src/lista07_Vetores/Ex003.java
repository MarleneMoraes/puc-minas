/*
    Faça um programa que preencha um vetor com dez números inteiros, calcule 
    e mostre o vetor resultante colocando os elementos em ordem decrescente.
 */
package lista07_Vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Ex003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int[] resultante = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = sc.nextInt();
        }

        Arrays.sort(vetor);

        int c = 0, d = resultante.length;
        while (c < vetor.length) {
            vetor[c] = resultante[d];
            
            c++;
            d--;
        }

        System.out.println("Ordem decrescente: ");

        for (int i = 0; i < resultante.length; i++) {
            System.out.print(resultante[i] + " ");
        }

        sc.close();
    }
}
