/*
    Em um campeonato de futebol existem cinco times e cada um possui onze jogadores.
        Faça um programa que receba a idade, o peso e a altura de cada um dos jogadores, calcule e mostre:
        a. A quantidade de jogadores com idade inferior a 18 anos;
        b. A média das idades dos jogadores de cada time;
        c. A média das alturas de todos os jogadores do campeonato;
        d. A percentagem de jogadores com mais de 80 quilos entre todos os jogadores do campeonato.
 */
package lista05_RepeticaoFor;

import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        long menorDezoito = 0;
        double mediaIdade = 0;
        double mediaAltura = 0;
        long maisOitenta = 0;


        for (int i = 1; i <= 5; i++){
            System.out.printf("Olá jogador do time %d! Digite os dados abaixo: ", i);

            for (int j = 0; j <= 10; j++){
                System.out.printf("Idade: ");
                int idade = sc.nextInt();

                System.out.printf("Peso: ");
                float peso = sc.nextFloat();

                System.out.printf("Altura: ");
                float altura = sc.nextFloat();

                if (idade < 18) {
                    menorDezoito++;
                }

                mediaIdade += idade;
                mediaAltura += altura;

                if (peso > 80.0) {
                    maisOitenta++;
                }

            }

            mediaIdade /= 11;
        }

        mediaAltura /= (5*11);
        double percentagemMaisOitenta = ((5*11) * 100) / maisOitenta;

        System.out.printf("Quantidade de jogadores com idade inferior a 18 anos: %d", menorDezoito);
        System.out.printf("Média das idades dos jogadores de cada time: %.2f", mediaIdade);
        System.out.printf("Média das alturas de todos os jogadores do campeonato: %.2f", mediaAltura);
        System.out.printf("Percentagem de jogadores com mais de 80 quilos entre todos os jogadores do campeonato: %.2f", percentagemMaisOitenta);
    }
}
