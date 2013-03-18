/* 
 * Implemente um código que possua um ArrayList e insira 200 Strings nesta lista.
 * Mostre os valores cadastrados.
 */
package Lis.exer.Colecao.java;

import java.util.ArrayList;
import java.util.List;

public class java02 {

    public static void main(String[] args) {

      ArrayList numero  = new ArrayList();
        for (int i = 0; i < 200; i++) {
            numero.add("*\n"+i);

            
        }

        for (int i = 0; i < 200; i++) {
             System.out.println(numero.get(i));
        }
 




    }
}
