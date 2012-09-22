/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questoes;

import java.util.Scanner;

/**
 *
 * @author D3nys
 */
public class Ava01 {
      
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
       
            
        
        System.out.println("Digite um numero para dia da Semana de 1 a 7");
        int dia = ler.nextInt();
    
            switch (dia) {
                case 1:
                    System.out.println("segunda-feira");
                    break;
                case 2: 
                    System.out.println("Terca-feira");
                   break;
                case 3:
                    System.out.println("Quarta-feira");
                    break;
                case 4: 
                    System.out.println("Quinta-feira");
                   break;    
                case 5:
                    System.out.println("Sexta-feira");
                    break;
                case 6: 
                    System.out.println("Sabado");
                case 7: 
                    System.out.println("Donigo");
                   break;       
            }
            
            System.out.println("Deseja Continuar 1 par sim 0 para nao");
          
        
   
            
        
        
    }
    
}
