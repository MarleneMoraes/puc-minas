#include <iostream>
using namespace std;
	
int main() 
{
  int opcao=0, resposta;
  float num1, num2, resultado;

  for (int i=0;i<999;i++) 
  {
    cout << "Olá!\nDigite a operação desejada: 1 Soma  2 Subtração  3 Multiplicação  4 Divisão\n";
    cin >> opcao;
    
    switch (opcao) 
    {
      case 1: 
        cout << "Digite o primeiro número: ";
        cin >> num1;
        
        cout << "Digite o segundo número: ";
        cin >> num2;
        
        resultado=num1+num2;
        
        cout << "O resultado é " << resultado << "."; 
        break;
      
      case 2: 
        cout << "Digite o primeiro número: ";
        cin >> num1;
        
        cout << "Digite o segundo número: ";
        cin >> num2;
        
        resultado=num1-num2; 
        
        cout << "O resultado é " << resultado << "."; 
        break;
      
      case 3: 
        cout << "Digite o primeiro número: ";
        cin >> num1;
        
        cout << "Digite o segundo número: ";
        cin >> num2;
        
        resultado=num1*num2;
        
        cout << "O resultado é " << resultado << "."; 
        break;
      
      case 4: 
        cout << "Digite o primeiro número: ";
        cin >> num1;
        
        cout << "Digite o segundo número: ";
        cin >> num2;
        
        resultado=num1/num2;
        
        cout << "O resultado é " << resultado << "."; 
        break;
      
      default: 
        cout << "Erro. Tente Novamente.";
        break;
    }
    
    cout << "Deseja repetir? 1 Sim 2 Não\n";
    cin >> resposta;

    if (resposta==1) 
    {
      i++;
    }
    else 
    {
      i=999;
      cout << "Obrigada! Até a próxima!";
    }
	
	}
	return 0;
}
