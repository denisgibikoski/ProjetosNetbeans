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
public class Ava04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double raio, volume,area;
        System.out.println("entre como raio da esfera");
        raio= ler.nextDouble();
        volume= (float)4/3*Math.PI*Math.pow(raio, 3);
        area = 4 * Math.PI*Math.pow(raio, 2);
        
        System.out.println("O valor do Volume e:  "+volume+"\nE da Area :  "+area);
        
    }
    
}
