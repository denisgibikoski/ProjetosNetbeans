
package questaos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *Criar um programa em Java para armazenar valores das siglas dos estados do
Brasil, a entrada de dados será finalizada quando o usuário digitar a sigla NN. No
final o programa deverá mostrar todas as siglas cadastradas em ordem
alfabética. (2 pontos)
 * @author D3nys
 */
public class questao3 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        String sigla = null;
        ArrayList<String> Siglas = new ArrayList<>();
        // acrecentar siglas na lista
      while(!"NN".equals(sigla)) {
            System.out.println("Entre com as Siglas dos Estado do Brasil");
            sigla = ler.next();
           Siglas.add(sigla);
           if ("NN".equals(sigla)){
               Siglas.remove("NN");
           }
        } 
        // ordenar
        Collections.sort(Siglas);
        System.out.println("\n"+Siglas);
        
             /*   Scanner ler = new Scanner(System.in);
        
        String sigla = null;
        Set<String> Siglas = new TreeSet<>();
        // acrecentar siglas na lista
      while(!"NN".equals(sigla)) {
            System.out.println("Entre com as Siglas dos Estado do Brasil");
            sigla = ler.next();
           Siglas.add(sigla);
           if ("NN".equals(sigla)){
               Siglas.remove("NN");
           }
        } 
           
        System.out.println("\n"+Siglas);*/
    }
    
}
