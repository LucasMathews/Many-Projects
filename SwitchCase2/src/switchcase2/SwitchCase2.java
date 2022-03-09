/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package switchcase2;

import java.util.Scanner;


public class SwitchCase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
         int num1,valor,x=0;
         System.out.println("Digite 1 nomes, 2 para numeros e 3 para tabuada");
         num1 =entrada.nextInt();
         
         switch(num1){
             case 1:
                System.out.println("Digite um número");
                valor =entrada.nextInt();
                    if(valor>10){
                        System.out.println("Robson Lindo");
                    }
                    else{
                        System.out.println("Robson Maravilhoso");
                    }

             break;

             case 2:
                System.out.println("Digite um número");
                valor =entrada.nextInt();
                    while(x<valor){
                        System.out.println(x);
                        x++;
                 }
             break;

            case 3:
                System.out.println("Digite um número");
                valor =entrada.nextInt();
                    while(x<10){
                        System.out.println(valor + " * " + x + " = " + valor*x);
                        x++;
                 }
                 break;

            default:
                System.out.println("Você não escolheu opção válida");
         }
    }
    
}
