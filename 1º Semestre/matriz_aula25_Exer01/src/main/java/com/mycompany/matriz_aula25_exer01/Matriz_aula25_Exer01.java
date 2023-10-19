
package com.mycompany.matriz_aula25_exer01;

import java.util.Random;

public class Matriz_aula25_Exer01 {

    public static void main(String[] args) {
        Random rn = new Random();
        int [][] numero = new int [9][7];
        int contador = 0;
        int soma = 0;
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                numero[i][j] = rn.nextInt(100);
                System.out.print(" " + numero[i][j]);
                soma = soma + numero[i][j];
                contador++;
            }
            System.out.println("");
        }
        int media = (soma / contador);
        System.out.println(media);
    }
}
