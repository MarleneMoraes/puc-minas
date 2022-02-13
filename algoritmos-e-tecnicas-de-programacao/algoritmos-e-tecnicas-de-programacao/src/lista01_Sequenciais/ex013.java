/*
    Pedro comprou um saco de ração com peso em quilos. Ele possui dois gatos, para os quais fornece a quantidade de ração em gramas. 
    A quantidade diária de ração fornecida para cada gato é sempre a mesma. 
    Faça um programa que receba o peso do saco de ração e a quantidade de ração fornecida para cada gato, calcule e mostre quanto restará de ração no saco após cinco dias.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o peso do saco de ração (em g): ");
        float pesoRacao = sc.nextFloat();

        System.out.print("Insira a quantidade diária fornecida para cada gato (em g): ");
        float quantidadeRacao = sc.nextFloat();
        sc.close();

        float racao = pesoRacao - ((quantidadeRacao * 2) * 5);

        System.out.printf("Peso de ração após 5 dias: %.2fg", racao);
    }
}
