/*
    Faça um programa que leia três números reais representando os lados de um triângulo e informe se seu triângulo é Equilátero, Isósceles ou Escaleno.
 */
package lista02_CondicionaisIf;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o tamanho do primeiro lado do triângulo: ");
        float ladoA = sc.nextFloat();

        System.out.print("Informe o tamanho do segundo lado do triângulo: ");
        float ladoB = sc.nextFloat();

        System.out.print("Informe o tamanho do terceiro lado do triângulo:");
        float ladoC = sc.nextFloat();
        sc.close();

        if ((ladoA == ladoB) && (ladoB == ladoC)) {
            System.out.print("Seu triângulo é equilátero.");
        } else if (((ladoA == ladoB) && (ladoA != ladoC)) || ((ladoB == ladoC) && (ladoA != ladoB))) {
            System.out.print("Seu triângulo é isósceles.");
        } else {
            System.out.print("Seu triângulo é escaleno.");
        }
    }
}
