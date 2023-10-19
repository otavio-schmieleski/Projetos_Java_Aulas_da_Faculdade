
package com.mycompany.trabalho_ex02;

import java.util.Random;
import java.util.Scanner;

public class Trabalho_Ex02 {

    public static void main(String[] args) {
       Random rn = new Random();
       Scanner ms = new Scanner(System.in);
       boolean encontrou = false;
       int [] lista = new int[]{1980,1985,1990,1995,2000,2005,2010,2015,2020};
       System.out.println("Informe o ano do livro a pesquisar?");
       int pesquisa = ms.nextInt();
       int posIni = 0, posFim = 8, posMeio = (posIni + posFim) /2;
       int sorteio = rn.nextInt(100);
       while(posIni <= posFim){
           if(lista[posMeio] == pesquisa){
               System.out.println("numero encontrado na posicao: " + posMeio + " com o total de livros igual ha: " + sorteio);
               encontrou = true;
               break;
            }else if(lista[posMeio] < pesquisa){
                posIni = posMeio + 1;
            }else{
                posFim = posMeio - 1;
            }
            posMeio = (posIni + posFim) /2;
            }        
        if(!encontrou){
           System.out.println("numero nao encontrado");
       }
    }
          
}