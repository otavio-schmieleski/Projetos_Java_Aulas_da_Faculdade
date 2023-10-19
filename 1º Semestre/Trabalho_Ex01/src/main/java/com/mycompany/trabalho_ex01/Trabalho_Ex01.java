
package com.mycompany.trabalho_ex01;

import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;
import java.util.Random;

public class Trabalho_Ex01 {

    public static void main(String[] args) {
        Random rn = new Random();
        String letras = "abcdefghijklmnopqrstuvwxyz";
        String numeros ="0123456789";
        String caracter =".-?!@";
        String variaveis = letras + numeros + caracter;
        char[] senha = new char[10];
        int posicao = 0;
        int contador = 0;
            for (int i = 0; i < 2; i++) {
              posicao = rn.nextInt(letras.length());
              char selecao = toUpperCase(letras.charAt(posicao));
              senha[contador] = selecao;
              contador++;  
            }
            for (int i = 0; i < 2; i++) {
              posicao = rn.nextInt(letras.length());
              char selecao = toLowerCase(letras.charAt(posicao));
              senha[contador] = selecao;
              contador++;
            }
            for (int i = 0; i < 2; i++) {
              posicao = rn.nextInt(numeros.length());
              char selecao =(numeros.charAt(posicao));
              senha[contador] = selecao;
              contador++;
            }
            for (int i = 0; i < 1; i++) {
              posicao = rn.nextInt(caracter.length());
              char selecao =(caracter.charAt(posicao));
              senha[contador] = selecao;
              contador++;
            }
            for (int i = 0; i < 3; i++) {
              posicao = rn.nextInt(variaveis.length());
              char selecao =(variaveis.charAt(posicao));
              senha[contador] = selecao;
              contador++;
            }      
            System.out.print("SENHA ALEATÓRIA: ");
            System.out.println(senha);
    }
}
