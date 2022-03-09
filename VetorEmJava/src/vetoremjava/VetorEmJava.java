/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetoremjava;


public class VetorEmJava {

  
    public static void main(String[] args) {
        // TODO code application logic here
        //array que vai guardar o nome de 5 pessoas
        //tipo[] nomeVariavel = new tipo[5];
        String[] nomes = new String[]{
        "Lucas" , "Naianne" , "Noah" , "Deus" , "Jesus"
        };
        
        for(int posicaoVetor = 0; posicaoVetor<5; posicaoVetor ++){
            System.out.print(nomes[posicaoVetor] + " ");
        }
    }    
    
}
