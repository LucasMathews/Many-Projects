/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saldoemjava;

import java.util.Scanner;

public class SaldoEmJava {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner saldo = new Scanner(System.in);
        double Sd;
        double totSaldo;
        
        System.out.println("Digite o seu saldo normal");
        Sd=saldo.nextDouble();
        
        totSaldo = (Sd * 5) /100;
        totSaldo = totSaldo + Sd;
        System.out.println("O seu saldo com reajuste de 1% é" +totSaldo);
    }
    
}
