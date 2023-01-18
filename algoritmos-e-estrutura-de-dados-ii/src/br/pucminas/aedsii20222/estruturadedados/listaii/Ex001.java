package br.pucminas.aedsii20222.estruturadedados.listaii;

import java.util.Random;

/**
* Introduction to Java: Vectors and Matrices
* 
* @author MarleneMoraes
* @date 09-07-2022
* */

/*
 * Escreva um programa em Java que sorteie 10 números aleatórios, 
 * de 0 a 20, e preencha um vetor A. Em seguida, gere um vetor 
 * aleatório B, onde o elemento na posição i do vetor A, será o 
 * elemento i+1 no vetor B. O último elemento do vetor A será o 
 * elemento 0 no vetor B.
 * Exemplo:
 * • Vetor A: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
 * • Vetor B: 1, 2, 3, 4, 5, 6, 7, 8, 9, 0
 * Obs.: Lembrar que o vetor é aleatório. O vetor ordenado foi utilizado apenas para melhor compreensão.
 */

public class Ex001 {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        
        composeArray(A, B);
    }

    public static void composeArray(int A[], int B[]){
        Random random = new Random();
        
        for(int i = 0; i < A.length; i++) 
            A[i] = random.nextInt(20);
           
        for (int i = 0; i < B.length; i++) {
            if (i == 9)
                B[i] = A[0];
            else
                B[i] = A[(i+1)];
        }

        printArray(A, B);
    }

    public static void printArray(int A[], int B[]){
        for(int i = 0; i < A.length; i++){
            if (i == 0)
                System.out.print("[ " + A[i] + " ");
            else if (i == 9)    
                System.out.print(A[i] + " ]");
            else 
                System.out.print(A[i] + " ");
        }

        for(int i = 0; i < B.length; i++){
            if (i == 0)
                System.out.print("[ " + B[i] + " ");
            else if (i == 9)    
                System.out.print(B[i]+ "]");
            else 
                System.out.print(B[i] + " ");
        }
    }
}
