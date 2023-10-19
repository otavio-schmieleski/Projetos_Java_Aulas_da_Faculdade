
package com.mycompany.aula9excercicio2;

import java.util.Scanner;

public class Aula9excercicio2 {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        System.out.println("informe seu nome");
        String nome = ms.nextLine();
        System.out.println("informe o númeor do seu prato, 1: vegetariano, 2: peixe, 3: frango, 4: carne");
        int prato = ms.nextInt();
        int calorias = 0;
        switch (prato){
            case 1:
                    System.out.println("vegetariano");
                    calorias = calorias + 180;
                    break;
            case 2:// peixe
                    System.out.println("peixe");
                    calorias = calorias + 230;
                    break;
            case 3: //frango]
                    System.out.println("frango");
                    calorias = calorias + 250;
                    break;
            case 4: //carne
                System.out.println("carne");
                calorias = calorias + 350;
                break;       
            default:
                System.out.println(nome + ", você digitou um número inválido de prato");
        }
        
        System.out.println("informe o número da  sobremesa, 1: abacaxi, 2: sorvete diet, 3: mouse diet, 4: mouse chocolate");
        int sobremesa = ms.nextInt();
        switch (sobremesa){
            case 1: //abacaxi
                System.out.println("abacaxi");
                calorias = calorias + 75;
                break;
            case 2: // Sorvete diet
                System.out.println("sorvete diet");
                calorias = calorias + 110;
                break;
                
            case 3://mouse diet
                System.out.println("mouse diet");
                calorias = calorias + 170;
                break;
                
            case 4://mouse chocolate
                System.out.println("mouse chocolate");
                calorias = calorias + 200;
                break;
                
            default:
                System.out.println(nome + ", você digitou um número invalido para sobremesas");
                
        }
        System.out.println("digite um número de bebidas: 1: chá, 2: suco de laranja, 3: suco de melão, 4: refrigerant diet ");
        int bebidas = ms.nextInt();
        switch (bebidas){
            case 1://chá
                System.out.println("chá");
                calorias = calorias + 20;
                break;
            case 2://suco de laranja
                System.out.println("suco de laranja");
                calorias = calorias + 70;
                break;
            case 3://suco de melão
                System.out.println("suco de melão");
                calorias = calorias + 100;
                break;
            case 4://refrigerante diet
                System.out.println("refrigerante diet");
                calorias = calorias + 65;
                break;
            default:
                System.out.println(nome + ", você digitou um número inválido para as bebidas");
        }
        System.out.println(nome + " você consumiu em calorias:" + calorias);
        
    }
}
