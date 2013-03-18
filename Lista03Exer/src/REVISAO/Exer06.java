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
public class Exer06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Entre com dois numeros");
        int a = ler.nextInt();
        int b = ler.nextInt();
        
        double A = Math.pow(a, 2);
        double B = Math.pow(b, 2);
        
        double soma = A+B;
        
        System.out.println("A soma dos numeros quadrado e "+soma);
        
    }
    
}
