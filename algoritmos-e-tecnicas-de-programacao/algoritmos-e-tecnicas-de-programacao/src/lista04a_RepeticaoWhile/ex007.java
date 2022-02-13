/* 
    Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem para preenchimento de vagas em seu quadro de funcionários. 
    Supondo que você seja o programador dessa empresa, faça um programa que leia, para cada candidato, a idade, o sexo (M ou F) e a experiência no serviço 
    (S ou N). Para encerrar a entrada de dados, digite zero para a idade. O programa também deve calcular e mostrar: 
        a) O número de candidatos do sexo feminino; 
        b) O número de candidatos do sexo masculino; 
        c) A idade média dos homens que já têm experiência no serviço; 
        d) A porcentagem dos homens com mais de 45 anos entre o total dos homens; 
        e) O número de mulheres com idade inferior a 21 anos e com experiência no serviço; 
        f) A menor idade entre as mulheres que já têm experiência no serviço. 
*/

package lista04a_RepeticaoWhile;

import java.util.Scanner;

public class ex007 {
     public static void main(String[] args) {
        int idade = 1, candidatoFeminino = 0, candidatoMasculino = 0, experienciaHomens=0, candidatosMais45 = 0, menorIdadeFeminino = 0, candidatoFemininoMenor21 = 0;
        float mediaIdadeHomens = 0;
        
        Scanner sc = new Scanner(System.in);

        while (idade != 0) {
            System.out.println("CANDIDATOS DA EMPRESA");
            System.out.println("Olá, candidato(a)! Digite os campos abaixo:");

            System.out.print("Idade: ");
            idade = sc.nextInt();

            System.out.print("Gênero: ");
            char genero = sc.next().charAt(0);

            System.out.print("Possui experiência? ");
            char experiencia = sc.next().charAt(0);
                    
            if (genero == 'F' || genero == 'f') {
                candidatoFeminino++;
                if (experiencia == 'S' || experiencia == 's') {
                    if (idade < menorIdadeFeminino) {
                        menorIdadeFeminino = idade;
                    }

                   if (idade < 21){
                      candidatoFemininoMenor21++;
                   }   
                }
            } else if (genero == 'M' || genero == 'm') {
                candidatoMasculino++;
               
                if (experiencia == 'S' || experiencia == 's'){
                    experienciaHomens++;
                    mediaIdadeHomens += idade;
                }
         
                if (idade > 45) {
                    candidatosMais45++;
                }
            }
            
            mediaIdadeHomens /= experienciaHomens;
            candidatosMais45 /= candidatoMasculino;
            
            System.out.printf("Número de candidatas: %d", candidatoFeminino);
            System.out.printf("Número de candidatos: %d", candidatoMasculino);
            System.out.printf("Idade Média dos homens com experiência: %.0f", mediaIdadeHomens);
            System.out.printf("Porcentagem dos homens com mais de 45 anos entre o total dos homens: %d por cento", candidatosMais45);
            System.out.printf("Mulheres com idade menos de 21 anos e com experiência: %d", candidatoFemininoMenor21);
            System.out.printf("A menor idade entre as mulheres que já têm experiência: %d", menorIdadeFeminino);

            sc.close();
        }

    }
}
