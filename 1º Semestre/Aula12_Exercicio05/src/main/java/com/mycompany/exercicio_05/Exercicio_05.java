
package com.mycompany.exercicio_05;

import static java.util.stream.IntStream.range;

public class Exercicio_05 {

    public static void main(String[] args) {
       int atual =0;
       int anterior =1;
       int proximo;
       for (int i =1;i <= 15; i++){
        proximo = atual + anterior;
        System.out.println(proximo);
        anterior = atual;
        atual = proximo;
       }
    }
}
