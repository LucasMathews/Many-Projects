/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetornumbers;

import java.util.Arrays;


public class VetorNumbers {

  
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[100];
        
        //preenche o array com um valor(0)
        Arrays.fill(numeros, -1);
        
        for(int posicao = 0; posicao<numeros.length; posicao++){
            
        System.out.println(numeros[posicao]);
        } 
        System.out.println(numeros.length);
    }
    
}
