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
public class Exer04 {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("entre com um numero");
        double a = ler.nextDouble();
        
        double qua = Math.pow(a,2);
       double cubo = Math.pow(a, 3);
       
        System.out.println("O resultado quadrado "+qua+"  O resultado cubo "+cubo);
        
    }
    
}
