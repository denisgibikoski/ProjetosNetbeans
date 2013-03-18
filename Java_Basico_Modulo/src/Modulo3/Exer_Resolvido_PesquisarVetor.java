
package Modulo3;
import java.util.Arrays;
import java.util.Scanner;
public class Exer_Resolvido_PesquisarVetor {
     public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);   
       //criar variavel [para as posisao
        System.out.println("Digite quantas posicoes ira ter o Este se Ordenaçao de vetro");
        int posicao = ler.nextInt();
        //pesquisar numero
         System.out.println("Digite numero a ser pesquisado");
         int pesquisa = ler.nextInt();
        //Criancao do arry de N posicoes
        int [] VetorInteiro = new int[10000];
        //atribuindo os valores de cada posicoes
        for (int i = 0; i < VetorInteiro.length; i++) {
            VetorInteiro[i]=i;
        }
        // Inicio da contagem  do tempo 
        long inicio = System.currentTimeMillis();
        //percorrendo o vetor em busca do numero
         for (int i = 1; i < VetorInteiro.length; i++) {
             if(VetorInteiro[i]==pesquisa)
                 break;
                 }
                
            
         // fin da contagem do tempo  
        long fim = System.currentTimeMillis();
        //Imprime o tempo total de ordenaçao
        System.out.println("Tempo Ordenar 1 : "+(fim - inicio)+"ms");
        //armazena o tempo de inicio da ordenacao
        inicio = System.currentTimeMillis();
        //pesquisa otilizando Arry com busca binara
        Arrays.binarySearch(VetorInteiro, pesquisa);
        //armazena o fim da ordenacao
        fim = System.currentTimeMillis();
        //Imprimie o tempo total da segunda ordenacao
        System.out.println("Tempo ordenar 2 : "+(fim-inicio)+"ms");
        
        
    
        }
}

