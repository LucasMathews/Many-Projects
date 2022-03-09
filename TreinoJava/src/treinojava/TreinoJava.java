/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treinojava;

import java.util.Scanner;

public class TreinoJava {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cicloDeVida = new Scanner(System.in);
        int an, ms, ds;
        int idEmDias;
        System.out.println("Digite a sua idade em anos");
        an=cicloDeVida.nextInt();
        System.out.println("Digite sua idade em meses");
        ms=cicloDeVida.nextInt();
        System.out.println("Digite sua idade em dias");
        ds=cicloDeVida.nextInt();
        
        idEmDias = an * 365 + ms * 30 + ds;
          System.out.println("Idade em dias" +idEmDias);
                          
    }
    
}
