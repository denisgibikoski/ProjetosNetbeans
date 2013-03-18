package questaos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Faça um programa que leia um conjunto de números inteiros armazenando-os em
 * um ArrayList. Faça com que o usuário entre com no mínimo 6 números, podendo
 * ser números repetidos e implemente as questões abaixo: (1 ponto) Crie uma
 * nova lista (lista2) a partir dos 4 primeiros números entrados pelo usuário e
 * imprima essa nova lista. (1 ponto) Crie uma lista (lista 3) a partir da lista
 * entrada pelo usuário apenas com os números entre 1 e 10 e imprima o
 * resultado. (1 ponto) Remova todos os números pares (entre 2 e 10) da lista 2
 * e imprima o resultado. (1 ponto) Peça para o usuário entrar um número e
 * imprima se alguma das três listas criadas anteriormente contém o número. (1
 * ponto) Ordene os números em cada lista e imprima o resultado. (1 ponto)
 *
 * @author D3nys
 */
public class questao2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int valor;
        int cont = 0;

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
        ArrayList<Integer> lista3 = new ArrayList<>();
        do {
            System.out.println("entre com valor");
            valor = ler.nextInt();
            //acrecentando na lista 1
            lista1.add(valor);
            //acrecentando na lista 2
            if (cont >= 4) {
               
                lista2.add(valor);
            }
            //acrecentando na lista 3
            if (valor > 1 && valor < 10) {
                lista3.add(valor);
            }


            cont++;
        } while (cont <= 10);
        //remover numero de 2 a 10 lista2
        for (int i = 0; i < lista2.size(); i++) {
         
            if (lista2.get(i)%2 ==0){
                lista2.remove(i);
            }
            
        }
                

        // buscar numero nas listas
        int busca;
        System.out.println("Entre com um numero para busca");
        busca = ler.nextInt();

        if (lista1.contains(busca)) {
            System.out.println("Encontrado  numero " +busca + " na lista 1");
        }
        if (lista2.contains(busca)) {
            System.out.println("Encontrado numero " +busca + " na lista 2");
        }
        if (lista3.contains(busca)) {
            System.out.println("Encontrado numero " + busca + " na lista 3");
        } else {
            System.out.println("numero nao encontrado");
        }
        //ordenacao das listas
        Collections.sort(lista1);
        Collections.sort(lista2);
        Collections.sort(lista3);
        System.out.println("\t " + lista1);
        System.out.println("\t " + lista2);
        System.out.println("\t " + lista3);
    }
}
