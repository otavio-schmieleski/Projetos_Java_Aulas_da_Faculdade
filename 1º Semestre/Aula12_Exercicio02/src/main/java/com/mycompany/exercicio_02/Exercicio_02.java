
package com.mycompany.exercicio_02;

public class Exercicio_02 {

    public static void main(String[] args) {
        int soma = 0;
        int i = 2;
        do {    
            soma = soma + i;
            i += 2;
        }while(i<= 500);
        System.out.println(soma);
}
}
