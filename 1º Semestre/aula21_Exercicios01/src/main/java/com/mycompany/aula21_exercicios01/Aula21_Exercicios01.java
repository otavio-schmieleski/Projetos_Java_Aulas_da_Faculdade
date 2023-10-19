package com.mycompany.aula21_exercicios01;

import java.util.Scanner;

public class Aula21_Exercicios01 {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        boolean encontrou = true;
        int [] lista = new int [15];
           
       for(int i = 0; i < lista.length; i++){
           System.out.println("numero posição" + i);
           lista[i] = ms.nextInt();
       }
        System.out.println("informe algum numero para lista!");
        int pesquisar = ms.nextInt();
       for(int i = 0; i <= 13; i++){
           for(int j = 1; j < 14; j++){
               if(lista[i] > lista[j]){
                   int aux = lista[j];
                   lista[i] = lista[j];
                   lista[j] = aux;
               }
           }
       }
       int posIni = 0, posFim = 14, posMeio = (posIni + posFim) /2;
       while(posIni <= posFim){
           if(lista[posMeio] == pesquisar){
               System.out.println("numero encontrado na posição: " + posMeio);
               encontrou = false;
               break;
           }else if(posIni == posFim){
               break;
           }else if(lista[posMeio] < pesquisar){
               posIni = posMeio + 1;
           }else{
               posFim = posMeio - 1;
           }
           posMeio = (posIni + posFim) /2;
           
       }
       
       if(!encontrou){
           System.out.println("numero não encontrado");
       }
       
    }
}
