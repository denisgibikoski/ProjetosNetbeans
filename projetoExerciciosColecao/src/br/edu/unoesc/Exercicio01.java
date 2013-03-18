/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.unoesc;

import java.util.Scanner;

/**
 * 1) A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, 
 * coletando dados sobre o salário. Os salários deverá ser armazenados 
 * em um vetor de valores reais. 
 * A prefeitura deseja saber:
 * Média do salário da população;
 * Maior salário;
 * Percentual de pessoas com salário até R$ 100,00;
 * O final da leitura de dados se dará com a entrada de um salário negativo.
 * @author agosti
 */
public class Exercicio01 {

    public static void main(String[] args) {
        float salarios[] = new float[5];
        Scanner teclado = new Scanner(System.in);
        int contador = 0, contaAte100 = 0;
        float salario = 0, soma = 0, maior = 0;
        do {
            System.out.println("Informe o salário");
            salario = teclado.nextFloat();
            if (salario >= 0) {
                salarios[contador] = salario;
                contador ++;
                if (contador == 5) {
                    break;
                }
            }
        } while (salario >= 0);
        for (int i=0; i<contador; i++) {
            soma += salarios[i];
            if (salarios[i] <= 100) {
                contaAte100 ++;
            }
            if (salarios[i] > maior) {
                maior = salarios[i];
            }
        }
        if (contador > 0) {
            System.out.println("Media " + soma/contador);
            System.out.println("Maior " + maior);
            System.out.println("Percentual " + (float)contaAte100/contador*100 );
        }
    }
}






