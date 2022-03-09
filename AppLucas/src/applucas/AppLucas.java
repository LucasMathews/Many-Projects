'/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package applucas;

import java.util.Scanner;

public class AppLucas {

   
    public static void main(String[] args) {
        
    Scanner calculator = new Scanner(System.in);   
    int valor01, valor02;
    System.out.println("Digite um número: ");
    valor01=calculator.nextInt();
    System.out.println("Digite outro numero: ");
    valor02=calculator.nextInt();
    
    if(valor01==valor02){
        System.out.println("Os valores estão iguais");
        }
    else if(valor01>valor02){
        System.out.println("O maior valor é:" +valor01+ "e o menor é" +valor02);
    }
    else{
        System.out.println("O maior valor é" +valor02+ "e o menor valor é" +valor01);
    }
    
  }
    
    
}
