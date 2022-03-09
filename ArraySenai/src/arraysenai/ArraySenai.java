/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysenai;

import java.util.Scanner;

public class ArraySenai {

  
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
       
       int vetor[] = new int [8];
       
       int i, tot1, tot2, total = 0, soma = 0;
       
       for(i=0; i<8; i++){
           System.out.println("Digite o primeiro valor");
           vetor[i] = entrada.nextInt();  
        }
       for(i=0; i<8; i++){
           System.out.print(vetor[i]+ " , ");
       }
       for(i = 0; i< vetor.length; i++){
            soma += vetor[i];     
       }
            
       System.out.println("O quinto valor digitado é o valor: " +vetor[4]);
       
       tot1 = vetor[0]+vetor[7];
       System.out.println("A soma do primeiro e último valor é" +tot1);
       
       
       tot2 = vetor[3] * vetor[7];
       System.out.println("A multiplicação do terceiro e sétimo valor é" +tot2);
       
       System.out.println("A soma de todos os valores é" +soma);
    }
    

} 

