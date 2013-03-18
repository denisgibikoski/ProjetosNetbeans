
package REVISAO;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 *4) Criar um Map de dias da semana contendo o valor numérico que representa o dia
 * como chave e sua descrição no formato String. Criar uma rotina onde o usuário
 * informe o número do dia e com a pesquisa no mapa retorne a descrição.
 * @author D3nys
 */
public class exer04 {
    public static void main(String[] args) {
        HashMap<Integer, String> diaSemana = new HashMap<>();
         Scanner ler = new Scanner(System.in);
         
        diaSemana.put(1, "Domigo");
        diaSemana.put(2, "Segunda");
        diaSemana.put(3, "Treça");
        diaSemana.put(4, "Quarta");
        diaSemana.put(5, "Quinta");
        diaSemana.put(6, "Sexta");
        diaSemana.put(7, "Sabado");
        
        System.out.println("Digite um numero corespondente com o dia");
        int dia = ler.nextInt();
        
        
     
        
     //   for (int i = 0; i < diaSemana.size(); i++) {
            if (diaSemana.containsKey(dia)){
                System.out.println("O dia escolido foi :"+diaSemana.get(dia));
         //       break;
                
            }else{
                System.out.println("Numero nao exite com dia da semana");
           //     break;
            }
           
            
       // }
            
    }
    
}
