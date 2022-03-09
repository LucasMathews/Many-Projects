/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetorarrayproject;

import java.util.Scanner;


public class VetorArrayProject {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int valores[] = new int[8];
        
        valores[0] = 20;
        valores[1] = 30;
        valores[2] = 40;
        valores[3] = 50;
        valores[4] = 60;
        valores[5] = 70;
        valores[6] = 80;
        valores[7] = 90;
        
        //Acessando o quinta valor(Posição 4)
        System.out.println("Elemento 5 do array" +valores[4]);
        
        //Soma de todos os valores
        //LENGTH é uma ferramenta que totaliza todos os elementos
        // += é um sinal de atribuição
        
        int total = 0;
        for(int i = 0; i< valores.length; i++){
            total += valores[i];
    }
        System.out.println("O total é" +total);
    }
        
        
}
