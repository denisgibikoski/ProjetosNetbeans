
package Lis.exer.Colecao.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *Faça um ArrayList e insira as Strings "String 1", "String 2" e "String 3" cada uma 
 * duas vezes, percorra todos os elementos e imprima (System.out.println()). 
 * Observeo resultado. Quantos elementos têm a coleção?
 * @author D3nys
 */
public class java03 {
    
    public static void main(String[] args) {
        System.out.println("\n\tValor Arraylist");
        ArrayList palavra = new ArrayList();
        
        palavra.add("String 1");
        palavra.add("String 2");
        palavra.add("String 3");
        palavra.add("String 1");
        palavra.add("String 2");
        palavra.add("String 3");
        //exercio 11
        
        //Collections.shuffle(palavra);
        System.out.println(palavra);
        //exercicio13
        Collections.sort(palavra);
        for (int i = 0; i < palavra.size(); i++) {
           // Object object = palavra.get(i);  
            System.out.println(palavra.get(i));
        }
        System.out.println("Tamanho "+palavra.size());
        //exercio12
        int v = Collections.binarySearch(palavra, "String 2");
        System.out.println("v  = "+ v);
        
        
        
        /*4) Faça um HashSet e insira as Strings "String 1", "String 2" e “String 3" cada uma
         * duas vezes, percorra todos os elementos e imprima (System.out.println()). Observe
         * o resultado. Quantos elementos têm a coleção? 
         * 
         */
        System.out.println("\n\tDados Hashset");
        HashSet<String>valores = new HashSet();
        
        valores.add("String 1");
        valores.add("String 2");
        valores.add("String 3");
        valores.add("String 1");
        valores.add("String 2");
        valores.add("String 3");
        
        Iterator<String>it = valores.iterator();
        while(it.hasNext()){
            String valor = it.next();
            System.out.println(valor);
            
        }
        System.out.println("\nTamanho"+valores.size());
        /*5) Faça um HashMap e insira as Strings "String 1", "String 2" e "String 3" cada uma
         * duas vezes, utilize o numeral como chave, percorra todos os elementos e imprima
         * (System.out.println()). Observe o resultado. Quantos elementos têm a coleção?
        */
        
        System.out.println("\nExemplo HashMap");
        
        HashMap<Integer, String>valor2 = new HashMap();
        
        valor2.put(1, "String 1");
        valor2.put(2, "String 2");
        valor2.put(3, "String 3");
        valor2.put(1, "String 1");
        valor2.put(2, "String 2");
        valor2.put(3, "String 3");
        
        for (int i = 0; i < valor2.size(); i++) {
            String valor = valor2.get(i+1);//busca pela chave por isso mais um
            System.out.println(valor);
         
        }
        System.out.println("\nTamanho"+valor2.size());
        
        /*6) Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um List, percorra todos
         * os elementos utilizando for-enhanced (for-each) e calcule a média.
        */
        System.out.println("\n\t Exercios 06");
        List<Integer>valores6 = new ArrayList<>();
        
        valores6.add(100);
        valores6.add(20);
        valores6.add(200);
        valores6.add(30);
        valores6.add(80);
        valores6.add(40);
        valores6.add(100);
        valores6.add(200);
        float media =0;
        for (Integer i : valores6) {
        System.out.println(i);
         media += i ; 
        }
        System.out.println("Media"+ media/valores6.size());
        /*7) Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um List, percorra todos
         * os elementos utilizando um Iterator e calcule a média.
        */
         System.out.println("\n\t Exercios 07");
        
         List<Integer>valores7 = new ArrayList<>();
        
        valores7.add(100);
        valores7.add(20);
        valores7.add(200);
        valores7.add(30);
        valores7.add(80);
        valores7.add(40);
        valores7.add(100);
        valores7.add(200);
        float media7=0;
        Iterator<Integer> it7 = valores7.iterator();
        while (it7.hasNext()) {
        int valor= it7.next();
        media7 += valor;
            System.out.println(valor);
        }
               System.out.println("Media7 "+media7/valores7.size());
         
         /*
          * 8) Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um Set, percorra todos
          * os elementos utilizando for-enhanced (for-each) e calcule a média.
          */
         System.out.println("\n\t Exercios 08" );
         
         
         
         
         
        
               
               
               
               
               
               
               
         
         
         
    }
        
    
}
