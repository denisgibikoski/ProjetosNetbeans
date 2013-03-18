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
public class Exer02 {
    /*    Faça uma classe Java que dados a distância percorrida (em Km) e o tempo gasto em
     * uma viagem (em horas), informe a velocidade média do carro, 
     * sabendo que Velocidade = D / T (variação de distância / variação do tempo).
     */  
    public static void main(String[] args) {
   Scanner ler = new Scanner(System.in);
        
        System.out.println("Calculo de VELOCIDADE MEDIA");
        System.out.println("Informe a distancia Percorrida em Km");
        double km = ler.nextDouble();
        System.out.println("Entre com o TEMPO em HORAS gsato da Viagem ");
        double hora = ler.nextDouble();
        
        double velocidademedia = (km/hora);
        
        System.out.println("A Velocidade media e:   "+velocidademedia+" Km/H");
        
        
    }
   
}
