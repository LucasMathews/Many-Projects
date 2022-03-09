/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoidade;

import java.util.Scanner;


public class CalculoIdade {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner idade = new Scanner(System.in);
        int Nasc, Hj = 2022;
        System.out.println("Em que ano você nasceu?");
        Nasc = idade.nextInt();
        
        
        Hj = Hj - Nasc;
        System.out.println("Você tem" +Hj+ "anos de idade");
        
    }
    
}
