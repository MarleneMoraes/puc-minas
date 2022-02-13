/*
    Faça um programa que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre: 
	a. a idade dessa pessoa; 
	b. quantos anos ela terá em 2050. 
 */

package lista01_Sequenciais;

import java.util.Scanner;

public class ex009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos anos você terá em 2050?");
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        sc.close();

        int idade = anoAtual - anoNascimento;
        int idadeFutura = 2050 - anoNascimento;

        System.out.printf("Você tem %d anos. Em 2050, você terá %d anos.", idade, idadeFutura);
    }
}
