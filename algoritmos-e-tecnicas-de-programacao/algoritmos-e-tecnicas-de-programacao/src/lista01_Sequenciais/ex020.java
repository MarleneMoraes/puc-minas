/*
    Escreva um programa para ler o número de eleitores de um município, o número de votos brancos, nulos e válidos. 
    Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, saiba o percentual desta eleição!");
        System.out.print("Digite o número de eleitores do município: ");
        int eleitores = sc.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int brancos = sc.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int nulos = sc.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int validos = sc.nextInt();
       

        double percentualBrancos = (brancos / eleitores);
        float percentualNulos =  (float)(nulos / eleitores);
        float percentualValidos =  (float)(validos / eleitores);

        System.out.print("Os votos dos eleitores desse município foram de" + percentualBrancos + "% brancos, " + percentualNulos + "% nulos, e " + percentualValidos + "% válidos.");
        sc.close(); 
    }
}
