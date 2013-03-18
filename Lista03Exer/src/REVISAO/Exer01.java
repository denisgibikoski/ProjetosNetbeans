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
public class Exer01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int a , b ,aux;
        System.out.println("Digite um  valor para volor 1");
        a = ler.nextInt();
        
        System.out.println("Digite um  valor para volor 2");
        b = ler.nextInt();
        
        //troca de valores
        
        aux = b;
        b = a;
        a=aux;
        
        System.out.println("TROCADO VALOR : valor A e"+a+" \tO valor de B e "+b);
        
    }
    
}
