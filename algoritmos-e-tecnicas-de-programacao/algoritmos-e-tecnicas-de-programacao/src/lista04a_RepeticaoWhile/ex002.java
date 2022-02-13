/*
    Faça um programa que receba duas notas de seis alunos, calcule e mostre:
        a)  A média aritmética das duas notas de cada aluno;
        b)  imprima a mensagem que está na tabela;
        c) o total de alunos aprovados;
        d) o total de alunos de exame;
        e) o total de alunos reprovados;
        f) a média aritmética da classe.
    
    Média Aritmética		Mensagem
        Até 3			reprovado
        >3 e <7			exame
        >=7			aprovado
 */
package lista04a_RepeticaoWhile;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int alunos = 0;
        int reprovado = 0;
        int exame = 0;
        int aprovado = 0;
        double mediaClasse = 0;
        
        while (alunos < 6) {
            System.out.print("Digite a primeira nota: ");
            float nota1 = sc.nextFloat();
            
            System.out.print("Digite a segunda nota: ");
            float nota2 = sc.nextFloat();
            float media = (nota1+nota2)/2;
	
            System.out.printf("Média do aluno: %.2f\n", media);
            
            if (media <= 3) {
                System.out.println("Reprovado");
                reprovado++;
            } else if (media > 3 && media < 7) {
                System.out.println("Exame");
                exame++;
            } else if (media >= 7 && media <= 10) {
                System.out.println("Aprovado");
                aprovado++;
            } 
            
            mediaClasse += media;
            alunos++;           
        }
        
        System.out.printf("Alunos aprovados: %d\n", aprovado);
        System.out.printf("Alunos reprovados: %d\n", reprovado);
        System.out.printf("Alunos de exames: %d\n", exame);

        mediaClasse /= 6;

        System.out.printf("A média aritmética da classe: %.2f\n", mediaClasse);

        sc.close();
    }
}
