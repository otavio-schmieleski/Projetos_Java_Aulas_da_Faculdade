package com.mycompany.aula26_gado_de_corte;

import java.util.Random;
import java.util.Scanner;

public class Aula26_Gado_De_Corte {

    public static void main(String[] args) {
       Random rn = new Random();
       double padrao = 0;
       double soma =0 ;
       int boisMagros = 0, boisGordo = 0;
       Object [][] alimentacao = new Object[10][8];
        for (int i = 0; i < alimentacao.length; i++) {

            alimentacao[i][0] = "Gado " + i;
            alimentacao [i][1] = 10 + rn.nextDouble() * (13 -10);
            alimentacao [i][2] = 10 + rn.nextDouble() * (13 -10);
            alimentacao [i][3] = 10 + rn.nextDouble() * (13 -10);
            alimentacao [i][4] = 10 + rn.nextDouble() * (13 -10);
            alimentacao [i][5] = 10 + rn.nextDouble() * (13 -10);
            alimentacao [i][6] = 10 + rn.nextDouble() * (13 -10);
            alimentacao [i][7] = 10 + rn.nextDouble() * (13 -10);
            
            padrao = (((double)alimentacao[i][1] + (double)alimentacao[i][2] + (double)alimentacao[i][3] + (double)alimentacao[i][4] + (double)alimentacao[i][5] + (double)alimentacao[i][6] + (double)alimentacao[i][7])) / 7 ;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 8; j++) {
                if((double)alimentacao[i][j] <= 12){
                    boisMagros++;
                }else if((double) alimentacao[i][j] > 13){
                    boisGordo++;
                }
            }
        }
        System.out.println(boisGordo);
        System.out.println(boisMagros);
        if (padrao <= 12) {
            System.out.println("OK COM O REBANHO" +" media total:" + padrao);
        }else{
            System.out.println("REBANHO DESNUTRIDO media total: " + padrao);
        }
    }
}
