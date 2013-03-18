/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2DeA1;

import java.util.Scanner;

/**
 *
 * @author D3nys
 */
public class Exer05 {
/*Implementar um programa que desenha um triângulo retângulo na tela com a base
voltada para baixo. Chame a classe em questão de Triangulo1.java. Defina no método
main uma variável inteira chamada base e atribua a ela um valor, digamos 4.
Para o valor de base igual a 4, a saída do programa deverá ser:
*
**
***
****
*/
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Programa para desenhar um retangulo na tela");
        System.out.println("Informe que a base que o triangulo deve ter");
        int base = ler.nextInt();
        int i;
        
        String sina="*";
        for (i = 0; i<base;i++){
          System.out.println(sina); 
           sina = sina + "*" ; 
        }     
        
    }
}
