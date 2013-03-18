/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package REVISAO;

import java.util.Scanner;

/**
 *
 * @author D3nys
 */
public class Exer05 {
    
    public static void main(String[] args) {
        
       Scanner ler = new Scanner(System.in);
       
       
        System.out.println("Digite dois numeros");
        int a = ler.nextInt();
        int b = ler.nextInt();
        
        int soma = a + b;
        
        double qua = Math.pow(soma, 2);
        
        System.out.println(" O valor Quadrado e "+qua);
        
        
    }
       
    
    
}
