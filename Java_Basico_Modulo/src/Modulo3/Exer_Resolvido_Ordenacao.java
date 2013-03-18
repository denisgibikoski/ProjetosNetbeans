
package Modulo3;
import java.util.Arrays;
import java.util.Scanner;
public class Exer_Resolvido_Ordenacao {
    public static void main(String[] args) {
         Scanner ler = new Scanner(System.in);   
       //criar variavel [para as posisao
        System.out.println("Digite quantas posicoes ira ter o Este se Ordenaçao de vetro");
        int posicao = ler.nextInt();
        //Criancao do arry de N posicoes
        int [] VetorInteiro = new int[10000];
        //atribuindo os valores de cada posicoes
        for (int i = posicao; i > 0; i--) {
            VetorInteiro[VetorInteiro.length-i]=i;
        }
        //incio do algoritimo de ordenacao - implementado
        boolean estaOrdenado = false;
        // armazena o tempo da ordenaçao
        long inicio = System.currentTimeMillis();
        while (!estaOrdenado) {
           estaOrdenado = true;
            for (int i = 1; i < VetorInteiro.length; i++) {
             if(VetorInteiro[i-1]<VetorInteiro[i]){
                 estaOrdenado= false;
                 int aux = VetorInteiro[i];
                 VetorInteiro[i]=VetorInteiro[i-1];
                 VetorInteiro[i-1]=aux;
                        }
                }
            }
      // armazena o tempo  fim da ordenaçao
        long fim = System.currentTimeMillis();
        //Imprime o tempo total de ordenaçao
        System.out.println("Tempo Ordenar 1 : "+(fim - inicio)+"ms");
        //Atribuir os valores a cada posicoes
        for (int i = posicao; i > 0; i--) {
            VetorInteiro[VetorInteiro.length-i]=i;
        }
        //armazena o tempo de inicio da ordenacao
        inicio = System.currentTimeMillis();
        //Ordena utilizando a classe Arry com Sort
        Arrays.sort(VetorInteiro);
        //armazena o fim da ordenacao
        fim = System.currentTimeMillis();
        //Imprimie o tempo total da segunda ordenacao
        System.out.println("Tempo ordenar 2 : "+(fim-inicio)+"ms");
        
        
    
        }
}