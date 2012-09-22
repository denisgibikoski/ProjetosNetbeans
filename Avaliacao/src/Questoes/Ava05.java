/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questoes;

import java.util.Scanner;

public class Ava05 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        int resto = 0;
        System.out.println("entre com um numero");
        numero = ler.nextInt();
        int elemesmo = 0;
        int contador = 0;
        while (numero >= elemesmo) {
            ++elemesmo;
             resto = numero % elemesmo;
            }
 
        
     if (resto == 0 ){
            
         contador++;
     }
     
     if ( contador <= 2){
         System.out.println("O numero "+numero+"  é primo");
     }
     else
     {
         System.out.println("Numero "+numero+"  não é primo");
     }
        
       
        
        
        
        
    }
    
    
    
}
