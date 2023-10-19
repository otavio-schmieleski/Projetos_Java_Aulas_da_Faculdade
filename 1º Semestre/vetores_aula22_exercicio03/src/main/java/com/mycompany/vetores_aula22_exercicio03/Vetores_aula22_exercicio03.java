package com.mycompany.vetores_aula22_exercicio03;

import java.util.Scanner;

public class Vetores_aula22_exercicio03 {

    public static void main(String[] args) {
        Scanner ms= new Scanner(System.in);
        String[][] alunos = new String[4][6];
        
        for (int i = 0; i <= 3; i++) {
            System.out.println("INFORME SEU NOME");
            alunos[i][0] = ms.nextLine();
            System.out.println("Informe a " + i +"nota");
            alunos[i][1] = ms.nextLine();
            System.out.println("Informe a " + i +"nota");
            alunos[i][2] = ms.nextLine();
            System.out.println("Informe a " + i +"nota");
            alunos[i][3] = ms.nextLine();
            System.out.println("Informe a " + i +"nota");
            alunos[i][4] = ms.nextLine();
            System.out.println("Informe a media geral: " + i);
            alunos[i][5] = ms.nextLine();
        }
        for (int i1 = 0; i1 <=2; i1++) {
            for (int i2 = i1 + 1; i2 <=3; i2++) {
                if ((alunos[i1][0].compareToIgnoreCase(alunos[i2][0])) > 0) {
                    String[] alunosAuxiliar = new String[6];
                    for (int k = 0; k <=5; k++) {
                        alunosAuxiliar[k] = alunos[i1][k];
                    }
                    for (int k1 = 0; k1 <= 5; k1++) {
                        alunos[i1][k1] = alunos[i2][k1];
                    }
                    for (int k2 = 0; k2 <= 5; k2++) {
                        alunos[i2][k2] = alunosAuxiliar[k2];
                    }
                }
            }
        }
        for (int i = 0; i <=3; i++) {
            for (int j = 0; j <= 5; j++) {
                System.out.print(" " + alunos[i][j]);
            }
            System.out.println("");
        }
    }
}
