package com.mycompany.aula09_exercicio04;
import java.util.Scanner;
public class Aula09_Exercicio04 {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int calorias = 0;
        
        System.out.println("Informe o prato");
        int prato = ms.nextInt();
        switch (prato) {
            case 1: //vegetariado
                calorias = calorias + 180;
                break;
            case 2:  //peixe  
                calorias = calorias + 230;
                break;
            case 3: //frango            
                calorias = calorias + 250;
                break;
            case 4: //carne  
                calorias = calorias + 350;
                break;
            default:
                System.out.println("O seu zé, voce digitou errado.");
        }
        
        System.out.println("Informe a sobremesa");
        int sobremesa = ms.nextInt();
        switch (sobremesa) {
            case 1://abacaxi
                calorias = calorias + 75;
                break;
            case 2://sorvete
                calorias = calorias + 110;
                break;
            case 3://mouse diet
                calorias = calorias + 170;
                break;
            case 4://mouse chocolate
                calorias = calorias + 200;
                break;
            default:
                System.out.println("O seu zá, você digitou errado");
        }
        
        System.out.println("Informe a bebida");
        int bebida = ms.nextInt();
        switch (bebida) {
            case 1://chá
                calorias = calorias + 20;
                break;
            case 2://laranja
                calorias = calorias + 70;
                break;
            case 3://melão
                calorias = calorias + 100;
                break;
            case 4://refrigerante diet
                calorias = calorias + 65;
                break;
            default:
                System.out.println("O seu zé, você informou errado");
        }
        
        System.out.println("Total de calorias "+calorias);
    }
}
