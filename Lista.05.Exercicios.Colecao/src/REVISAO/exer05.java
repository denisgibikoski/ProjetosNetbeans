package REVISAO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * 5) Crie uma lista de valores inteiros informados pelo usuário, a finalização
 * da entrada ocorre quando for digitado valor -1 (utilize List para solucionar
 * esse problema), crie as rotinas para encontrar os itens abaixo considerando
 * sempre os elementos já adicionados na lista. a) Exiba o maior armazenado; b)
 * Exiba o menor valor armazenado; c) Exiba os elementos da lista em ordem
 * numérica; d) Efetue a soma dos valores pares da lista.
 *
 * @author D3nys
 */
public class exer05 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int valor;
        int soma = 0;
        ArrayList<Integer> valores = new ArrayList<>();

        do {
            System.out.println("Entre com valor ");
            valor = ler.nextInt();

            if (valor >= 0) {
                valores.add(valor);
            }
            if (valor %2 == 0){
                soma += valor;
            }

        } while (valor != -1);
   


        int minimo = Collections.min(valores);
        System.out.println("\n\tO Minimo e :" + minimo);
        int max = Collections.max(valores);
        System.out.println("\n\t O MAXIMO E :" + max);

        Collections.sort(valores);
        System.out.println(" \n " + valores);
        System.out.println("\n \tA soma e :" + soma);
    }
}
