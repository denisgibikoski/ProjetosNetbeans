/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unoesc;

import java.util.*;

/**
 *
 * @author agosti
 */
public class OutrosExercicios {
    public static void main(String[] args) {
        // 3) Faça um ArrayList e insira as Strings 
        // "String 1", "String 2" e "String 3" cada uma
        // duas vezes, percorra todos os elementos e 
        //imprima (System.out.println()). Observe
        // o resultado. Quantos elementos têm a coleção?
        
        ArrayList<String> valores3 = new ArrayList();
        
        valores3.add("String 1");
        valores3.add("String 2");
        valores3.add("String 3");
        valores3.add("String 1");
        valores3.add("String 2");
        valores3.add("String 3");

        // exercicio 11
        //Collections.shuffle(valores3);
        // exercicio 13
        Collections.sort(valores3);
        for(int i=0; i < valores3.size(); i++) {
            System.out.println( valores3.get(i) );
        }
        System.out.println("Tamanho: " + valores3.size() );

        // exercicio 12
        int v = Collections.binarySearch(valores3, "String 2");
        System.out.println("v = " + v);
        
        
        // 4) Faça um HashSet e insira as Strings 
        // "String 1", "String 2" e “String 3" cada uma
        // duas vezes, percorra todos os elementos e 
        // imprima (System.out.println()). Observe
        // o resultado. Quantos elementos têm a coleção?
        System.out.println("Valores do HashSet ");
        HashSet<String> valores4 = new HashSet();
        valores4.add("String 1");
        valores4.add("String 2");
        valores4.add("String 3");
        valores4.add("String 1");
        valores4.add("String 2");
        valores4.add("String 3");
        Iterator<String> it4 = valores4.iterator();
        while (it4.hasNext()) {
            String valor = it4.next();
            System.out.println(valor);
        }
        System.out.println("Tamanho: " + valores4.size() );
        
        // 5) Faça um HashMap e insira as Strings 
        // "String 1", "String 2" e "String 3" cada uma
        // duas vezes, utilize o numeral como chave, 
        // percorra todos os elementos e imprima
        // (System.out.println()). Observe o resultado. 
        // Quantos elementos têm a coleção?
        System.out.println("Valores do HashMap");
        HashMap<Integer, String> valores5 = new HashMap();
        valores5.put(1, "String 1");
        valores5.put(2, "String 2");
        valores5.put(3, "String 3");
        valores5.put(1, "String 1");
        valores5.put(2, "String 2");
        valores5.put(3, "String 3");
        for(int i=0; i < valores5.size(); i++) {
            String valor = valores5.get(i+1); // buscando pela chave por isso + 1
            System.out.println(valor);
        }
        System.out.println("Tamanho: " + valores5.size() );
        
        // 6) Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 
        // a um List, percorra todos os elementos utilizando 
        // for-enhanced (for-each) e calcule a média.
        System.out.println("Valores da Lista 6");
        List<Integer> valores6 = new ArrayList();
        valores6.add(100);
        valores6.add(20);
        valores6.add(200);
        valores6.add(30);
        valores6.add(80);
        valores6.add(40);
        valores6.add(100);
        valores6.add(200);
        float media = 0;
        for(Integer i : valores6) {
            media += i;
            System.out.println(i);
        }
        System.out.println("Media: " + media/valores6.size() );
        //7) Adicione os números 100, 20, 200, 30, 80, 40, 100, 200 a um List, 
        // percorra todos os elementos utilizando um Iterator e calcule a média.
        System.out.println("Valores da Lista 7");
        List<Integer> valores7 = new ArrayList();
        valores7.add(100);
        valores7.add(20);
        valores7.add(200);
        valores7.add(30);
        valores7.add(80);
        valores7.add(40);
        valores7.add(100);
        valores7.add(200);
        float media7 = 0;
        Iterator<Integer> it7 = valores7.iterator();
        while ( it7.hasNext() ) {
            int valor = it7.next();
            media7 += valor;
            System.out.println(valor);
        }
        System.out.println("Media 7: " + media7/valores7.size() );
        
        
    }
    
}








