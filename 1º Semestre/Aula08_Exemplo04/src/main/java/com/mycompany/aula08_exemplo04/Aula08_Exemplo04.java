package com.mycompany.aula08_exemplo04;
import java.util.Scanner;
public class Aula08_Exemplo04 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        System.out.println("Quantidade de pessoas");
        int tamanhoFamilia = ms.nextInt();
        System.out.println("Salario bruto total");
        double salario = ms.nextDouble();
        double salarioPerCapta = salario / tamanhoFamilia;
        double ir = 0;
        if(salarioPerCapta < 1903.98){
            ir = 0;
        }else if ((salarioPerCapta>=1903.98)&&(salarioPerCapta<2826.66)){
            ir = salario * 0.075;
        }//...continuar...
    }
}
