/*
 * A prefeitura de uma cidade fez uma pesquisa entre seus habitantes, coletando
 dados sobre o salário. Os salários deverá ser armazenados em um vetor de
 valores reais. A prefeitura deseja saber:
 Média do salário da população;
 Maior salário;
 Percentual de pessoas com salário até R$ 100,00;
 O final da leitura de dados se dará com a entrada de um salário negativo.
 */
package Lis.exer.Colecao.java;

import java.util.Scanner;

/**
 *
 * @author D3nys
 */
public class java01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float salario;
        float maior = 0;
        float percetual;
        int cont = 0;
        int contaate100 = 0;
        float soma = 0;
        float VetorSalario[] = new float[5];


        do {
            System.out.println("Digite o valor do salario ");
            salario = ler.nextFloat();
            if (salario >= 0) {
                VetorSalario[cont] = salario;
                cont++;
                if (cont == 5) {
                    break;
                }
            }
        } while (salario >= 0);

        for (int i = 0; i < cont; i++) {
            soma += VetorSalario[i];
            if (VetorSalario[i] <= 100) {
                contaate100++;
            }
            if (VetorSalario[i] > maior) {
                maior = VetorSalario[i];
            }
        }
        if (cont > 0) {
            System.out.println("Media"+soma/cont);
            System.out.println("Maior" + maior);
            System.out.println("Percetual  " + (float) contaate100 / cont * 100);
        }



    }
}
