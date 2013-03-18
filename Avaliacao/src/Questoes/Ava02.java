/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Questoes;

import java.util.Scanner;

/**
 *
 * @author D3nys
 */
public class Ava02 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
       String nome;
       double SalarioBase, TotalSalario;
       double TotalDeVenda;
             
        System.out.println("Entre com o nome do Vendedor");
        nome = ler.nextLine();
        System.out.println("Digite Salario Base do vendedor");
        SalarioBase = ler.nextDouble();
        System.out.println("Digite o TOTAL de Vendas no mes");
        TotalDeVenda = ler.nextDouble();
        
        double comisao = TotalDeVenda*0.05;
        TotalSalario = SalarioBase+comisao;
        
        System.out.println("O Nome do Vededor e:"+nome+"\nO Salario do vendedor e :"+TotalSalario);
        
        
    }
    
}
