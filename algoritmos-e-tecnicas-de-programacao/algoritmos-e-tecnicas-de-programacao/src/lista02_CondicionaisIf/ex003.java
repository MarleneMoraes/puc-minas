/*
    A nota final de um estudante é calculada a partir de três notas atribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um exame final. 
    A média das três notas mencionadas obedece aos pesos a seguir:
            Nota                       Peso
       Trabalho de laboratório		2
       Avaliação semestral              3
       Exame final			5
  
    Faça um programa que receba 3 notas, calcule e mostre a média ponderada e o conceito que segue a tabela:
        Média ponderada                     Conceito
        >=8   e  <=10				A
        >=7   e  < 8				B
        >=6   e  < 7				C
        >=5   e  < 6				D
        >=0   e  < 5				E
 */
package lista02_CondicionaisIf;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o valor da primeira nota: ");
        float nota1 = sc.nextFloat();

        System.out.print("Insira o valor da segunda nota: ");
        float nota2 = sc.nextFloat();

        System.out.print("Insira o valor da terceira nota: ");
        float nota3 = sc.nextFloat();
        sc.close();

        float media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / (2 + 3 + 5);

        if (media >= 8 && media <= 10) {
            System.out.println("Conceito A");
        } else if (media >= 7 && media < 8) {
            System.out.println("Conceito B");
        } else if (media >= 6 && media < 7) {
            System.out.println("Conceito C");
        } else if (media >= 5 && media < 6) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito E");
        }
    }
}
