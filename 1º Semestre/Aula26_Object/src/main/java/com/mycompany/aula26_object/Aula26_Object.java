package com.mycompany.aula26_object;

import java.util.Scanner;

public class Aula26_Object {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        Scanner ms1 = new Scanner(System.in);
        String nome;
        // utilizando object
        Object [][] listaDeAlunos = new Object [3][4];
        for (int i = 1; i <= listaDeAlunos.length; i++) {
            System.out.println("INFORME O NOME DO " + i + " ALUNO");
            listaDeAlunos[i][0] = ms.nextLine();     
            System.out.println("Informe a primeira nota");
            listaDeAlunos[i][1] = ms1.nextDouble();
            System.out.println("Informe a segunda nota");
            listaDeAlunos[i][2] = ms1.nextDouble();
        }
        for (int i = 0; i < listaDeAlunos.length; i++) {
            double media = 0;
            media = ((double)listaDeAlunos[i][1] + (double)listaDeAlunos[i][2]) / 2;
            listaDeAlunos[i][3] = media;
        }
        System.out.println("-------------------");
        for (int i = 0; i < listaDeAlunos.length; i++) {
            System.out.print("NOME: " + listaDeAlunos[i][0] + ", nota 1: " + listaDeAlunos[i][1] + ", nota 2: " + listaDeAlunos[i][2] + ", Media: " + listaDeAlunos[i][3]+"\n");
            
        }
    }
}
