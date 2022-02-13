/*
    Faça um programa que preencha um vetor com oito números inteiros, calcule e mostre dois vetores resultantes. 
    O primeiro vetor resultante deve conter os números positivos, o segundo deve conter os números negativos. Cada 
    vetor resultante vai ter, no máximo, oito posições que poderão não ser completamente utilizadas.
 */
package lista07_Vetores;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int []vetor = new int [8];
        int []positivos = new int [8];
        int []negativos = new int [8];
        
        for (int i = 0; i < vetor.length; i++){
            System.out.print("Digite um valor: ");
            vetor[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] >= 0) {
                positivos[i] = vetor[i];  
            } else {
                negativos[i] = vetor[i];
            }            
        }
        
        System.out.println("Números positivos: ");
        
        for (int i = 0; i < positivos.length; i++){
            if (positivos[i] != 0){
                System.out.print(positivos[i] + " ");  
            }  
        }
        
        System.out.println("\nNúmeros negativos: ");
        
        for (int i = 0; i < negativos.length; i++){
            if (negativos[i] != 0) {
                System.out.print(negativos[i] + " ");  
            }         
        }
        
        sc.close();
    }
    
}
