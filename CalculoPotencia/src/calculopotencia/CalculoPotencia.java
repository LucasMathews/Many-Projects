/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculopotencia;

import java.util.Scanner;


public class CalculoPotencia {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int base, potencia, result, i=1;
        System.out.println("Digite o valor da base");
        base=entrada.nextInt();
        System.out.println("Digite o valor da potência");
        potencia=entrada.nextInt();
        result=base;
            while(i<potencia){
                result=result*base;
                i++;
               System.out.println(result);
            }
        
    }
    
}
