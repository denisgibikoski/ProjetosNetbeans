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
public class Exer03 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double comprimento, largura , altura;
        
        System.out.println("Calcu;lar Volume de caixa retangular");
        System.out.println("Entre com comprimento");
        comprimento = ler.nextDouble();
        System.out.println("Entre com Largura");
        largura = ler.nextDouble();
        System.out.println("Entre com Altura");
        altura = ler.nextDouble();
        
        double volume = comprimento * altura * largura;
        
        System.out.println("O volume da caixa e de "+volume);
    
    }
    
}
