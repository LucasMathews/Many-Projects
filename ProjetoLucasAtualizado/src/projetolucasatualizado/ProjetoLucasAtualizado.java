/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetolucasatualizado;

import java.util.Scanner;

public class ProjetoLucasAtualizado {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
         int num1,valor,x=0,soma=0,maior=0,menor=0;
         System.out.println("Digite 1 Para programa Maior/Menor ou 2 para Saber sobre Negativos");
         num1 =entrada.nextInt();
            switch(num1){
                case 1:
                    System.out.println("Você está no programa Maior/Menor");
                    while(x<10){
                        System.out.println("Digite um valor");
                        valor =entrada.nextInt();
                        soma+=valor;
                        if(x==0){
                            maior=valor;
                            menor=valor;
                        }
                        if(valor>maior){
                            maior=valor;
                        }
                        if(valor<menor){
                            menor=valor;
                        }

                        x++;
                    }

                    System.out.println("A soma é: "+ soma + ", o maior valor é: " + maior + " e o menor valor é: " + menor);

                    break;


                case 2:
                    System.out.println("Você está no programa positivo/negativo");
                    float v1;
                    while(x<2){
                        System.out.println("Digite um valor");
                        v1 =entrada.nextFloat();
                        if(v1>0){
                        System.out.println("o " +(x+1)+"º número é positivo");
                        }
                        else{
                        System.out.println("o " +(x+1)+"º número é negativo");
                        }
                        x++;
                    }

                break;

                default:
                     System.out.println("Você digitou uma opção inválida");



            }
    }
    
}
