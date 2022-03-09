/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primeiracalculadoralukao;

import java.util.Scanner;


public class PrimeiraCalculadoraLukao {

  
    public static void main(String[] args) {
        
        Scanner bbb = new Scanner(System.in);
        double valor01, valor02, total;
        char operador;
        System.out.println("Digite o primeiro valor: ");
        valor01=bbb.nextDouble();
        System.out.println("Digite o segundo valor: ");
        valor02=bbb.nextDouble();
        System.out.println("Digite um operador entre:+,-,* ou / ");
        operador=bbb.next().charAt(0);
        
        if(operador== '+'){
            total=valor01+valor02;
            System.out.println("Você escolheu a soma. Então o total é" +total);
        }       
        else if(operador== '-'){
            total=valor01-valor02;
            System.out.println("Você escolheu a subtração. Então o total é" +total);
        }
        else if(operador== '*'){
            total=valor01*valor02;
            System.out.println("Você escolheu a multiplicação. Então o total é" +total);
        }
        else if(operador== '/'){
            total=valor01/valor02;
            System.out.println("Você escolheu a divisão. Então o total é" +total);
        }
        else{
            System.out.println("Error");
        }
    }
    
}
