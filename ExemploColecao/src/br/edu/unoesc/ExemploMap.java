/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unoesc;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author agosti
 */
public class ExemploMap {
    public static void main(String[] args) {
        Map<String, String> estados = new TreeMap();
        
        estados.put("SC", "Santa Catarina");
        estados.put("RS", "Rio Grande do Sul");
        estados.put("PR", "Paraná");
        //estados.put("PR", "testes");
        estados.put("XX", "Paraná");
                
        System.out.println("Estado:" + estados.get("PR"));
        System.out.println(estados.keySet());
        System.out.println(estados.entrySet());
        
    }
}
