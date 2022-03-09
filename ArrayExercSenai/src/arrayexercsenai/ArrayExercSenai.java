/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayexercsenai;

import java.util.Scanner;


public class ArrayExercSenai {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner LerValores= new Scanner(System.in);
        int i, n, vlr;
        
        System.out.println("Quantos valores ?");
        n = LerValores.nextInt();
        
        for(i=1; i<=n; i++){
            System.out.printf("%do. valor ", i);
            vlr = LerValores.nextInt();
        }
    
    }
    
}