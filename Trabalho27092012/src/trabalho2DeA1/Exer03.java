/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho2DeA1;

import java.util.Scanner;

/**
 *
 * @author D3nys
 */
public class Exer03 {
    /*  Uma prefeitura abriu uma linha de crédito para seus funcionários.
     * O valor máximo daprestação não poderá ultrapassar 25% do salário bruto.
     * Faça uma classe executávelque dados o valor do salário bruto e o valor da prestação,
     * informe se o empréstimo pode ou não ser concedido.
 */   
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Programa Para linha de Credito para funcionario");
        System.out.println("Entre com o Salario  do funcionario");
        double salario = ler.nextDouble();
        System.out.println("Entre com o valor da Prestçao");
        double pretcao = ler.nextDouble();
        
        if (pretcao > salario * 0.25){
            System.out.println("Emprestimo nao foi  concedido");
        }else{
            System.out.println("Emprestimo foi concedido");
        }
        
        
    }
}
