//Utilizando função passando N como parâmetro e retornando o valor de S

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

double valorS(int);
int n = 0, i, denominador[n], numerador[n];

int main()
{
    setlocale(LC_ALL, "Portuguese");

    printf("MODULARIZAÇÃO\n");
    printf("Quantidade de termos: ");
    scanf("%d", &n);

    double soma = valorS(n);
    
    return 0;
}

double valorS(int n)
{
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
            s += (double)-((numerador[i]) / (denominador[i]));
        }
        else
        {
            s += (double)(numerador[i]) / (denominador[i]);
        }
    }
}
