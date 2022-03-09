/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuadajava;

import java.util.Scanner;


public class TabuadaJava {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tabuada = new Scanner(System.in);
        int valor, i=1;
        System.out.println("Digite um valor para tabuada");
        valor=tabuada.nextInt();
        
        if(valor>10){
           System.out.println("Você excedeu o limite");
        }
        else{
        
            while(i<=10){
        System.out.println(valor + "*" +i+ "=" +valor*i);
         i++;  
        } 
        
        
      }
    
    }
}
