/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2DeA1;

import java.util.Scanner;

/**
 *
 * @author D3nys
 */
public class Exer01 {
    public static void main(String[] args) {
/* Faça uma classe em Java que dados os limites de um intervalo [a; b]
 * , informe a somatodos os números neste intervalo. 
 * Exemplo: [4, 7] => 4+5+6+7=22   
 */
    Scanner ler = new Scanner(System.in);
    
    int n1, n2,soma=0,aux,temp;
    
        System.out.println("Entre com dois numeros.\nPara saber a soma entre eles");
        System.out.println("Entre com o Primeiro numero");
        n1 = ler.nextInt();
        System.out.println("Entre com o segundo numero");
        n2 = ler.nextInt();
        
      if ( n1 > n2){
            aux = n1;
            n1 = n2;
            n2 = aux;
            }
        int i;
        
          for (i = n1;i<=n2;i++){
              soma = soma + i;
             
          } 
          System.out.println("Mostar a soma dos elementos"+soma);
            
        
        
        
        
    
               
    
    
    
    
    
    }
}
