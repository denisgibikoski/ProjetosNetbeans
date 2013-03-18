
package REVISAO;

import java.util.Collections;
import java.util.Scanner;

/**
 *2) Escreva um programa que solicite que o usuário digite uma frase. Verifique se a
 * string digitada pelo usuário possui a sequência de caracteres “java”. Caso
 * afirmativo emita uma mensagem confirmando que existe a sequência.
 * @author D3nys
 */
public class exer02 {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        String frase;
        System.out.println("Entre com uma Frase ");
        frase = ler.nextLine();
       
       
         if (frase.contains("java") ) {
            System.out.println("java esta na Frase");
        } else {
            System.out.println("java  nao esta na Frase");
        }
        
        
        
    }
    
}
