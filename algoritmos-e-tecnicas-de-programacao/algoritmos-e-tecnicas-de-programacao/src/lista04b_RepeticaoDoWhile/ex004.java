/*
    Faça um programa que receba vários números, finalizando a entrada de dados com a digitação do número 30.000. Calcule e mostre:
        a) A soma dos números digitados;
        b) A quantidade de números digitados;
        c) A média dos números digitados;
        d) O maior número digitado;
        e) O menor número digitado;
        f) A média dos números digitados;
        g) A porcentagem dos números ímpares entre todos os números digitados.
 */
package lista04b_RepeticaoDoWhile;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        int count = 0;
        int impares = 0;
        int maiorNumero = 0;
        int menorNumero = 0;

        System.out.print("Digite um valor: ");
        int numero = sc.nextInt();

        do {
            soma += numero;
            count++;

            if (numero % 2 != 0) {
                impares++;
            }
            
            if (numero > maiorNumero){
              maiorNumero = numero;  
            }
            
            if (numero < menorNumero || menorNumero == 0){
                menorNumero = numero;
            }

            System.out.print("Digite um valor: ");
            numero = sc.nextInt();
        } while (numero != 30000);

        float media = (soma / count);
        
        float percentualImpares = (impares/count);
        
        System.out.printf("\nSoma dos números digitados: %d\n", soma);
        System.out.printf("Quantidade de números digitados: %d\n", count);
        System.out.printf("Média dos números digitados: %.1f\n", media);
        System.out.printf("Maior número digitado: %d\n", maiorNumero);
        System.out.printf("Menor número digitado: %d\n", menorNumero);
        System.out.printf("Porcentagem dos números ímpares entre todos os números digitados: %.2f\n", percentualImpares);
        
        sc.close();
    }

    
}

