package com.mycompany.vetores_aula21;

import java.util.Scanner;

public class Vetores_aula21 {

    public static void main(String[] args) {
        
            //    EXEMPLO 01
        
        
        String[] lista = new String []{"andre","carlos","kiko","golias","silva","silvo","waldir"};
        
        Scanner ms = new Scanner (System.in);
         System.out.println("informe o nome a pesquisar!");
        String nome = ms.nextLine();
        boolean encontrado = false;
        for(int i = 0; i < lista.length; i++){
            if(lista[i].equalsIgnoreCase(nome)){
                System.out.println("encontrei o nome encontrado na posição " + i + " da lista");
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("nome não encontrado o nome digitado: " + nome);
       }




                //EXEMPLO 02
        
        String[] lista2 = new String []{"andre","bernardo","carlos","golias","kiko","manuel","silva","silvo","waldir","yuri"};
        Scanner ms1 = new Scanner(System.in);
        System.out.println("digite o nome");
        String nome1 = ms1.nextLine();
        boolean encontrei = false;
        int posIni = 0, posFim = lista2.length-1;
        do{
            int posMeio = (posIni + posFim) / 2;
            if(lista[posMeio].equalsIgnoreCase(nome1)){
                System.out.println("encontrei o nome encontrado na posição " + posMeio + " da lista");
                encontrei = true;
                break;
            }
            if(lista2[posMeio].compareTo(nome1) > 0){
                posIni = posMeio + 1;
            }else{
                posFim = posMeio - 1;
            }
            
        }while(posIni != posFim);
        
        
        
        if(!encontrei){
            System.out.println("nome não encontrado");
        }
        
    }
}
