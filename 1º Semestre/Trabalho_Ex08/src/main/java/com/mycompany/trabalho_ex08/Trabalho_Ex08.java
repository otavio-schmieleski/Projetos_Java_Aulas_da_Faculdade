package com.mycompany.trabalho_ex08;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Trabalho_Ex08 {

    public static void main(String[] args) {
        List<String> palavras = new ArrayList<>();
        palavras.add("cachorro");
        palavras.add("cachorro");
        palavras.add("gato");
        palavras.add("gato");
        palavras.add("elefante");
        palavras.add("elefante");
        palavras.add("leão");
        palavras.add("leão");
        palavras.add("tigre");
        palavras.add("tigre");
        palavras.add("girafa");
        palavras.add("girafa");
        palavras.add("macaco");
        palavras.add("macaco");
        palavras.add("zebra");
        palavras.add("zebra");
        palavras.add("cobra");
        palavras.add("cobra");
        palavras.add("aranha");
        palavras.add("aranha");

        String[] jogo = new String[palavras.size()];
        Random rn = new Random();

        for (int i=palavras.size()-1; i>=0 ; i--) {
        int numAleatorio;
        if (i>0){
        numAleatorio = rn.nextInt(i);
        }else{
        numAleatorio = 0;
        }
        jogo[i] = palavras.get(numAleatorio);
        palavras.remove(numAleatorio);
        }
        for (String palavra : jogo) {
        System.out.println(palavra);
        }
        //Continue o código a partir desse ponto
        //buscando impressão das combinações de
        //palavras iguais
        
        for (int i = 0; i < jogo.length; i++) {
            for (int j = i + 1; j <jogo.length; j++) {
                if(jogo[i].equals(jogo[j])){
                    System.out.println(jogo[i]+ " Encontrado na posicao: " + i + " | " + jogo[j] + " encontrado na posicao:" +" " + j);
                }
            }
        }
    }
}
