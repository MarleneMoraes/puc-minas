/* 
    Cada degrau de uma escala tem X de altura. Faça um programa que receba essa altura e a altura que o usuário deseja alcançar subindo a escada, 
    calcule e mostre quantos degraus ele deverá subir para atingir seu objetivo, sem se preocupar com a altura do usuário. Todas as medidas 
    fornecidas devem estar em metros.
 */
package lista01_Sequenciais;

import java.util.Scanner;

public class ex014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Altura do degrau (em m): ");
        float alturaDegrau = sc.nextFloat();

        System.out.print("Altura que deseja alcançar (em m): ");
        float alturaTotal = sc.nextFloat();
        

        int degraus = (int)(alturaTotal / alturaDegrau);

        System.out.printf("Para atingir seu objetivo, deverá subir %d degraus", degraus);
        sc.close();
    }
}