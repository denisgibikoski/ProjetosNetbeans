
package Modulo3;

import java.util.Scanner;


public class Exer_resolvido_caixa_eletronico {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //cedulas disponiveis no caixa eletronico
        int cedulas [] = {100,50,20,10,5,2,1};
        //Quantidade total de cedulas entregue ao cliente
        int quantidadeTotal = 0;
        //valor sacado
        int ValorReais;
        System.out.println("Entre com o Valor sacado");
        ValorReais = ler.nextInt();
        //Percorrendo todas as cedulas disponiveis no caixa eletronico
        for (int i = 0; i <cedulas.length; i++) {
            //Quantidade de cedulas pa valor cedulas[i]
            int quantidadecedulas = ValorReais/cedulas[i];
            //impressao da quandtidade de cedulas
            System.out.println("Quantidade de cedulas de "+cedulas[i]+":"+quantidadecedulas);
            //resto de disisao
            ValorReais %= cedulas[i];
            //Quantidade total de cedulas entregues ao cliente
            quantidadeTotal += quantidadecedulas;
            }
     //impressao
        System.out.println("Quantidade Total: "+quantidadeTotal);
        
    }
    
}
