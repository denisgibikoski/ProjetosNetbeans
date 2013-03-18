/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UmExemplodeDog;

/**
 *
 * @author D3nys
 */
 class Dog {
    String name;
    
    public static void main(String[] args) {
      //cria um objeto Dog e o acesso
        final Dog dog1 = new Dog();
        dog1.name = "Bart";
        //agora cria uma matriz Dog
        Dog[] myDogs = new Dog [3];
        myDogs[0] = new Dog(); 
        myDogs[1] = new Dog();
        myDogs[2] = dog1;
        //aora acessa os objetos Dog
        //Usando as referências das matriz
        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";
        //Hum... qual é o nemo de myDog[2]?
        System.out.println("O nome do ultimo cao e");
        System.out.println(myDogs[2].name);
        
        //agora executa um loop pela matriz
        // e pede e todos os cãos para latirem
        
        int x = 0;
        
        while (x < myDogs.length) {
            myDogs[x].bark();
            x=x+1;
        }
    }
        public void bark(){
            System.out.println(name+"Diz Ruff!!!");
        }
        public void eat(){}
        public void chaseCat(){}
 
 }
    
    
        

