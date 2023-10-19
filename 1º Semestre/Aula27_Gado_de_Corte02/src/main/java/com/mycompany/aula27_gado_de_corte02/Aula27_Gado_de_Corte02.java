package com.mycompany.aula27_gado_de_corte02;

import java.util.Random;
import java.util.Scanner;

public class Aula27_Gado_de_Corte02 {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        Random rn = new Random();
        int boiBig = 0;
        int boiSma = 0;
        System.out.println("Informe o tamanho do rebanho");
        int tamanhoRebanho = ms.nextInt();
        Object[][] rebanho = new Object[tamanhoRebanho][9];
        for (int i = 0; i < tamanhoRebanho; i++) {
            rebanho[i][0] = "Gado " + i+ "º";
            double soma = 0;
            for (int j = 1; j < 8; j++) {
                rebanho[i][j] = 10 + (rn.nextDouble() * (13-10));
                soma += (double)rebanho[i][j];
                System.out.printf(" %.2f", rebanho[i][j]);
            }
            System.out.println(" ");
            rebanho[i][8] = soma / 7;
            
            if((double)rebanho[i][8] >= 12){
                boiBig++;
            }else{
                boiSma++;
            }
        }
        double percentualBig = 100 * boiBig / tamanhoRebanho;
        
        if(percentualBig >= 60){
            System.out.println("Precisamos dobrar a meta " + percentualBig + "%");
        }else{
            System.out.println("Meta alcancada " + percentualBig + "%");
        }
    }
}
