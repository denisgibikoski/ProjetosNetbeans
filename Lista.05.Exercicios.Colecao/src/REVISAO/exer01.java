package REVISAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * 1) Adicione a sequência de números 2, 5, 3, 9, 2, 4, 3, 8, 5 a um conjunto
 * (Set) e a uma lista (List), escolhendo a implementação que desejar. Em
 * seguida imprima o conteúdo de ambas as coleções usando um iterator e analise
 * as diferenças.
 *
 * @author D3nys
 */
public class exer01 {

    public static void main(String[] args) {
         //Exemplo de List : ELE so mostar
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("\tExemplo de ArrayList\n");
        numeros.add(2);
        numeros.add(5);
        numeros.add(3);
        numeros.add(9);
        numeros.add(2);
        numeros.add(4);
        numeros.add(3);
        numeros.add(8);
        numeros.add(5);
         Iterator its = numeros.iterator();
        while(its.hasNext()) {
            System.out.println("Numeros: " + its.next() );
        }
        System.out.println("\n"); 
              
// Exemplo de set : Nao Mostar os repitido, e ordena mostra um de cada.
       Set<Integer> numero = new TreeSet();
        System.out.println("\tExemplo Set\n");
        numero.add(2);
        numero.add(5);
        numero.add(3);
        numero.add(9);
        numero.add(2);
        numero.add(4);
        numero.add(3);
        numero.add(8);
        numero.add(5);
          Iterator it = numero.iterator();
          
          
        while(it.hasNext()) {
           
            System.out.println("Numeros: " + it.next() );
        
        
        }
        
        System.out.println("\n"); 
       

    }
}
