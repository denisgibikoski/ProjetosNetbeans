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
        int numDivisores = 0;
        System.out.println("entre com um numero");
        numero = ler.nextInt();
       if ( numero == 2){
           System.out.println("É primo");
       }else if (numero == 1 || numero %2 == 0){
           System.out.println("Nao é  Primo");
       }else{
           int cont=0;
           for (int i = 1; i < numero; i++) {
               if( numero % i == 0){
                   cont++;
               }
               if(cont == 2 ){
                   System.out.println("É Primo");                  
               }else{
                   System.out.println("Não é Primo");
               }
               
               
           }
           
       }
       
        
    }
    
    
    
}
