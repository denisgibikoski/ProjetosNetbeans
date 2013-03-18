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
public class Ava03 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int Voltas, cont, VotaMaisRapida = 0;
        float Tempo , MelhorTempo = 999999999, TempoMedioVoltas, SomaTempos = 0;
        
        System.out.println("Entre com o numero de voltas");
        Voltas = ler.nextInt();
        
        for (cont=0;cont<Voltas;cont++){
             System.out.println("Entre com o tempo da Volta");
             Tempo= ler.nextFloat();
           
            if (Tempo<MelhorTempo){
                
                MelhorTempo= Tempo;
            
            VotaMaisRapida = cont+1;
            }
            SomaTempos += Tempo;
              
           
        }
        TempoMedioVoltas= SomaTempos/Voltas;
        System.out.println("O melhor tempo foi: "+MelhorTempo);
        System.out.println("A Volta mais rapida foi :"+VotaMaisRapida);
        System.out.println("O Tempo Medio foi :"+TempoMedioVoltas);
        
    
            
                        
           
        } 
        
        
    }


