package com.mycompany.trabalho_ex05;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Trabalho_Ex05 {

    public static void main(String[] args) {
      Scanner ms = new Scanner(System.in);
        String[] senha = new String[10];    
        for (int i = 0; i < 10; i++) {
            System.out.println("Informe os caracteres da sua senha deve conter 10 caracteres");
            senha[i] = ms.nextLine();
        }
        System.out.println("\n");
        for(String nome : senha){
            System.out.print(nome);
        }
        Collections.reverse(Arrays.asList(senha));
        System.out.println("\n");
        for(String nome : senha){
            System.out.print(nome);
        }
        
    }
}

