/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroantesdepois;

import java.util.Scanner;


public class NumeroAntesDepois {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numeros = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite um numero");
        n1 = numeros.nextInt();
       
        
        n1 = n1 + 1; 
        n2 = n1 - 2;
       
        System.out.println("O número sucessor é" +n1+ "e o número antecessor é" +n2);
        
        }
    }

