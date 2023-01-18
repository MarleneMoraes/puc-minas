#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <ctype.h> //biblioteca para ler letras maiúsculas

int main(void)
{
  setlocale(LC_ALL, "Portuguese");

  exercicio1();

  exercicio2();

  exercicio3();

  exercicio4();

  exercicio5();

  exercicio6();

  exercicio7();

  exercicio8();

  exercicio9();

  exercicio10();
}

exercicio1()
{
  //Fazer um algoritmo que leia um numero inteiro e mostre uma mensagem indicando se este numero e par ou impar.
   
  int numero;

  printf("Par Ou Ímpar?\nOlá! Vamos conferir se o primeiro número é par ou ímpar. Digite um número: ");
  scanf("%i", &numero);

  if (numero%2 == 0)
  {
    printf("O número é par.");
  } 
  else 
  {
    printf("O número é ímpar.");
  }

}


exercicio2()
{
  // Fazer um algoritmo peça o nome e as 3 notas de um aluno e mostre, além do nome e do valor da media do aluno, uma mensagem de "Aprovado", caso a media seja igual ou superior a 6, ou a mensagem "reprovado", caso contrario.

  char nome[20];
  float nota1, nota2, nota3, media;

  printf("Boletim Escolar\nDigite o nome do aluno: ");
  scanf("%s", nome);

  printf("Digite a primeira nota: ");
  scanf("%f", nota1);

  printf("Digite a segunda nota: ");
  scanf("%f", nota2);

  printf("Digite a terceira nota: ");
  scanf("%f", nota3);

  media = (nota1+nota2+nota3)/3;

  if (media >= 6)
  {
    printf("%s está APROVADO", nome);
  }
  else
  {
    printf("%s está REPROVADO", nome);
  }
  return 0;

}

exercicio3()
{
  // Fazer um algoritmo que leia a temperatura da água e mostre se está no estado solido, líquido ou gasoso.
  float temperatura;
  
  printf("Estado da água \n Digite uma temperatura em celsius: ");
  scanf("%f", temperatura);
  
  if (temperatura <= 0)
  {
    printf("A água está no estado sólido.");
  } 
  else if (temperatura > 0 || temperatura <= 100)
  {
    printf("A água está no estado líquido.");
  } 
  else
  {
    printf("A água está no estado gasoso.");
  }
  return 0;
  
}

exercicio4()
{
  //Leia um valor X e se ele for menor que 0 avalie Y = x2+ 4. Se ele for maior que 0 avalie x3-3 e se ele for igual a 0 de uma mensagem de erro.

  float numero, Y;

  printf("Olá! Digite um número: ");
  scanf("%f", &numero);

  if (numero < 0)
  {
    Y = (numero*numero) + 4; //Y = x2+ 4
    printf("%f", &Y);
  } 
  else if (numero > 0)
  {
    Y = (numero*numero*numero) -3; //Y = x3-3
    printf("%f", &Y);
  }
  else 
  {
    printf("ERRO\nTente novamente");
  }

    return 0;
}

exercicio5()
{
  // Construa um algoritmo que receba como entrada três valores (A, B e C). Após o processamento o menor valor deverá estar em A e o maior valor em C, e o valor intermediário em B. Imprima A, B e C.

  int A, B, C, intermediario, maior, menor;

  printf("Menor, maior e intermediário\nDigite o primeiro valor: ");
  scanf("%i", &A);

  printf("Digite o segundo valor: ");
  scanf("%i", &B);
  

  printf("Digite o terceiro valor: ");
  scanf("%i", &C);

  if (A > B)
  {
    if(A > C)
    {
      A = maior;
      
      if(B > C)
      {
        B = intermediario;
        C = menor;
      }
      else
      {
        B = menor;
        C = intermediario;
      }
    }
    else
    {
      A = intermediario;
      B = menor;
    }
  }

  menor = A;
  intermediario = B;
  maior = C;

  printf("A = %i\nB = %i\nC = %i", A, B, C);

  return 0;
}

exercicio6()
{
  /*
    Desenvolver um algoritmo que leia três números inteiros: X, Y, Z  e verifique se o número X é divisível por Y e por Z. O algoritmo deverá mostrar as possíveis mensagens:
      - O número é divisível por Y e Z.
      - O número é divisível por Y mas não por Z.
      - O número é divisível por Z mas não por Y.
      - O número não é divisível nem Y nem por Z.
  */

  int X, Y, Z;


  printf("Divisível ou não?\nDigite o valor X: ");
  scanf("%i", &X);

  printf("Digite o valor de Y: ");
  scanf("%i", &Y);


  printf("Digite o valor de Z: ");
  scanf("%i", &Z);

  if ( X % Y == 0 && X % Z == 0 )
  {
    printf("O número é divisível por Y e Z.");
  }
  else if (X % Y == 0 && X % Z != 0 )
  {
    printf("O número é divisível por Y mas não por Z.");
  }
  else if (X % Y != 0 && X % Z == 0 )
  {
    printf("O número é divisível por Z mas não por Y.");
  }
  else
  {
    printf("O número não é divisível nem Y nem por Z.");
  }

  return 0;

}

exercicio7()
{
  /*
    O numero 3025 possui a seguinte característica: 30 + 25 = 55
    55²= 3025
    Fazer um algoritmo que dado um numero de 4 dígitos (verifique se o número pertence a faixa) calcule e escreva se ele possui ou não esta característica.
  */
  int x[2], soma; 

  for (i=0; i<2;i++){
    printf("Digite um valor: ");
    scanf("%i", &x);

    if (x[i] > 99) {
      printf("ERRO. Tente novamente.")
    }
  }

  n[0]+n[1] = soma;
  if ((soma^2) == n[0]+n[1]){
    printf("Tem a característica.")
  } 
  else
  {
    printf("Não tem a característica.")
  }
 
}

exercicio8()
{
  /*
    Ler um código do teclado e  mostrar o nome correspondente, de acordo com a lista : 
      221 Bernardo 
      211 Eustáquio 
      311 Luiz 
      312 Mário 
      332 Artur
  */

  int codigo;

  printf("Olá! Digite um número: ");
  scanf("%i", &codigo);

  switch (codigo)
  {
    case 221:
      printf("Bernardo");
      break;
    case 211:
      printf("Eustáquio");
      break;
    case 311:
      printf("Luiz");
      break;
    case 312:
      printf("Mário");
    break;
    case 332:
    printf("Eustáquio");
    break;
    default:
      printf("ERRO\nTente novamente");
      break;
  }

  return 0;

}

exercicio9()
{
  //Números palíndromos são aqueles que escritos da direita para esquerda ou da esquerda para direita tem o mesmo valor. Exemplo:929, 44, 97379. Fazer um algoritmo que dado um numero de 5 dígitos; calcule e escreva se este e ou não palíndromo.

  int main()
  {
    int numero1, numero2, numero3, numero4, numero5, numero, A, inverter;

    scanf("%d",&numero);

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
      printf("Este número é palíndromo\n");
    }

    else 
    {
      printf("Este número não é palíndromo\n");
    }

    return 0;
  }
  
}

exercicio10()
{
  /* 
    Desenvolver um algoritmo para calcular a conta de água para a SANEAGO. O custo da água varia dependendo do tipo do consumidor residencial, comercial ou industrial. A regra para calcular a conta é:
      • Residencial: R$ 75,00 de taxa mais R$ 3,50 por m3 gastos;
      • Comercial: R$ 500,00 para os primeiros 80 m3 gastos mais R$ 5,50 por m3gastos acima dos 80 m3;
      • Industrial: R$ 800,00 para os primeiros 100 m3 gastos mas R$ 8,00 por m3 gastos acima dos 100 m3;
      O algoritmo devera ler a conta do cliente, seu tipo (residencial, comercial e industrial) e o seu consumo de água em metros cubos. Como resultado imprimir o valor a ser pago pelo mesmo.
  */

  char consumidor[10];
  double taxa, custo, gasto;


  printf("Conta de Água SENEAGO\nTipo de Consumidor (residencial, comercial ou industrial): ");
  scanf("%s", &consumidor);

  if (consumidor == "residencial")
  {
    printf("Gastos em m³: ");
    scanf("%d", &gasto);
    
    taxa = 75.00;

    custo = taxa + (gasto*3.5);

    printf("Valor a ser pago: R$%d", custo);  
  }
  else if (consumidor == "comercial")
  {
    printf("Gastos em m³: ");
    scanf("%d", &gasto);

    taxa = 500.00;

    if (gasto > 80)
    {
      custo = taxa + ((gasto-80)*5.5);
    } 
    else
    {
     custo = taxa; 
    }
    
    printf("Valor a ser pago: R$%d", custo);  
  }
  else if (consumidor == "industrial")
  {
    printf("Gastos em m³: ");
    scanf("%d", &gasto);

    taxa = 800.00;

    if (gasto > 100)
    {
      custo = taxa + ((gasto-100)*8);
    } 
    else
    {
     custo = taxa; 
    }
    
    printf("Valor a ser pago: R$%d", custo);  
  }
}



