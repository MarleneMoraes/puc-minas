#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <ctype.h> //biblioteca para ler letras maiúsculas

int main(void)
{
  setlocale(LC_ALL, "Portuguese");

  exercicio4a();

  exercicio4b();

  exercicio4c();

  exercicio4d();

  exercicio4e();

  exercicio4f();

  exercicio4g();

  exercicio4h();

  exercicio4i();

  exercicio4j();

  exercicio501();

  exercicio502();

  exercicio503();

  exercicio504();

  exercicio505();

  exercicio506();

  exercicio507();

  exercicio508();

  exercicio509();

  exercicio510();

  exercicio511();

  exercicio512();

  exercicio513();

  exercicio514();

  exercicio515();
}

exercicio4a()
{
  //Leia um número e imprima seu sucessor.

  int num;
  printf("Qual o sucessor?\n");
  printf("Olá, digite um número para descobrir o seu sucessor: ");

  scanf("%i", &num);

  num++; //incremento
  printf("O sucessor é %i\n\n", num);
  return 0;
}

exercicio4b()
{
  // Calcule a média aritmética de quatro números inteiros dados

  int num1, num2, num3, num4;
  float media;

  printf("Média aritmética\n");
  printf("Olá, digite o primeiro número para calcular a média: ");
  scanf("%i", &num1);

  printf("Agora, digite o segundo número: ");
  scanf("%i", &num2);

  printf("Agora, digite o terceiro número: ");
  scanf("%i", &num3);

  printf("Por fim, digite o quarto número: ");
  scanf("%i", &num4);

  media = (num1 + num2 + num3 + num4) / 4;

  printf("A média aritmética é %.2f \n\n", media);
  return 0;
}

exercicio4c()
{
  // Faça um algoritmo que receba 3 (três) notas e seus respectivos pesos, calcule e mostre a média ponderada dessas notas.

  int num1, num2, num3, peso1, peso2, peso3;
  float media;

  printf("Média ponderada\n");
  printf("Olá, digite o primeiro número para calcular a média: ");
  scanf("%i", &num1);

  printf("Qual o peso desta nota? ");
  scanf("%i", &peso1);

  printf("Agora, digite o segundo número: ");
  scanf("%i", &num2);

  printf("Qual o peso desta nota? ");
  scanf("%i", &peso2);

  printf("Agora, digite o terceiro número: ");
  scanf("%i", &num3);

  printf("Qual o peso desta nota? ");
  scanf("%i", &peso3);

  media = (num1 + num2 + num3) / (peso1 + peso2 + peso3);

  printf("A média ponderada é %.2f \n\n", media);
  return 0;
}

exercicio4d()
{
  /*
    Leia uma temperatura dada na escala Celsius (C) e imprima o equivalente em Fahrenheit (F).
    Fórmula de conversão: F = 9/5*C +32
    Implemente uma alteração neste exercício para verificar o resultado.
  */

  float f, c;

  printf("Calculadora de Temperatura\n");
  printf("Olá, digite a temperatura em Celsius (ºC) para calcular o Fahrenheit (ºF): ");
  scanf("%f", &c);

  f = ((9 * c) / 5) + 32;

  printf("Temperatura em Celsius: %.2f\n", c);
  printf("Temperatura em Fahrenheit: %.2f\n\n", f);

  return 0;
}

exercicio4e()
{
  // Faça um algoritmo que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o novo salário.

  float salario, percentual, novoSalario;

  printf("Calculadora do promovido\nDigite o seu salário atual: ");
  scanf("%f", &salario);

  printf("Digite o percentual de aumento: ");
  scanf("%f", &percentual);

  if (salario < 0 && percentual < 0)
  {
    printf("Não é possível calcular o novo salário com um número negativo.");
  }
  else
  {
    novoSalario = salario + (salario * (percentual / 100));
    printf("O seu novo salário será de %.2f.\n\n", novoSalario);
  }

  return 0;
}

exercicio4f()
{
  // Faça um algoritmo que peça ao usuário a base e a altura e calcule a área de um triângulo.

  float b, h, area;

  printf("Área do Triângulo\nDigite a base do triângulo: ");
  scanf("%f", &b);

  printf("Digite a altura do triângulo: ");
  scanf("%f", &h);

  if (b < 0 && h < 0)
  {
    printf("Não é possível calcular a área do triângulo com um número negativo.");
  }
  else
  {
    area = (b * h) / 2;
    printf("A área do triângulo é %.2f.\n\n", area);
  }

  return 0;
}

exercicio4g()
{
  // Pedro comprou um saco de Ração com peso em quilos. Pedro possui 2 (dois) gatos para os quais fornece a quantidade de ração em gramas. Faça um algoritmo que receba o peso do Saco de ração e a quantidade de ração fornecida para cada gato. Calcule e mostre quanto restará de ração no saco após 5 (cinco) dias.

  float racao, racaoEmGramas, racaoGato, sobra, sobraEmKg;

  printf("Ração dos felinos\nDigite o peso em kg do saco de Ração: ");
  scanf("%f", &racao);

  racaoEmGramas = racao * 1000; //1 quilo = 1000 gramas

  printf("Digite a quantidade fornecida de Ração para o seu gato (em g): ");
  scanf("%f", &racaoGato);

  racaoGato *= (2 * 5); //quantidade de ração fornecida para 2 gatos em 5 dias

  sobra = racaoEmGramas - racaoGato;

  racao = sobra / 1000; //transformar em kg para a resposta

  printf("Restará %.2f kg de Ração após 5 dias.\n\n", racao);

  return 0;
}

exercicio4h()
{
  //Ler dois números inteiros para as variáveis a e b. Trocar o valor de b com o de a, e imprimi-los.

  int a, b, c;

  printf("Trocando Valores de Variáveis\n");
  printf("Digite o valor do primeiro número: ");
  scanf("%i", &a);

  printf("Digite o valor do segundo número: ");
  scanf("%i", &b);

  c = a; //Variável de armazenamento temporário para a troca ser realizada

  printf("a = %i\nb = %i\n\n", a, b);

  a = b;
  b = c;

  printf("a = %i\nb = %i\n\n", a, b);

  return 0;
}

exercicio4i()
{
  //Leia um número e imprima o resto da divisão por 7. Utilize o comando resto (a,b) na linguagem C (a%b).

  int num, resto;

  printf("Resto da divisão por 7\n");
  printf("Digite um número: ");
  scanf("%i", &num);

  resto = num % 7;

  printf("O resto da divisão por 7 é %i\n\n", resto);
  return 0;
}

exercicio4j()
{
  /* 
    Calcular a soma dos termos de uma P.A. lendo os valores do primeiro termo, do segundo termo e do número de termos. 
    Fórmulas: Sn=n*(a1+an)/2, onde Sn é a soma dos termos, a1 o primeiro termo e an o último termo. 
    O n-ésimo termo de uma progressão aritmética, pode ser obtido por meio da formula: an =a1+(n 1).r, onde r é a razão da P.A.
  */

  int a1, a2, an, n, r, sn;

  printf("Cálculo de soma dos termos de uma P.A.\n");
  printf("Digite o primeiro termo: ");
  scanf("%i", &a1);

  printf("Digite o segundo termo: ");
  scanf("%i", &a2);

  //Fórmula para descobrir a razão
  r = a2 - a1;

  printf("Digite o valor do número de termos: ");
  scanf("%i", &n);

  //Fórmula para descobrir o enésimo termo
  an = a1 + ((n - 1) * r);

  //Fórmula da Soma da P.A.
  sn = (n * (a1 + an)) / 2;

  printf("A soma desta P.A. é %i\n\n", sn);
  return 0;
}

exercicio501()
{
  // Ler um valor inteiro do teclado e dizer se é par
  int numero;

  printf("Este Número é Par?\nOlá! Vamos conferir se o número digitado é par. Digite um número: ");
  scanf("%i", &numero);

  if (numero % 2 == 0)
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio502()
{
  // Ler um valor inteiro do teclado e dizer se é ímpar

  int numero;

  printf("Este Número é Ímpar?\nOlá! Vamos conferir se o número digitado é ímpar. Digite um número: ");
  scanf("%i", &numero);

  if (numero % 2 != 0)
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio503()
{
  // Ler um valor inteiro do teclado e dizer se ímpar e maior que 100

  int numero;

  printf("Este Número é Ímpar?\nOlá! Vamos conferir se o número digitado é ímpar. Digite um número: ");
  scanf("%i", &numero);

  if (numero % 2 != 0 && numero > 100)
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio504()
{
  // Ler um valor inteiro do teclado e dizer se é par e menor que 100, ou ímpar e maior que 100.

  int numero;

  printf("Ímpar Ou Par?\nOlá! Vamos conferir se é par e menor que 100, ou ímpar e maior que 100. Digite um número: ");
  scanf("%i", &numero);

  if (numero % 2 == 0 && numero < 100)
  {
    printf("1\n\n");
  }
  else if (numero % 2 != 0 && numero > 100)
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio505()
{
  // Ler um valor inteiro do teclado e dizer se pertence ao intervalo aberto entre (25:75).
  int numero;

  printf("Pertence Ou Não Pertence?\nOlá! Vamos conferir se o número pertence ao intervalo aberto entre (25:75). Digite um número: ");
  scanf("%i", &numero);

  if (numero > 25 && numero < 75)
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio506()
{
  // Ler um valor inteiro do teclado e dizer se pertence ao intervalo fechado entre [25:75].

  int numero;

  printf("Pertence Ou Não Pertence?\nOlá! Vamos conferir se o número pertence ao intervalo fechado entre [25:75]. Digite um número: ");
  scanf("%i", &numero);

  if (numero >= 25 && numero <= 75)
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio507()
{
  // Ler um valor inteiro do teclado e dizer se pertence aos intervalos fechados [15:45] ou [66:99].

  int numero;

  printf("Pertence Ou Não Pertence?\nOlá! Vamos conferir se o número pertence aos intervalos fechados [15:45] ou [66:99]. Digite um número: ");
  scanf("%i", &numero);

  if ((numero >= 15 && numero <= 45) || (numero >= 66 && numero <= 99))
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio508()
{
  // Ler dois valores inteiros do teclado e dizer se o primeiro é par e o segundo é ímpar.

  int numero1, numero2;

  printf("Par Ou Ímpar?\nOlá! Vamos conferir se o primeiro número é par e o segundo é ímpar. Digite o primeiro número: ");
  scanf("%i", &numero1);

  printf("Agora, o segundo número: ");
  scanf("%i", &numero2);

  if (numero1 % 2 == 0 && numero2 % 2 != 0)
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio509()
{
  // Ler dois valores inteiros do teclado e dizer se o primeiro é par e positivo, e o segundo é ímpar e negativo.

  int numero1, numero2;

  printf("Pertence Ou Não Pertence?\nOlá! Vamos conferir se o primeiro número é par e positivo e o segundo é ímpar e negativo. Digite o primeiro número: ");
  scanf("%i", &numero1);

  printf("Agora, o segundo número: ");
  scanf("%i", &numero2);

  if ((numero1 % 2 == 0 && numero1 > 0) && (numero2 % 2 != 0 && numero2 < 0))
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio510()
{
  // Ler dois valores reais do teclado e dizer se o primeiro é maior, menor ou igual ao segundo.

  int numero1, numero2;

  printf("Maior, Menor ou Igual?\nOlá! Vamos conferir se o primeiro número é maior, menor ou igual ao segundo. Digite o primeiro número: ");
  scanf("%i", &numero1);

  printf("Agora, o segundo número: ");
  scanf("%i", &numero2);

  if (numero1 > numero2)
  {
    printf("O primeiro número é maior.\n\n");
  }
  else if (numero1 < numero2)
  {
    printf("O segundo número é maior.\n\n");
  }
  else
  {
    printf("Os números são iguais.\n\n");
  }
}

exercicio511()
{
  // Ler três valores reais do teclado e dizer se o primeiro está entre os outros dois

  int numero1, numero2, numero3;

  printf("Pertence ou não pertence?\nOlá! Vamos conferir se o primeiro número pertence ao intervalo entre os outros dois. Digite o primeiro número: ");
  scanf("%i", &numero1);

  printf("Agora, o segundo número: ");
  scanf("%i", &numero2);

  printf("E agora, o terceiro número: ");
  scanf("%i", &numero3);

  if ((numero1 >= numero2 && numero1 <= numero3) || (numero1 >= numero3 && numero1 <= numero2))
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio512()
{
  // Ler três valores reais do teclado e dizer se o primeiro não está entre os outros dois

  int numero1, numero2, numero3;

  printf("Pertence ou não pertence?\nOlá! Vamos conferir se o primeiro número pertence ao intervalo entre os outros dois. Digite o primeiro número: ");
  scanf("%i", &numero1);

  printf("Agora, o segundo número: ");
  scanf("%i", &numero2);

  printf("E agora, o terceiro número: ");
  scanf("%i", &numero3);

  if ((numero1 >= numero2 && numero1 <= numero3) || (numero1 >= numero3 && numero1 <= numero2))
  {
    printf("0\n\n");
  }
  else
  {
    printf("1\n\n");
  }
}

exercicio513()
{
  // Ler três valores literais (caracteres) do teclado e dizer se o primeiro está entre os outros dois

  char alfa, beta, gama;

  printf("ABC?\nOlá! Vamos conferir se a primeira letra pertence ao intervalo entre as outras duas. Digite o primeiro caractere: ");
  scanf("%c", &alfa);

  printf("Agora, a segunda letra: ");
  scanf("%c", &beta); // não está lendo a segunda letra!

  printf("E agora, a terceira letra: ");
  scanf("%c", &gama);

  if ((alfa > beta && alfa < gama) || (alfa > gama && alfa < beta))
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio514()
{
  // Ler três valores literais (caracteres) do teclado e dizer se estão em ordem crescente lexicograficamente.

  char alfa, beta, gama;

  printf("ABC?\nOlá! Vamos colocar as letra em ordem crescente lexicograficamente. Digite o primeiro caractere: ");
  scanf("%c", &alfa);

  printf("Agora, a segunda letra: ");
  scanf("%c", &beta); // não está lendo a segunda letra!

  printf("E agora, a terceira letra: ");
  scanf("%c", &gama);

  if ((alfa > beta && alfa < gama) || (alfa > gama && alfa < beta))
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}

exercicio515()
{
  // Ler um valor literal (caractere) do teclado e dizer se é uma letra maiúscula.

  char alfa, alfaUpper;

  printf("ABC?\nOlá! Vamos conferir se é uma letra maiúscula. Digite letra: ");
  scanf("%c", &alfa);

  alfaUpper = toupper(alfa);

  if (alfa == alfaUpper)
  {
    printf("1\n\n");
  }
  else
  {
    printf("0\n\n");
  }
}