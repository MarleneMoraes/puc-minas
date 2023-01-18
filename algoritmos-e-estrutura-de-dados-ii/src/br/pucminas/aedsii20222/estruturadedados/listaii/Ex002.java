package br.pucminas.aedsii20222.estruturadedados.listaii;

import java.util.Random;
import java.util.Scanner;

/**
* Introduction to Java: Vectors and Matrices
* 
* @author MarleneMoraes
* @date 09-07-2022
* */

/*
 * Altere o programa da Questão 01 para que seja solicitado ao usuário 
 * um valor x, onde 1 ≤ x ≤ 5. Sorteie 10 números aleatórios, de 0 a 20, 
 * e preencha um vetor A. Em seguida, gere um vetor aleatório B, onde o
 * elemento na posição i do vetor A, será o elemento i +x no vetor B. 
 * Caso i +x > 10, o elemento deverá ser ser alocado na primeira posição 
 * vazia do vetor B, em ordem, conforme exemplo abaixo:
 * Exemplo:
 * • Valor x: 4
 * • Vetor A: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
 * • Vetor B: 4, 5, 6, 7, 8, 9, 0, 1, 2, 3
 * Obs.: Lembrar que o vetor é aleatório. O vetor ordenado foi utilizado apenas para melhor compreensão.
 */

public class Ex002 {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        System.out.print("Valor x: ");
        int value = scan.nextInt();

        composeArray(value, A, B);
         
        scan.close();
    }

    public static void composeArray(int value, int A[], int B[]){
        Random random = new Random();
        
        if (value > 0 && value <= 5){
            for(int i = 0; i < A.length; i++) 
                A[i] = random.nextInt(20);
            
            for(int i = 0; i < B.length; i++) {
                if ((i + value) < B.length) 
                    B[i] = A[i + value];
                else {
                    for(int j = 0; j < value; j++){
                        B[i] = A[j];
                        i++;
                    }
                    break;
                }   
            }

            printArray(A, B);
        } else 
            System.out.println("ERRO");
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
                System.out.print(B[i] + " ]");
            else 
                System.out.print(B[i] + " ");
        }
    }
}
