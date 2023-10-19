package com.mycompany.trabalho_ex03;

import java.util.Random;

public class Trabalho_Ex03 {

    public static void main(String[] args) {
       Random rn = new Random();
       int [] valoresJogos = new int[100];
        for (int i = 0; i < 100; i++) {
            int valores = rn.nextInt(100+(9900));
            valoresJogos[i] = valores;
        }
        int valores = rn.nextInt(100+(9900));       
       
    }
}
