package br.com.unimater.ead2023;

import java.util.Scanner;

public class Aula08_Exemplo02 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);       
        double salario = ms.nextDouble();
        double ns = 0;
        if( salario < 500 ){
            ns = salario * 0.15;
        }else{
            if( salario < 1000){
                ns = salario * 0.10;
            }else{
                ns = salario * 0.05;
            }
        }
        System.out.printf("NS: %.2f", ns);
    }
}
