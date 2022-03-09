/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loopwhile;

import java.util.Scanner;


public class LoopWhile {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner calculator = new Scanner(System.in);
        int x, y=0;
        System.out.println("Digite um número inteiro");
        x=calculator.nextInt();
        while(y<=x){
            System.out.println(y);
            y++;
            
        }
               
    }
    
}
