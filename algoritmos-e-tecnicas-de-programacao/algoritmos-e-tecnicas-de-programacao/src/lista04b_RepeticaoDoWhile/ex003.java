/*
    Faça um programa que leia um conjunto não determinado de valores, um de cada vez, e escreva uma tabela com cabeçalho, que deve ser repetido a cada vinte linhas. 
    A tabela deverá conter o valor lido, seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada de dados com um valor negativo ou zero.
 */
package lista04b_RepeticaoDoWhile;

import java.util.Scanner;

/**
 *
 * @author Marlene
 */
public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float numero;
        int linhas = 0;
        

        do {
            numero = sc.nextFloat();
            
            if (linhas == 0 || linhas%20 ==0){
                System.out.println("Número                        Quadrado                     Cubo                     Raiz Quadrada");
                
            }
            linhas++;
            
            if (numero > 0) {
                double quadrado = Math.pow(numero, 2);
                double cubo = Math.pow(numero, 3);
                double raiz = Math.sqrt(numero);
                
                System.out.printf("%.2f                        %.2f                       %.2f                       %.2f\n", numero, quadrado, cubo, raiz);
            }   
            
            
        } while (numero > 0);

        sc.close();
    }
}
