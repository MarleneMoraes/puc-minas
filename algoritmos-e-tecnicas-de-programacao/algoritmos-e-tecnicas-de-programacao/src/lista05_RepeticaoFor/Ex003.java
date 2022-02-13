/*
    Faça um programa que monte os oito primeiros termos da sequência de Fibonacci:
    0 1 1 2 3 5 8 13 21 34 55 . . .
    Nesta sequência, os dois primeiros termos são 0 e 1 e os termos seguintes são calculados fazendo a soma dos dois anteriores.
 */
package lista05_RepeticaoFor;

public class Ex003 {
    public static void main(String[] args) {
        int a1=0;
        int a2=1;
        int an=1;

        System.out.println("Sequência de Fibonacci");
        System.out.printf("%d %d ", a1, a2);

        for (int i = 2; i < 8; i++){
            an = a2+a1;
            a1 = a2;
            a2=an;

            System.out.printf("%d ", an);
        }
    }

}