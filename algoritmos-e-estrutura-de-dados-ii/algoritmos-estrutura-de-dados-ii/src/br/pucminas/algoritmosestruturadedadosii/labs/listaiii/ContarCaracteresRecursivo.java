package br.pucminas.algoritmosestruturadedadosii.labs.listaiii;

 /**
 * Java's Exercices from college
 * 
 * @author MarleneMoraes
 * @date 24 mar 2022
 */

public class ContarCaracteresRecursivo {

	 public static void main(String[] args) {
	        String string;
	        string = MyIO.readString();
	        while (!string.equals("FIM")) {
	            System.out.println(contadorLetrasMaiusculo(string));
	            string = MyIO.readString();
	        }
	    }
	    
	    public static int contadorLetrasMaiusculo(String string) { 
	            if (string.isEmpty()) {
	                return 0; 
	            }
	            
	            return (Character.isUpperCase(string.charAt(0)) ? 1 : 0) + contadorLetrasMaiusculo(string.substring(1)); 
	    }
}


