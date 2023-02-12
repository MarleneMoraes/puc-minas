package br.pucminas.aedsii.estruturadedados.listaii;

import java.util.Random;

/**
* Introduction to Java: Vectors and Matrices
* 
* @author MarleneMoraes
* @date 09-07-2022
* */

/*
 * Altere o programa da Questão 03 para criação de uma classe 
 * que gere aleatoriamente uma matriz de valores inteiros positivos 
 * de tamanho n x m, onde n ≤ 3 e m ≤ 3 (m e n não necessariamente 
 * iguais). A criacão da matriz deve ser feita no construtor, com 
 * os valores n e m passados como parâmetros. Gere um método para 
 * retornar cada uma das informações abaixo:
 * a) Indicar se a matriz é quadrada (retornar como boolean).
 * b) A soma dos elementos de cada coluna (array de inteiros);
 * c) A soma dos elementos de cada linha (array de inteiros);
 * d) A soma de todos os elementos ímpares da matriz.
 * e) Se a matriz for 3 × 3, calcular o determinante da matriz. Caso contrário, retornar -1.
 * 
 * • Referência 1: https://sabermatematica.com.br/determinante-de-matriz-3x3.html
 * • Referência 2: https://brasilescola.uol.com.br/matematica/determinantes-1.htm
 * • Referência 3: https://pt.wikipedia.org/wiki/Determinante
 */

public class Ex004 {
    public static void main(String[] args) {
       Matrix matrixQ = new Matrix(3, 3);

       System.out.println("Matriz Quadrada: " + matrixQ.isPerfectSquare());
       System.out.print("Soma das colunas: ");
       matrixQ.sumColumn();
       System.out.print("Soma das colunas: "); 
       matrixQ.sumLine();
       System.out.println("Soma dos elementos ímpares: " + matrixQ.sumOdd());
       System.out.println("Determinante da matriz 3x3 (caso exista): " + matrixQ.determinantMatrix());

       Matrix matrix = new Matrix(3, 4);

       System.out.println("Matriz Quadrada: " + matrix.isPerfectSquare());
       System.out.print("Soma das colunas: ");
       matrix.sumColumn();
       System.out.print("Soma das Linhas: ");
       matrix.sumLine();
       System.out.println("Soma dos elementos ímpares: " + matrix.sumOdd());
       System.out.println("Determinante da matriz 3x3 (caso exista): " + matrix.determinantMatrix());
    }

    
}

class Matrix {
    private int n;
    private int m;
    private int[][] matrix;


    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.matrix = new int[this.n][this.m];
        
        this.createMatrix();
    }

    public void createMatrix(){
        Random random = new Random();
        if ((m > 0 && m <= 3) && (n > 0 && n <= 3)){
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++)
                    matrix[i][j] = random.nextInt(20);
            }
        } else 
            System.out.println("ERRO");
    }
    
    //a)
    public boolean isPerfectSquare (){
        if (m == n) 
            return true;
     
        return false;     
    }

    //b)
    public void sumColumn(){
        int sum[] = new int[m];

        for(int j = 0; j < m; j++){
            for(int i = 0; i < n; i++)
                sum[i] += matrix[i][j];
        }

        for (int i : sum) 
            System.out.print(i + " ");
        
    }

    //c)
    public void sumLine(){
        int sum[] = new int[n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++)
                sum[j] += matrix[i][j];
        }

        for (int i : sum) 
            System.out.print(i + " ");
    }

    //d)
    public int sumOdd(){
        int sumOdd = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] % 2 != 0)
                    sumOdd += matrix[i][j];
            }
        }
        return sumOdd;
    }

    //e)
    public int determinantMatrix(){
        if (m == 3 && n == 3){  
            return ((this.matrix[0][0] * this.matrix[1][1] * this.matrix[2][2])
            		+ (this.matrix[0][1] * this.matrix[1][2] * this.matrix[2][0])
            		+ (this.matrix[0][2] * this.matrix[1][0] * this.matrix[2][1]))
            		- ((this.matrix[0][0] * this.matrix[1][2] * this.matrix[2][1])
            		+ (this.matrix[0][1] * this.matrix[1][0] * this.matrix[2][2])
            		+ (this.matrix[0][2] * this.matrix[1][1] * this.matrix[2][0]));
        }
        
        return -1;
    }


}
