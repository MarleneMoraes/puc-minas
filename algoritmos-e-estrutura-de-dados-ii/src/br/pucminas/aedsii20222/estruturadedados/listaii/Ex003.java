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
 * Faça um programa em Java que gere aleatoriamente uma matriz de valores 
 * inteiros positivos de tamanho n x m, onde n ≤ 5 e m ≤ 5 (m e n não 
 * necessariamente iguais).
 * Calcule:
 * a) A soma dos elementos de cada coluna;
 * b) A soma dos elementos de cada linha;
 * c) A posição de todos os números pares (tupla (linha, coluna));
 * d) A soma de todos os elementos ímpares da matriz.
 * e) Se a matriz for quadrada, calcular a soma da diagonal principal. Caso 
 * contrário, retornar -1.
 * Recomendações: Gere um método para cada letra, retornando o valor 
 * correspondente ao requisito.
 */

public class Ex003 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Valor n: ");
        int n = scan.nextInt();

        System.out.print("Valor m: ");
        int m = scan.nextInt();

        if ((m > 0 && m <= 5) && (n > 0 && n <= 5)){
            Random random = new Random();

            int [][] matrix = new int[n][m];

            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++)
                    matrix[i][j] = random.nextInt(20);
            }

            printMatrix(matrix, m, n);

            //a)
            sumColumn(matrix, m, n);

            //b)
            sumLine(matrix, m, n);
            
            //c)
            evenPositions(matrix, m, n);
            
            //d)
            sumOdd(matrix, m, n);

            //e)
            System.out.println(perfectSquare(matrix, m, n));
        } 
        else 
            System.out.println("ERRO");
        
        scan.close();
    }

    public static void printMatrix (int mt[][], int m, int n){
        System.out.println("Matriz:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                System.out.printf("[%d]   ", mt[i][j]);

            System.out.println();
        }
        System.out.println();
    }

    public static void sumColumn(int mt[][], int m, int n){
        for(int j = 0; j < m; j++){
            int sumColumn = 0;
            for(int i = 0; i < n; i++)
                sumColumn += mt[i][j];
            System.out.printf("Soma da coluna %d: %d\n", j, sumColumn);
        }
    }

    public static void sumLine(int mt[][], int m, int n){
        for(int i = 0; i < n; i++){
            int sumLine = 0;
            for(int j = 0; j < m; j++)
                sumLine += mt[i][j];
            System.out.printf("Soma da linha %d: %d\n", i, sumLine);
        }
    }

    public static void evenPositions(int mt[][], int m, int n){
        System.out.println("Posições de valores pares: ");

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(mt[i][j] % 2 == 0)
                    System.out.printf("[%d][%d]  ", i, j);
            }
        }
        System.out.println();
    }

    public static void sumOdd(int mt[][], int m, int n){
        int sumOdd = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(mt[i][j] % 2 != 0)
                    sumOdd += mt[i][j];
            }
        }
        System.out.printf("Soma dos ímpares: %d\n", sumOdd);
    }

    public static int perfectSquare (int mt[][], int m, int n){
        if (m == n) {
            int sumDiagonal = 0;
            for(int i = 0; i < n; i++) 
                sumDiagonal += mt[i][i];
            
            return sumDiagonal;
        }  
        
        return -1;     
    }
}
