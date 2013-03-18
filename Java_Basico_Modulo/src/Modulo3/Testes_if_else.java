/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo3;

/**
 *
 * @author D3nys
 */
public class Testes_if_else {
    
    
    public static void main(String[] args) {
        int ano=2016;
        
        if ( ano < 0 ){
            System.out.println("nAO E UM Ano");
        }else if( ( ano % 4 ==0 && ano % 100 != 0 )|| (ano % 400 ==0 )){
            System.out.println("É Bissento");
        }else{
            System.out.println("nao e bisseto");
        }        
    }
    
}
