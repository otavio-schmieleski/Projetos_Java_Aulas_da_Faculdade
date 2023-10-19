package com.mycompany.vetores_aula22_exercicio02;

import java.util.Scanner;

public class Vetores_aula22_exercicio02 {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        String[][] agenda = new String[10][5];  //adicionar coluna e linha 
        for(int i = 0; i < 3; i++){
            
            System.out.println("INFORME O NOME DA PESSOA " + i);
            agenda[i][0] = ms.nextLine();   //neste caso a linha é o i e a coluna o 0
            
            System.out.println("ENDEREÇO: ");
            agenda[i][1] = ms.nextLine();
            
            System.out.println("CÓDIGO POSTAL: ");
            agenda[i][2] = ms.nextLine();
            
            System.out.println("BAIRRO: ");
            agenda[i][3] = ms.nextLine();
            
            System.out.println("TELEFONE: ");
            agenda[i][4] = ms.nextLine();
        }
        
        //ordenação da matriz
        for (int i1 = 0; i1 <=1; i1++) {
            for (int i2 = i1+ 1; i2 <= 2; i2++) {
               if(agenda[i1][0].compareToIgnoreCase(agenda[i2][0]) > 0){
                   String[] vetorAuxiliar = new String[5];
                   for (int k = 0; k <= 4; k++) {
                       vetorAuxiliar[k] = agenda[i1][k];
                    }
                    for (int k = 0; k <= 4; k++) {
                       agenda[i1][k] = agenda[i2][k];
                    }
                    for (int k = 0; k <= 4; k++) {
                       agenda[i2][0] = vetorAuxiliar[k];
                   }
                    
               }
            }
        }
        
        // impressão da matriz
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print(" "+ agenda[i][j]);
            }
            System.out.println("");
        }
    }
}
