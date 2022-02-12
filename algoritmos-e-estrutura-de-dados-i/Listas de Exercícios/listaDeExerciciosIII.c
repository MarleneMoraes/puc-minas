#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

/*
  Author: Marlene Moraes
  Since: 04/10/2020
*/

int main(void)
{
  setlocale(LC_ALL, "Portuguese");
  int opcao;

  printf("Digite o exercício desejado: ");

  switch (opcao)
  {
  case 1:
    exercicio1();
    break;

  case 2:
    exercicio2();
    break;

  case 3:
    exercicio3();
    break;

  case 4:
    exercicio4();
    break;

  case 5:
    exercicio5();
    break;

  case 6:
    exercicio6();
    break;

  case 7:
    exercicio7();
    break;

  case 8:
    exercicio8();
    break;

  case 9:
    exercicio9();
    break;

  case 10:
    exercicio10();
    break;

  default:
    printf("Opção não encontrada.");
  }
}

exercicio1()
{
  /*
    Faça um algoritmo que leia um conjunto de números (X) e imprima a quantidade de números pares (QPares) e a quantidade de números impares (QImpares) lidos. Admita que o valor 9999 é utilizado como sentinela (FLAG) para fim de leitura. 

    Ex.:1, 2, 3, 4, 5, 9999 =>Pares=2 Impares=3
  */

  setlocale(LC_ALL, "Portuguese");

  int numero, QPar, QImpar;

  QPar = 0;
  QImpar = 0;

  printf("Quantidade de Pares e Ímpares\n");

  while (numero != 9999)
  {

    printf("Digite o número: ");
    scanf("%d", &numero);

    if (numero % 2 == 0)
    {
      QPar += 1;
    }
    else
    {
      QImpar += 1;
    }
  }

  printf("\n Pares = %d Impares = %d ", QPar, QImpar);
}

exercicio2()
{
  /*
    Faça um programa que leia um conjunto indeterminado de números inteiros positivos e imprima o maior, o menor e a média aritmética desse conjunto de dados. (Flag-1).
    
    Execute este programa para os seguintes valores:
    
    1. 1,2,3,-1
    2. 3,2,1,-1
    3. 1,3,2,-1
  */

  setlocale(LC_ALL, "Portuguese");

  int maior, menor, count;
  float media, numero;

  printf("Maior, Menor e a Média de um conjunto de números\n");
  printf("Digite um número: ");
  scanf("%f", &numero);

  count = 1;
  maior = numero;
  menor = numero;
  media += numero;

  while (numero != -1)
  {
    printf("Digite um número: ");
    scanf("%f", &numero);
    media += numero;

    if (numero > maior)
    {
      maior = numero;
    }

    if (numero < menor && numero != -1)
    {
      menor = numero;
    }

    count++;
  }

  media /= count;
  printf("Maior: %d\n", maior);
  printf("Menor: %d\n", menor);
  printf("Média: %.2f", media);
}

exercicio3()
{
  /*
    Escrever um algoritmo para calcular e imprimir o fatorial de um número lido do teclado.
    Ex. Fatorial de 5!=5x4x3x2x1=120
 */

  setlocale(LC_ALL, "Portuguese");
  int numero, fatorial;

  printf("Cálculo de Fatoriais\n");
  printf("Digite o número desejado para saber o fatorial: ");
  scanf("%d", &numero);

  if (numero > 0)
  {
    for (fatorial = 1; numero > 1; numero--)
    {
      fatorial *= numero;
    }
    printf("\nFatorial calculado: %d", fatorial);
    return 0;
  }
  else
  {
    printf("Não existem fatoriais negativos.");
  }

  return 0;
}

exercicio4()
{
  /*
    Calcule o valor da seguinte série lido a quantidade de termos:

    S = 1-(1/(3^3)) + (1/(5^3)) - (1/(7^3))+(1/(9^3)) ....
  */

  setlocale(LC_ALL, "Portuguese");

  int count, termos;
  float S, N, denominador;

  S = 1;

  printf("Cálculo do valor de S\n");
  printf("Quantidade de termos: ");
  scanf("%d", &termos);

  denominador = pow((3 + (2 * count)), 3);

  for (count = 0; count <= termos; count++)
  {
    if (count % 2 == 0)
    {
      S -= (1 / denominador);
    }
    else
    {
      S += (1 / denominador);
    }
  }

  printf("%.2f", S);
}

exercicio5()
{
  /* 
    A série de fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
    Escreva um algoritmo que peça um número N maior que 2. Gere e imprima a série até este n-ésimo termo.
  */

  setlocale(LC_ALL, "Portuguese");
  int a1, a2, an, termos, i;

  a1 = 0;
  a2 = 1;
  an = 1;

  printf("Sequência de Fibonacci\nDigite o número de termos: ");
  scanf("%d", &termos);

  if (termos > 2)
  {
    printf("%d %d ", a1, a2);

    for (i = 1; i <= termos; i++)
    {
      an = a2 + a1;
      a1 = a2;
      a2 = an;
      printf("%d ", an);
    }
  }
  else
  {
    printf("Não é possível calcular.");
  }
  return 0;
}

exercicio6()
{
  /*
    Fazer um algoritmo para calcular o valor de s, dado por, sendo o valor de N deverá se lido do teclado
    S = + (1/N) - (2/N-1) + (3/n-2) - (4/n-3)+ ...(N/1) 
 */

  setlocale(LC_ALL, "Portuguese");

  int count;
  float S, N, numerador, denominador;

  printf("Cálculo do valor de S\n");
  printf("Digite um número: ");
  scanf("%f", &N);

  count = 1;
  numerador = 1;
  denominador = N;

  while (denominador >= 1)
  {
    if (count % 2 == 1)
    {
      S += numerador / denominador;
    }
    else
    {
      S -= numerador / denominador;
    }

    numerador++;
    denominador--;
    count++;
  }

  printf("%.2f", S);
}

exercicio7()
{
  /* 
    Números palíndromos são aqueles que escritos da direita para esquerda ou da esquerda para direita tem o mesmo valor. 
    Exemplo:929, 44, 97379. Fazer um algoritmo que imprima todos os números palíndromos de 10000 a 99999.
  */

  setlocale(LC_ALL, "Portuguese");

  int numero1, numero2, numero3, numero4, numero5, numero, A, inverter, i, count;

  for (i = 10000; i <= 99999; i++)
  {
    numero = i;

    numero1 = numero / 10000;
    A = numero % 10000;

    numero2 = A / 1000;
    A = A % 1000;

    numero3 = A / 100;
    A = A % 100;

    numero4 = A / 10;

    numero5 = A % 10;

    inverter = (numero5 * 10000) + (numero4 * 1000) + (numero3 * 100) + (numero2 * 10) + numero1;

    if (numero == inverter)
    {
      printf("%d", numero);
      count++;
    }
  }

  printf("Quantidade de números palídromos: %d", count);
}

exercicio8()
{
  /*
    O numero 3025 possui a seguinte característica:
      30 + 25 = 55
      55^2 = 3025
    Quantos e quais são os números de 4 dígitos possuem essa característica?
  */

  setlocale(LC_ALL, "Portuguese");
  int numero, parte1, parte2, parte3, parte4,
      auxiliar, primeiraParte, segundaParte, soma, calculo, count;

  printf("Característica 3025\n");

  count = 0;

  for (int i = 1000; i <= 9999; i++)
  {
    numero = i;

    parte1 = numero / 1000;
    auxiliar = numero % 1000;

    parte2 = auxiliar / 100;
    auxiliar = auxiliar % 100;

    parte3 = auxiliar / 10;
    parte4 = auxiliar % 10;

    primeiraParte = (parte1 * 10) + parte2;
    segundaParte = (parte3 * 10) + parte4;

    soma = primeiraParte + segundaParte;
    calculo = pow(soma, 2);

    if (calculo == numero)
    {
      printf("%d ", numero);
      count++;
    }
  }

  printf("\nQuantidade de números com a característica: %d", count);
}

exercicio9()
{
  /*
    Faça um programa para jogo de cara ou coroa. 
    Neste caso, o jogador escolhe coroa (0 - cara e 1 - coroa) mostre ao final de 10 tentativas, quantas foram certas e quantas erradas. 
  */

  setlocale(LC_ALL, "Portuguese");
  int i, jogo, certas, erradas, tentativa;

  certas = 0;
  erradas = 0;

  printf("Cara ou Coroa?\n");
  printf("Escolha 0 - cara ou 1 - coroa que direi quantas foram certas e quantas erradas.\n");

  for (i = 0; i < 10; i++)
  {
    jogo = rand() % 1;

    printf("Digite o valor: ");
    scanf("%d", &tentativa);

    if (jogo == tentativa)
    {
      certas++;
    }
    else
    {
      erradas++;
    }
  }

  printf("Acertos: %d\n", certas);
  printf("Erros: %d", erradas);
}

exercicio10()
{
  /*
    Faça um programa para adivinhar um número escolhido pelo usuário, entre 1 e 1023. 
    Indique ao final quantas tentativas foram necessárias. O programa deverá localizar o número escolhido pelo usuário em no máximo 10 tentativas!
    Utilize a seguinte proposta. Pegue o valor intermediário e pergunte ao usuário se o número é igual(=), maior(>) ou menor(<) que o que foi escolhido. 
    Se for (=) implica que acertou! Se for maior escolha agora o número intermediário entre o que foi perguntado e o último, caso contrário escolha o 
    intermediário entre o primeiro e o que foi perguntado, seguindo assim até acertar!
    Verifique que você conseguirá acertar qualquer número em no máximo 10 tentativas!!!
  */
  int main()
  {
    int tentativa, inicio, fim, maior, menor, intermediario, chute;
    char resposta;
    
    printf("Adivinhe o valor");
    chute = rand() % 1024;
    menor = chute;
    maior = chute;

    while (tentativa < 10)
    {
      printf("%d. Ele é igual (=), maior (>) ou menor (<)?", chute);
      scanf(%s, resposta)

      if (resposta == "="){
        printf("Acertei!")
      } else if (resposta == ">"){
        chute = maior;
        chute = rand() % maior;
      } else if (resposta == "<"){
        chute = menor;
        chute = rand() % menor; 
      }
    }

    printf("Fim de Jogo");
  }
}