/*
    Faça um método que receba como parâmetro um vetor “a” com cinco números reais 
    e promova a ordenação crescente desses números. O programa principal deverá imprimir o vetor ordenado.
 */
package lista07_Vetores;

import java.util.Arrays;

public class Ex006 {
    public void ordenarVetor (double []a){
        Arrays.sort(a);
    }
    
    public static void main(String[] args) {
        
        
        
        System.out.print(ordenarVetor());
    }
    
    
}
