opcao = int(input('Olá!\nDigite a operação desejada: 1 Soma  2 Subtração  3 Multiplicação  4 Divisão '))

while i<999:
 if opcao==1:
    num1 = float(input('Digite o primeiro número: '))
    num2 = float(input('Digite o segundo número: '))
    resultado=num1+num2
    print("O resultado é", resultado, ".")

  elif opcao==2:
    num1 = float(input('Digite o primeiro número: '))
    num2 = float(input('Digite o segundo número: '))
    resultado=num1-num2
    print("O resultado é", resultado, ".")

  elif opcao==3:
    num1 = float(input('Digite o primeiro número: '))
    num2 = float(input('Digite o segundo número: '))
    resultado=num1*num2
    print("O resultado é", resultado, ".")

  elif opcao==4:
    num1 = float(input('Digite o primeiro número: '))
    num2 = float(input('Digite o segundo número: '))
    resultado=num1/num2
    print("O resultado é", resultado, ".")

  else:
    print("Erro. Tente Novamente.")
 
resposta = int(input('Deseja repetir? 1 Sim 2 Não'))
  if resposta==1:

  else:
    i=999
    print('Obrigada! Até a próxima!')