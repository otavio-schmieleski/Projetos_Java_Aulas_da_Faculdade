
package com.mycompany.aula12_exercicio09;

import java.util.Scanner;

public class Aula12_Exercicio09 {

    public static void main(String[] args) {
        Scanner ms = new Scanner (System.in);
        double maior = -1000000;
        double menor = 100000;

     while (true){
         System.out.println("digite um numero");
        double num = ms.nextInt();
         if (num < 0){
             break;
        }else if(num > maior){
            maior = num;
        }else if(num < menor){
            menor = num;
        }

         }System.out.println("o maior numero diigitado pelo usúario foi : " + maior);
         System.out.println("o menor numero digitado pelo usuario foi : " + menor);
    
    }
    
}
