#include <stdio.h>

int main(void) {
  int opcao=0, i, resposta;
  float num1, num2, resultado;
  
  for (i=0; i<999;i++) {   
    printf("Olá!\nDigite a operação desejada: 1 Soma  2 Subtração  3 Multiplicação  4 Divisão\n");
    scanf("%d", &opcao);

    switch (opcao) {
      case 1:printf("Digite o primeiro número: ");
        scanf("%f", &num1);
        printf("Digite o segundo número: ");
        scanf("%f", &num2);
        resultado=num1+num2; 
        printf("O resultado é %.2f.", resultado); break;

      case 2: printf("Digite o primeiro número: ");
        scanf("%f", &num1);
        printf("Digite o segundo número: ");
        scanf("%f", &num2);
        resultado=num1-num2; 
        printf("O resultado é %.2f.", resultado); break;
   
      case 3: printf("Digite o primeiro número: ");
        scanf("%f", &num1);
        printf("Digite o segundo número: ");
        scanf("%f", &num2);
        resultado=num1*num2;
        printf("O resultado é %.2f.", resultado); break;
    
      case 4: printf("Digite o primeiro número: ");
        scanf("%f", &num1);
        printf("Digite o segundo número: ");
        scanf("%f", &num2);
       resultado=num1/num2;
       printf("O resultado é %.2f.", resultado); break;
      
      default: printf ("Erro. Tente Novamente.");break;
    }
    
    printf("Deseja repetir? 1 Sim 2 Não");
    	 scanf("%d", &resposta);
    	
    	if (resposta==1) {
    		i++;
    	}else {
    		i=999;
        printf("Obrigada! Até a próxima!");
    	}
  
  }
  return 0;
}