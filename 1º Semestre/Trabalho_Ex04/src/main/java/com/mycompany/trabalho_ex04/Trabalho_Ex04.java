package com.mycompany.trabalho_ex04;

import java.util.Arrays;
import java.util.Scanner;

public class Trabalho_Ex04 {

    public static void main(String[] args) {
        double[] pacotes = new double[] {493, 501, 500, 510, 499, 495, 505, 506, 498, 494};
                
        Arrays.sort(pacotes);
        
        double menor = pacotes[0];
        double maior = pacotes[9];
        double variacao = (maior - menor) * 100 / maior;
        
        int acima = 0, abaixo = 0;
        double pesoPadrao = 500;
        
        for(double pacote : pacotes){
            if(pacote > pesoPadrao){
                acima++;
            }else if(pacote < pesoPadrao){
                abaixo++;
            }
        }
        
        if(variacao > 20){
            System.out.println("Lote com alta divergência");
        }else{
            System.out.println("Lote padrão");
        }
        
        System.out.printf("Variação: %.2f%n",variacao);
        System.out.println("Pacotes acima: "+acima);
        System.out.println("Pacotes abaixo: "+abaixo);
        
    }
}
