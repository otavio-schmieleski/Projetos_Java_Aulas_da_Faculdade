
package com.mycompany.aula12_exercicios07;

import java.math.BigInteger;

public class Aula12_Exercicios07 {

    public static void main(String[] args) {
        BigInteger soma = new BigInteger("0");
        BigInteger numero = new BigInteger("2");
        BigInteger g = new BigInteger("1");
       for (int i = 1; i <= 64; i++){
           soma = soma.add(g);
           g = g.multiply(numero);
       }
        System.out.println("total de grãos: " + soma);
    }
}
