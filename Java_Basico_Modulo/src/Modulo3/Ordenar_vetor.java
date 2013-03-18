
package Modulo3;

public class Ordenar_vetor {
    public static void main(String[] args) {
        
        
        int VetorInteiro [] = {100,50,75,32,45,96,458,1,52,58,6,2,54,8};
        
        boolean estaOrdenado = false;
        
        while (!estaOrdenado) {
            estaOrdenado = true;
            for (int i = 1; i < VetorInteiro.length; i++) {
             if(VetorInteiro[i-1]<VetorInteiro[i]){
                 estaOrdenado= false;
                 int aux = VetorInteiro[i];
                 VetorInteiro[i]=VetorInteiro[i-1];
                 VetorInteiro[i-1]=aux;
                                       
            }
            
        }
            for (int i = 0; i < VetorInteiro.length; i++) {
                System.out.println("Ordem Atual ;"+VetorInteiro[i]);
            }
    }
    
}
}