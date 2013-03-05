/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unoesc;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author agosti
 */
public class ExemploSet {
    
    public static void main(String[] args) {
        Set<String> nomes = new TreeSet();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");
        Iterator it = nomes.iterator();
        while(it.hasNext()) {
            System.out.println("Nome: " + it.next() );
        }
    }
    
    
}
