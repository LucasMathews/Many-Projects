/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculomedia;

import java.util.Scanner;

public class CalculoMedia {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner media = new Scanner(System.in);
        double n1, n2, n3;
        double totMedia;
        System.out.println("Digite o primeiro valor");
        n1=media.nextDouble();
        System.out.println("Digite o segundo valor");
        n2=media.nextDouble();
        System.out.println("Digite o terceiro valor");
        n3=media.nextDouble();
        
        totMedia = n1 + n2 + n3;
        totMedia = totMedia/3;
        System.out.println("O total da média é" +totMedia);
        
          
    }
    
}
