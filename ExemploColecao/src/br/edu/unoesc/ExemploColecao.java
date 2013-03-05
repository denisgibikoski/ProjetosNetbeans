/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unoesc;

import java.util.*;

public class ExemploColecao {
    public static void main(String[] args) {
        // Criando uma lista de nomes com Generics
        List<String> nomes = new ArrayList();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("José");
        nomes.add("José");
        nomes.add("Ana");
        System.out.println("Tamanho: " + nomes.size() );
        for(int i=0; i<nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i) );
        }
        
        System.out.println("Lista após removido e alterado");
        nomes.remove("Maria"); // remove Maria
        nomes.set(2, "Ana Marcia"); // altera Ana para Ana Marcia
        System.out.println("Tamanho: " + nomes.size() );
        for(int i=0; i<nomes.size(); i++) {
            System.out.println("Nome: " + nomes.get(i) );
        }
        
        if (nomes.contains("João") ) {
            System.out.println("João esta na lista");
        } else {
            System.out.println("João não esta na lista");
        }
        
        // Ordenando
        System.out.println("Coleção Ordenada:");
        Collections.sort(nomes);
        // Percorrendo a coleção usando Iterator
        Iterator it = nomes.iterator();
        while ( it.hasNext() ) { // hasNext() temProximo()
            String n = (String) it.next(); // ir para proximo;
            System.out.println("Nome: " + n);
        }

        List<Integer> valores = new ArrayList();
        valores.add(1);
        valores.add(2);
        valores.add(3);
        valores.remove( new Integer(1) );
        for(int i=0; i<valores.size(); i++) {
            System.out.println("Valor: " + valores.get(i) );
        }        
    }
}


