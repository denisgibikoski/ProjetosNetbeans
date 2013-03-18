/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unoesc;

import java.util.ArrayList;

/**
 *
 * @author agosti
 */
public class Exercicio02 {
    public static void main(String[] args) {
        ArrayList<String> valores = new ArrayList();
        
        // Adicionando 200 strings no arraylist valores
        for (int i=0; i<200; i++) {
            valores.add("Ola " + i);
        }
        
        // mostrando os 200 strings
        for (int i=0; i<200; i++) {
            System.out.println( valores.get(i) );
        }
    }
    
}
