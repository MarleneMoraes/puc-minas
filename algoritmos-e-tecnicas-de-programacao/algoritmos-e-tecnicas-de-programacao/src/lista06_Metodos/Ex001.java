/*
    Faça um programa que contenha um método que receba o tempo em “segundos” que o usuário entrar. 
    Esse método deverá convertê-lo para horas, minutos e segundos e imprimi-los.
 */
package lista06_Metodos;

import java.util.Scanner;

public class Ex001 {

    static void converterSegundos(int s) {
        //1 hora = 60*60 minutos
        int horas = s / 3600;
        s -= (horas * 3600);

        //1 minuto = 60 segundos
        int minutos = s / 60;
        s -= (minutos * 60);

        System.out.printf("%d:%d:%d", horas, minutos, s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("CONVERSOR DE TEMPO");
        System.out.print("Digite o tempo em segundos: ");
        int segundos = sc.nextInt();

        converterSegundos(segundos);

    }
}
