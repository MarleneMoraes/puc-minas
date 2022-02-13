/*
    Faça um programa que receba um número positivo e maior que zero, calcule e mostre: 
	a.	O número digitado ao quadrado;
	b.	O número digitado ao cubo;
	c.	A raiz quadrada do número digitado;
	d.	A raiz cúbica do número digitado.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex007 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite um número positivo e maior que zero: ");
        int numero = sc.nextInt();
        sc.close();
        
        double quadrado =  Math.pow(numero,2); 
        double cubo = Math.pow(numero, 3); 
        double raizQuadrada = Math.sqrt(numero); 
        double raizCubica = Math.cbrt(numero);
        
        System.out.printf("Quadrado de %d: %.2f\n", numero, quadrado);
        System.out.printf("Cubo de %d: %.2f\n", numero, cubo);
        System.out.printf("Raiz Quadrada de %d: %.2f\n", numero, raizQuadrada);
        System.out.printf("Raiz Cúbica de %d: %.2f", numero, raizCubica);

    }
}
