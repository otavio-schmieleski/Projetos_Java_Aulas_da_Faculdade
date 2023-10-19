
package com.mycompany.aula9exercicio1;

import java.util.Scanner;

public class Aula9exercicio1 {

    public static void main(String[] args) {
       Scanner ms = new Scanner(System.in);
        System.out.println("digite sua idade");
       int idade = ms.nextInt();
       if(idade < 16){
           System.out.println("não eleitor");
       }else if((idade >= 18)&&(idade < 65)){
           System.out.println("eleitor obrigatório");
       }else{
           System.out.println("eleitor facultativo");
       }
           
       
    }
}
