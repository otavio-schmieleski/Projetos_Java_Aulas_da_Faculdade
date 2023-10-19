package com.mycompany.aula08_exemplo01;

import java.util.Scanner;

public class Aula08_Exemplo01 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        System.out.println("Informe o nome");
        String nome = ms.nextLine();
        switch (nome) {
            case "jos":
                System.out.println("OK");
                break;
            case "abc":
                System.out.println("QUASE");
                break;
            case "eles":
                System.out.println("NAO");
                break;
            default:
                System.out.println("NENHUM");
                break;
        }
    }
}
