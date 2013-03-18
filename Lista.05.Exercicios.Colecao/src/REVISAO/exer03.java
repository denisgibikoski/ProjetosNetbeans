package REVISAO;

import java.util.Scanner;

/**
 * 3) Escreva um programa na linguagem Java que solicite que o usuário entre com
 * uma frase qualquer. Seu programa deverá imprimir a frase digitada pelo
 * usuário, na ordem inversa à da digitação, ou seja, de trás para frente.
 *
 * @author D3nys
 */
public class exer03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String frase;
        System.out.println("Entre com uma Frase ");
        frase = ler.nextLine();
//jeito mais facil
        StringBuffer sb = new StringBuffer(frase);
         sb.reverse();
         System.out.println(sb);

// jeito mais dificil
     
        for (int i = frase.length()-1; i >= 0; i--) {
      
            System.out.print(frase.charAt(i));  
        }
                
    
    }
}
