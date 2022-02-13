using System;

class Program {
  public static void Main (string[] args) {
    int opcao=0, resposta;
    float num1, num2, resultado;

    for (int i=0;i<999;i++) {
      Console.Write("Olá!\nDigite a operação desejada: 1 Soma  2 Subtração  3 Multiplicação  4 Divisão\n");
      opcao=int.Parse(Console.ReadLine());
      
      switch (opcao) {
      case 1:Console.Write("Digite o primeiro número: ");
        num1=float.Parse(Console.ReadLine());
        Console.Write("Digite o segundo número: ");
        num2=float.Parse(Console.ReadLine());
        resultado=num1+num2; 
        Console.WriteLine("O resultado é " +resultado+"."); break;
        
      case 2: Console.Write("Digite o primeiro número: ");
        num1=float.Parse(Console.ReadLine());
        Console.Write("Digite o segundo número: ");
        num2=float.Parse(Console.ReadLine());
        resultado=num1-num2; 
        Console.WriteLine("O resultado é " +resultado+"."); break;

      case 3: Console.Write("Digite o primeiro número: ");
        num1=float.Parse(Console.ReadLine());
        Console.Write("Digite o segundo número: ");
        num2=float.Parse(Console.ReadLine());
        resultado=num1*num2;
        Console.WriteLine("O resultado é " +resultado+"."); break;
    
      case 4: Console.Write("Digite o primeiro número: ");
        num1=float.Parse(Console.ReadLine());
        Console.Write("Digite o segundo número: ");
        num2=float.Parse(Console.ReadLine());
        resultado=num1/num2;
        Console.WriteLine("O resultado é " +resultado+"."); break;
      
      default: Console.WriteLine("Erro. Tente Novamente.");break;
    }

    Console.WriteLine("Deseja repetir? 1 Sim 2 Não");
    resposta=int.Parse(Console.ReadLine());
      
      if (resposta==1) {
        i++;
      } else {
        i=999;
        Console.WriteLine("Obrigada! Até a próxima!");
      }
    }
  }  
}