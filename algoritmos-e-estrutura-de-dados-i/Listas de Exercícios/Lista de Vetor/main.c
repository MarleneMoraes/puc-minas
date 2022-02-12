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
  }

  exercicio1() {
    #include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void lerVetor();
int fatorial(int n);

int main()
{
  setlocale(LC_ALL, "portuguese");

  int vetorA[15], vetorB[15];

  lerVetor();

  for(int i = 0; i < 15; i++){
    vetorB[i] = fatorial(vetorA[i]);
  }

  for(int i = 0; i < 15; i++){
    printf("%s[%d] = vetorB\n", vetorB, 15);
  }

  return 0;
}

void lerVetor() 
{ 
  for (int i = 0; i < 15; i++)
  {
    printf("Digite o %d termo do vetor: ", i);
    scanf("%d", &vetorA[i]);
  }
}

int fatorial(int n){
  int factor = 1;

  for (int i = 1; i <= 15; i++){
    factor *= i;
  }

  return factor;
}




  }
  exercicio2();
  exercicio3(){
    setlocale(LC_ALL, "portuguese");
  float A[20];
  int tam;

  printf("Invertido\n");
  printf("Número de termos desejado: ");
  scanf("%d", &tam);

  scanearVetor(A,tam);
  inverterVetor(A, tam);
  printf("\nImpressão de A invertido:\n");
  
  imprimirVetor(A,tam,"A");
  return 0;
} 

void scanearVetor (float *v, int tam)
{
  for (int i = 0; i < tam; i++)
    {
      printf("%dº termo do vetor:", (i+1));
      scanf("%f",&v[i]);
    }

}

void imprimirVetor(float *v, int tam, char *nomeVetor)
{
  for (int i = 0; i < tam; i++)
  {
    printf("%s[%d]=%.2f   ",nomeVetor,i,v[i]);
  }
} 

void inverterVetor (float *v, int tam)
{
  float aux;
  int meio = tam/2;
  
  for (int i = 0; i < meio; i++) 
  {
    aux=v[i];
    v[i]=v[tam-i-1];
    v[tam-i-1]=aux;
  }
}

  }
  exercicio4();
  exercicio5();