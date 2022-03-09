/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package if1;

import java.util.Scanner;


public class If1 {

        public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner bbb = new Scanner(System.in);
        int valor1;
        System.out.println("Digite um numero");
        valor1=bbb.nextInt();
       
            if(valor1==1){
                System.out.println("Lucas Engenheiro");
            }
            else if(valor1==2){
                System.out.println("Lucas Programador");
            }
            else if(valor1==3){
                System.out.println("Lucas Desenvolvedor");
            }
            else{
                System.out.println("Lucas Programador Java");
             } 
            
            
        }
        
}
