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
public class Exer04 {
    public static void main(String[] args) {
  
    Scanner ler = new Scanner (System.in);
    
    int cod_Funcionario;
    String nome_Funcionario;
    int classe;
    double hora_Normais, hora_Extras;
    double valor_Hora;
    
        System.out.println("Programa para calcular Folha de pagamento mensal");
        System.out.println("Digite o codigo do Funcionario");
        cod_Funcionario =ler.nextInt();
        System.out.println("Entre com o Nome do Funcionario");
        nome_Funcionario = ler.next();
        System.out.println("Digite a Quantidade de Horas Trabalhada normais");
        hora_Normais = ler.nextDouble();
        System.out.println("Digite a Quantidade de Horas Extras Trabalhada ");
        hora_Extras = ler.nextDouble();
        System.out.println("Entre com O VALOR DA HORA TRABALHADA");
        valor_Hora = ler.nextDouble();
        System.out.println("Entre com sua Classificacao");
        System.out.println("(1-> Operario, 2-> ADM, 3-> Diretoria)");
        classe = ler.nextInt();
        
        
        double salario_Nornal = 0, salario_Extra = 0;
       
        if(classe == 1){
            salario_Nornal = hora_Normais * valor_Hora;
        }
        if(classe == 2){
            salario_Nornal = hora_Normais * valor_Hora;
            salario_Nornal = salario_Nornal + (salario_Nornal* 0.15);
        }
       if(classe == 3){
           salario_Nornal = hora_Normais * valor_Hora;
            salario_Nornal = salario_Nornal + (salario_Nornal* 0.25);
       }
       if(hora_Extras!=0){
       salario_Extra= hora_Extras *(valor_Hora*0.30);
       }
               
       
       double total_salario,total_desconto;
        total_salario = salario_Nornal + salario_Extra;
        total_desconto = total_salario*0.08;
        
        
        double salariototal,salarioliquido;
        salariototal = salario_Nornal+salario_Extra;
        salarioliquido = salariototal- total_desconto;
        
        //Mostrar os resultado
        System.out.println("CODIGO DO FUNCIONARIO :"+cod_Funcionario+"          NOME DO FUCIONARIO:"+nome_Funcionario);
        System.out.println("Salario das Horas normais: "+salario_Nornal+" R$");
        System.out.println("Salario das horas Extras: "+salario_Extra+" R$");
        System.out.println("Total de Desconto "+total_desconto+" R$");
        System.out.println("O Salario LIQUIDO E de "+salarioliquido+" R$");
    
    
    }  
}
