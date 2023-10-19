package com.mycompany.banco_tentativa01;

import java.util.Scanner;

public class Banco_tentativa01 {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        System.out.println("cadastra-se no banco costa");
        System.out.println("digite seu nome: ");
        String nome = ms.nextLine();
        System.out.println("digite o numero do seu cpf");
        int cpf = ms.nextInt();
        System.out.println("digite sua idade");
        int idade = ms.nextInt();
        System.out.println("digite 1: para depositar e 2: para sacar");
        int ds = ms.nextInt();
        while(ds == 1){
            System.out.println("quantos reais o senhor quer depositar");
            int deposito = ms.nextInt();
            int saldo = 0;
            saldo = saldo + deposito;
            System.out.println("deseja continuar depositando 1: SIM ou 2: NAO");
            int cont_deposito = ms.nextInt();
            if (cont_deposito == 2){
                break;
            }
        }
    }
}
