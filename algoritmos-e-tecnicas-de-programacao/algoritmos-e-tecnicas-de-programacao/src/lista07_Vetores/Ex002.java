/*
    Faça um programa que preencha dois vetores, X e Y, com dez números inteiros cada. Calcule e mostre os seguintes vetores resultantes:
        a) A soma de X e Y;
        b) O produto de X e Y;
 */
package lista07_Vetores;

import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int []x = new int [10];
        int []y = new int [10];
        int []soma = new int [10];
        int []produto = new int [10];
        
        for (int i = 0; i < x.length; i++){
            System.out.print("Digite um valor para X: ");
            x[i] = sc.nextInt();
        }
        
        for (int i = 0; i < y.length; i++){
            System.out.print("Digite um valor para Y: ");
            y[i] = sc.nextInt();
        }
        
        for (int i = 0; i < 10; i++){
            soma[i] = x[i] + y[i];
            produto[i] = x[i] * y[i];
        }
        
        System.out.println("Vetor-soma: ");
        
        for (int i = 0; i < soma.length; i++){
            System.out.print(soma[i] + " ");
        }
        
        System.out.println("\nVetor-produto: ");
        
        for (int i = 0; i < produto.length; i++){
            System.out.print(produto[i] + " ");
        }
        
        sc.close();
    }
}
