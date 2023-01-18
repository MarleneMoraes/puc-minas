//Utilizando um procedimento

#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void valorTermo();
int main() {
  setlocale(LC_ALL, "Portuguese");
  
  valorTermo();

  return 0;
}

void valorTermo() {
  int n = 0, i, denominador[n], numerador[n];
  double s;
  
  printf("MODULARIZAÇÃO\n");
  printf("Quantidade de termos: ");
  scanf("%d", &n);

  for (i = 0; i < n; i++){

    //numerador
    if (i==0 || i==1){
      numerador[i] = 1;
    } else {
      numerador[i] = (numerador[i-2] + numerador[i-1]);      
    } 


    //denominador
    denominador[i] = 2 * (i+1);

    //Definição do termo
    if (i % 2 == 0 && i != 0) {
      s+= (double) -((numerador[i])/ (denominador[i]));
    } else {
      s+= (double) (numerador[i])/ (denominador[i]);
    }
  }
  
  printf("Resultado da série %.2f", s);
}
