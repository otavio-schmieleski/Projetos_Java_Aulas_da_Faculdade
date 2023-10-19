
package com.mycompany.exercicio_06;

public class Exercicio_06 {

    public static void main(String[] args) {
        int c = 10;
        double f = 0;
        while(c <= 100){
            f = (c * 1.8) + 32;
            System.out.println("temperatura em graus celcius:  " + c);
            System.out.println( "temperatura em fahrenheit : " + f);
            c += 10;
            
        }
    }
}
