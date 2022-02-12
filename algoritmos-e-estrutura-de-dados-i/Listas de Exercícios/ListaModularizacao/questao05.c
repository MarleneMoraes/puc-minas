//Utilizando função retornando S e a variável global N
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Variáveis globais
int n = 0;

double valorTermo();

int main()
{
    setlocale(LC_ALL, "Portuguese");

    double soma = valorTermo();

    printf("Resultado da série %.2f", soma);

    return 0;
}

double valorTermo()
{
    double s;

    printf("MODULARIZAÇÃO\n");
    printf("Quantidade de termos: ");
    scanf("%d", &n);

    int i, denominador[n],
        numerador[n];

    for (i = 0; i < n; i++)
    {

        //numerador
        if (i == 0 || i == 1)
        {
            numerador[i] = 1;
        }
        else
        {
            numerador[i] = (numerador[i - 2] + numerador[i - 1]);
        }

        //denominador
        denominador[i] = 2 * (i + 1);

        //Definição do termo
        if (i % 2 == 0 && i != 0)
        {
            return s += (double)-((numerador[i]) / (denominador[i]));
        }
        else
        {
            return s += (double)(numerador[i]) / (denominador[i]);
        }
    }
}