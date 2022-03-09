/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salariominimo;

import java.util.Scanner;

public class SalarioMinimo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner salario = new Scanner(System.in);
        double SU;
        System.out.println(">>>>>O VALOR DE UM SALÁRIO É DE R$750,00<<<<<<<<");
        System.out.println("Digite quanto você ganha: ");
        SU = salario.nextDouble();
        
        SU = SU / 750;
        SU = SU;
        System.out.println("Você ganha " +SU+ "salários mínimos");
        
    }
    
}
