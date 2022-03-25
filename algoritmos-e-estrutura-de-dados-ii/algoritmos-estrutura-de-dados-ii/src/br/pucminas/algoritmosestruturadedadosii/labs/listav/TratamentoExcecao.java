import java.text.DecimalFormatSymbols;

//Para testar deixe apenas uma public class ativa

public class TratamentoExcecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(args[0]);
		MyIO.println("A variável i vale " + i);
		MyIO.println("FIM DE PROGRAMA!!!");
	}
}

/*
//public class TratamentoExcecao02 {
public class TratamentoExcecao {
	public static void main(String[] args) {
		try {
			Integer i = new Integer(args[0]);
			MyIO.println("A variável i vale " + i);
		} catch (ArrayIndexOutOfBoundsException e) {
			MyIO.println("Erro na passagem de parÃ¢metros!!!");
		} finally {
			MyIO.println("FIM DE PROGRAMA!!!");
		}
	}
}
*/
/*
public class TratamentoExcecao {	
//public class TratamentoExcecao03 {
		public static void main(String[] args) {
			try {
				Integer i = new Integer(args[0]);
				MyIO.println("A variÃ¡vel i vale " + i);
			} catch (NumberFormatException e) {
				MyIO.println("Erro de formataÃ§Ã£o!!! ");
			} catch (ArrayIndexOutOfBoundsException e){
				MyIO.println("Erro na passagem de parÃ¢metros!!!");
			} finally {
				MyIO.println("FIM DE PROGRAMA!!!");
			}
		}
	}
*/
/*
public class TratamentoExcecao {
  public static void main(String args[])
  {
    String str = null;
    //str = frase.toUpperCase();//comente essa linha para fazer o tratamento da excessao
    MyIO.println("String original: "+ str);
  
	  try
	  {
		  str = str.toUpperCase();
	  }
	  catch(NullPointerException e) //CAPTURA DA POSSÃ�VEL exceÃ§Ã£o.
	  {
	    //Tratamento da exceÃ§Ã£o
	    MyIO.println("A variavel str estava nula, para solucionar o problema, foi lhe atribuito um novo valor.");
	    str = "String com valor valido";
	  }
	  //retire os comentarios das linhas e teste
	  //finally {
	  //str = str.toUpperCase();		
	  //}
	  MyIO.println("Frase antiga: "+ str);
  }
}
*/
/*
//public class TratamentoExcecao04 {
public class TratamentoExcecao {
	
		public static void m1(String s) throws NumberFormatException, ArrayIndexOutOfBoundsException {
			Integer i = new Integer(s);  
			MyIO.println("A variÃ¡vel i vale " + i);
		}
		public static void m2(String s) throws NumberFormatException {
			Integer i = new Integer(s);
			//Integer i = 0; //new  Integer("0,32");
			MyIO.println("A variÃ¡vel i vale " + i);
		}
		
		public static void main(String[] args) {
			try { m1(args[0]); } 
			catch (NumberFormatException e) { 			MyIO.println("Erro1: "+ e.getMessage()); } 
			catch (ArrayIndexOutOfBoundsException e){	MyIO.println("Erro2:"+ e.getMessage()); }
			
			MyIO.println("--- >>>>>    <<<<< -----");
				        
			//try {  m2(args[0]); } 
			try {  m2("null"); } //teste com essa parte do cÃ³digo
			catch (NumberFormatException e) { MyIO.println("Erro3: e.getMessage()"); }
			
			MyIO.println("--- >>>>>    <<<<< -----");
		}
}
*/

/*
public class TratamentoExcecao {
//public class TratamentoExcecao05 {
	public static void metodo(int i)  throws  Exception {
		if (i % 2 == 1){
			throw new Exception ("Valor impar");
			//MyIO.println("Valor ímpar");
		}
	}
	
	public static void main(String[] args) throws  Exception {
		int i = 2;
		MyIO.println("-------------->>>>>>>>    <<<<<<<<--------------");
		metodo(i);
		MyIO.println("-------------->>>>>>>>    <<<<<<<<--------------");
		i++;
		try {
			metodo(i); //uma excecao foi lancada em metodo e tratada aqui.
		}
		catch (Exception e) {
			MyIO.println("Erro: " + e.getMessage());
		}
		MyIO.println("-------------->>>>>>>>    <<<<<<<<--------------");
	}
}
*/