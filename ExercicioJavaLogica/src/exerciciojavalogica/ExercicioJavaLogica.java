/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciojavalogica;

import java.util.Scanner;

public class ExercicioJavaLogica {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner peça = new Scanner(System.in);
        int ValorUnitario1 = 100, QuantidadePeça1,ValorUnitario2 = 150,Quantidade2, Total;
        double porcentagem;
        System.out.println("Quantas peças 1 você quer");
        QuantidadePeça1=peça.nextInt();
        System.out.println("Quantas peças 2 você quer?");
        Quantidade2=peça.nextInt();
        
        Total = ValorUnitario1 * QuantidadePeça1 + ValorUnitario2 * Quantidade2 * 1 / 100 +1;
        System.out.println("O valor total da quantidade de peças1 é de" +Total+ "e o total de quantidade2 é de" +Total);
        
    }
    
}
