
package com.mycompany.aula12_exercicios10;

import java.util.Scanner;

public class Aula12_Exercicios10 {

    public static void main(String[] args) {
      Scanner ms = new Scanner (System.in);
      String continuar;
      double area;
      double areaTotal = 0;
      do{
          System.out.println("digite o comodo: ");
          String comodo = ms.nextLine();
          
          System.out.println("largura do comodo: " + comodo);
          double largura = ms.nextDouble();
          
          System.out.println("altura do comodo: " + comodo );
          double comprimento = ms.nextDouble();
          
           area = (largura * comprimento);
            System.out.println("nome: " + comodo + "\n" +
                                "comprimento: " + comprimento + "\n" +
                                "largura:" + largura + "\n" +
                                "area: " + area);
            
            areaTotal = areaTotal + area;
            
          Scanner ms2 = new Scanner(System.in);
          System.out.println("deseja continuar calculando outros comodos: SIM / NÃO");
          continuar = ms2.nextLine();
          
      }while(continuar.equals("SIM"));
       
      
    }
}
