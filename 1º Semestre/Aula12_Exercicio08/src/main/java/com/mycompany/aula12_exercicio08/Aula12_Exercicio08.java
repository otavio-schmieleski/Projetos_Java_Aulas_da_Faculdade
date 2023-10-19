
package com.mycompany.aula12_exercicio08;

import java.util.Scanner;

public class Aula12_Exercicio08 {

    public static void main(String[] args) {
        Scanner ms = new Scanner (System.in);
        System.out.println("digite um número");
        int valor = ms.nextInt();
        int soma = 0;
        int media = 0;
        int mediaTotal = 0;
        int valor1;
        while(valor >= 0){
            soma = soma + valor;
            media = media + 1;
            mediaTotal = soma / media;
            Scanner ms2 = new Scanner(System.in);
            System.out.println("digite um valor");
            valor1 = ms2.nextInt();
            if (valor1 <=  0){
                break;
            }
        }
        System.out.println("a media dos numeros digitados são: " + mediaTotal);
        System.out.println(" a soma de todos os valores digitados são: " + soma);
            
    }
}
