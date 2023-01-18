import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int opcao=0, resposta;
        float num1, num2, resultado;

        Scanner sc = new Scanner (System.in);

    
        for (int i=0;i<999;i++) {
            System.out.print("Olá!\nDigite a operação desejada: 1 Soma 2 Subtração 3 Multiplicação 4 Divisão\n");
            opcao=sc.nextInt();
            
            switch (opcao) {
            case 1:System.out.print("Digite o primeiro número: ");
                num1=sc.nextFloat();
                System.out.print("Digite o segundo número: ");
                num2=sc.nextFloat();
                resultado=num1+num2; 
                System.out.println("O resultado é " +resultado+"."); break;
              
            case 2: System.out.print("Digite o primeiro número: ");
                num1=sc.nextFloat();
                System.out.print("Digite o segundo número: ");
                num2=sc.nextFloat();
                resultado=num1-num2; 
                System.out.println("O resultado é " +resultado+"."); break;
      
            case 3: System.out.print("Digite o primeiro número: ");
              num1=sc.nextFloat();
              System.out.print("Digite o segundo número: ");
              num2=sc.nextFloat();
              resultado=num1*num2;
              System.out.println("O resultado é " +resultado+"."); break;
          
            case 4: System.out.print("Digite o primeiro número: ");
              num1=sc.nextFloat();
              System.out.print("Digite o segundo número: ");
              num2=sc.nextFloat();
             resultado=num1/num2;
             System.out.println("O resultado é " +resultado+"."); break;
            
            default: System.out.println("Erro. Tente Novamente.");break;
          }
        
        System.out.println("Deseja repetir? 1 Sim 2 Não");
            resposta=sc.nextInt();
              
              if (resposta==1) {
                  i++;
              } else {
                  i=999;
              System.out.println("Obrigada! Até a próxima!");
              }



        }
    }
}