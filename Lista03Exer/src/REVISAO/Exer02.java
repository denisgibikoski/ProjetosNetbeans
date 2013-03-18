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
public class Exer02 {
    public static void main(String[] args) {
       Scanner ler = new Scanner(System.in);
        
        int a, b, c ,d;
        int ab, ac, ad, bc, bd, cd;
        int AB, AC, AD, BC, BD, CD;
        System.out.println("Digite 4 numeros");
        a = ler.nextInt();
        b = ler.nextInt();
        c = ler.nextInt();
        d = ler.nextInt();
        
        System.out.println("Resoltado das Somas");
        ab = a+b;
        ac = a+c;
        ad = a+d;
        bc = b+c;
        bd = b+d;
        cd = c+d;
        
        System.out.println("RESULTADO"+ab+","+ac+","+ad+","+bc+","+bc+","+bd
                +","+cd);
        
        System.out.println("Resoltado das multiplicação");
        AB = a*b;
        AC = a*c;
        AD = a*d;
        BC = b*c;
        BD = b*d;
        CD = c*d;
        System.out.println("RESULTADO"+AB+","+AC+","+AD+","+BC+","+BC+","+BD
                +","+CD);
    }
}
