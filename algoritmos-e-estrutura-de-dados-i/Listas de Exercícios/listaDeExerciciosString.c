#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

/**
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
    Leia um conjunto indeterminado de palavras e ao final (estipule você um flag) informe qual foi a maior palavra e a menor palavra digitada, em tamanho e lexicograficamente
  */

  char string[50], maior[50], menor[50], lexMaior[50], lexMenor[50];
  int lexA, lexB;

  printf("Maior e menor \n");
  printf("Digite uma palavra\n");
  scanf("%s", string);

  strcpy(maior, string);
  strcpy(menor, string);
  strcpy(lexMenor, string);
  strcpy(lexMaior, string);

  while (strcasecmp(string, "parar") != 0)

  {
    if (strlen(string) > strlen(maior))
    {
      strcpy(maior, string);
    }

    if (strlen(string) < strlen(menor))
    {
      strcpy(menor, string);
    }
    if (strcasecmp(string, lexMenor) < 0)
    {
      strcpy(lexMenor, string);
    }
    if (strcasecmp(string, lexMaior) > 0)
    {
      strcpy(lexMaior, string);
    }

    printf("\nDigite Uma palavra\n");
    scanf("%s", string);
  }

  printf("Maior lexicografimente: %s\nMenor lexicograficamente: %s\n", lexMaior, lexMenor);

  printf("Maior palavra: %s\nMenor palavra: %s", maior, menor);
}

exercicio2()
{
  // Ler um string de no máximo 50 caracteres e contar quantas letras A essa palavra possui.
  int i, size, count;
  char string[50];

  count = 0;

  printf("Digite uma palavra: ");
  scanf("%s", string);

  for (i = 0; i < strlen(string); i++)
  {
    if (string[i] == 'a')
    {
      count++;
    }
  }

  printf("Quantidade de 'a' na palavra digitada: %i", count);
}

exercicio3()
{
  //Ler uma string de no máximo 50 caracteres e indicar quais as posições da letra A nessa palavra.

  int i;
  char string[50];

  printf("Digite uma palavra: ");
  scanf("%s", string);

  for (i = 0; i < strlen(string); i++)
  {
    if (i == 0)
    {
      printf("Posição da letra a é");
    }

    if (string[i] == 'a')
    {
      printf(" %d ", i);
    }
  }
}

exercicio4()
{
  //Ler uma string de no máximo 50 caracteres e em seguida um caractere, mostrar quais as posições esse caractere aparece na string lida e quantas vezes ele apareceu.

  int i, length, count;
  char letra;
  char string[50];

  count = 0;

  printf("Digite uma palavra: ");
  scanf("%s", string);

  printf("Digite uma letra: ");
  scanf("%s", &letra);

  for (i = 0; i < strlen(string); i++)
  {
    if (i == 0)
    {
      printf("Posição da letra %c é", letra);
    }

    if (string[i] == letra)
    {
      printf(" %d ", i);
      count++;
    }
  }

  printf("\nA letra %c apareceu %d vezes.", letra, count);
}

exercicio5()
{
  /* 
    Ler uma string de no máximo 50 caracteres e em seguida um caractere (entre A e z -consista se o caracter esta nesse intervalo), mostrar quais as posições esse caractere (maiúscula ou minúscula) na string lida e quantas vezes ele apareceu
  */

  char letra;
  char frase[50];
  int comprimento, contador;

  printf("Digite uma frase: ");

  fgets(frase, 50, stdin);

  comprimento = strlen(frase);

  frase[comprimento - 1] = '\0';

  for (int i = 0; i < comprimento; i++)
  {
    frase[i] = tolower(frase[i]);
  }

  printf("Digite uma letra de A a Z: ");

  scanf("%c", &letra);

  letra = tolower(letra);

  if (letra >= 'a' && letra <= 'z')
  {
    contador = 0;
    for (int i = 0; i < comprimento; i++)
    {
      if (i == 0)
      {
        printf("Posição: ");
      }

      if (frase[i] == letra)
      {
        printf(" %d ", i);

        contador++;
      }
    }

    printf("\nTotal: %d", contador);
  }
  else
  {
    printf("Letras são de a-z ou A-Z");
  }
}

exercicio6()
{
  //Ler uma string de no máximo 50 caracteres e mostrar quantas letras possui e quantos caracteres são números e quantos não são nem números nem letras.

  char string[50];
  int letras, numeros, outros;

  printf("Quantidade de letras, números e outros\n");
  printf("Digite uma frase: ");
  scanf("%s", string);

  for (int i = 0; i < strlen(string); i++)
  {
    string[i] = tolower(string[i]);
    if (string[i] >= 'a' && string[i] <= 'z')
    {
      letras++;
    }
    else
    {
      if (string[i] >= '0' && string[i] <= '9')
      {
        numeros++;
      }
      else
      {
        outros++;
      }
    }
  }

  printf("Letras: %i\nNúmeros: %i\nOutros: %i", nLetras, numeros, especiais);
}

exercicio7()
{
  /* 
    Ler uma string de no máximo 50 caracteres e criar uma nova string com seu inverso, isso é a ultima letra da primeira string será a primeira na nova string e assim sucessivamente.
  */

  char string[50];
  int leng, i;

  printf("Digite uma frase: ");

  scanf("%s", string);

  printf("Frase inversa: ");
  for (i = strlen(string) - 1; i >= 0; i--)
  {
    printf("%c", string[i]);
  }
  return 0;
}

exercicio8()
{
  //Ler uma stringde no máximo 50 caracteres e retire dessa stringtodos os espaços em branco. Utilize uma stringauxiliar.

  char string[50];
  char stringSemEspaco[50];
  int auxiliar, i = 0;

  printf("Retirar os espaços da frase\n");
  printf("Digite uma frase: ");
  scanf("%c", string);

  for (auxiliar = 0; auxiliar < strlen(string); auxiliar++)
  {
    if (string[auxiliar] != ' ')
    {
      stringSemEspaco[i] = string[auxiliar];
      i++;
    }
  }
  stringSemEspaco[i] = '\0';
  printf("%s\n", stringSemEspaco);
  return 0;
}

exercicio9()
{
  //Ler uma stringde no máximo 50 caracteres e retire dessa stringtodos os espaços em branco. Sem utilize string auxiliar.

  char frase[50];
  int length, i, j;

  printf("Retirar os espaços da frase\n");
  printf("Digite uma frase: ");
  scanf("%c", string);

  length = strlen(frase);

  printf("%s\n", frase);

  for (int i = 0, j = 0; i < len; i++, j++)
  {
    if (frase[j] == ' ')
    {
      j++;
      frase[i] = frase[j];
    }
  }
  printf("A frase sem espaços em branco: %s\n", frase);
}

exercicio10()
{
  /*
    Ler uma stringde no máximo 50 caracteres em seguida leia outra string de no máximo 3 caracteres, informe quantas vezes a segunda string aparece na primeira string, e diga as posições iniciais em que ela aparece.
  */

  int count, i, j, k;
  char string[50], trecho[3];
  
  count = 0;
  j = 0;
  
  printf("Digite uma frase: ");
  scanf("%s", string);

  printf("Digite a frase de busca: ");
  scanf("%s", trecho);

  k = strlen(trecho);

  for (i = 0; string[i] != '\0'; i++)
  {
    while (string[i] == string[j])
    {
      j++;
    }

    if (j == k)
    {
      count++;
      j = 0;
    }
  }

  printf("Quantidade de vezes encontrada: %d", count);
}