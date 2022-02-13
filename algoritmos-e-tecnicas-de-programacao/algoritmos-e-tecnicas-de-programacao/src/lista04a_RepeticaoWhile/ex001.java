/*
    Faça um programa que leia o número de termos e um valor positivo para X, calcule e mostre o valor da série abaixo.
    Por definição, o fatorial de um número natural não definido por: 0! = 1
    Exemplos: 3! = 3 x 2 x 1 = 6n! = n . (n �1).(n �2) ... 3 . 2 . 15! = 5 x 4 x 3 x 2 x 1 = 120
 
    Observe que:
    - A série termina quando atinge a quantidade de termos que usuário vai desejar calcular;
    - Os termos variam entre positivo e negativo.
 
    S=-x^2/1! + x^3/2! - x^4/3! + x^5/4!-...,
*/

package lista04a_RepeticaoWhile;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de termos: ");
        int termos = sc.nextInt();

        System.out.println("Digite o valor de x: ");
        int valorX = sc.nextInt();

        if (termos > 0) {
            
            int count = 1;
            double S = 0;
            
            double numerador = 1;
            
            while (count <= termos){
                double denominador = Math.pow(valorX, (count+1));
                
                
                while (numerador <= termos){
                    numerador += (numerador *(termos-1));
                    termos--;
                }
                
                S += ((-1)*(denominador/numerador));
                        
                numerador ++;
                count++;
            }

            System.out.printf("Resultado operação: %.2f", S);
        } else {
            System.out.println("Não é possível calcular.");
        }

        sc.close();
    }
}
