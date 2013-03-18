
package questaos;

import java.util.HashMap;
import java.util.Scanner;

/**
 *Crie uma coleção do tipo HashMap<String, Integer> tendo como chave o nome
do produto e como valor a quantidade em estoque. Acrescente alguns
valores de exemplo ao Map e crie a possibilidade do usuário entrar um nome de
produto e o programa, em resposta, deve dizer se o produto existe ou não e,
caso exista, imprimir a quantidade em estoque. (2 pontos)
 * @author D3nys
 */
public class questao1 {
    
    public static void main(String[] args) {
        
       HashMap<String , Integer> lista = new HashMap<>();
      Scanner ler = new Scanner(System.in);
         // criacao da lista     
       lista.put("Calça",2);
       lista.put("camisa", 5);
       lista.put("tenis", 3);
       
        System.out.println("Entre com a palavra para busca");
        String busca= ler.nextLine();
        //busca do produto
        if (lista.containsKey(busca)){
            System.out.println("O Produto exite e comtem  "+lista.get(busca)+ " peça");
        }
        else{
            System.out.println("Nao existe produto cadastrado");
        }
        
        
        
       
       
       
        
        
        
        
        
    }
    
}
