
package com.mycompany.aula13_exercicio01;

import java.util.Scanner;

public class Aula13_Exercicio01 {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        Scanner ms2 = new Scanner(System.in);
        
        String nome;
        String bairro, rua;
        double numeroRua, saldo;
        
        do{
            
           System.out.println("Informe o seu nome: "); // INFORMA O NOME COMPLETO
           nome = ms.nextLine(); 
        }while(nome.equals("")); // VEREFICA SE O USUARIO DIGITOU ALGO 
        
        System.out.println("Informe o endereço");
        
        System.out.println("Bairro: "); // INFORMAR O BAIRRO
        bairro = ms.nextLine();
        
        System.out.println("Rua: "); // INFORMAR A RUA
        rua = ms.nextLine();
        
        System.out.println("Número: "); // INFORMAR O NÚMERO DA RESIDENCIA
        numeroRua = ms2.nextDouble();
        
        do{
        System.out.println("Informe seu saldo: "); // INFORMAR O SALDO INICIAL
        saldo = ms2.nextDouble();
        }while(saldo <= 0);
        
        String resposta = "";
        int menu;
        int retirada;
        int deposito;
        int i = 0;
        
        System.out.println("1 - Consultar saldo, 2 - Fazer retirada, 3 - Realizar depósito, 4 - Extrato, 5 - Consultar endereço, 6 - Alterar endereço, 9 - sair");
        do{
            System.out.println("Informe uma operação: "); // INFORMAR O NUMERO DA OPERAÇÃO
            menu = ms2.nextInt();
            
            if((menu >= 1) && (menu <= 9)){
                switch(menu){

                    case 1: // CONSULTAR O SALDO
                        System.out.println("Saldo atual: "+saldo);
                        System.out.println("Deseja continuar? ");
                        resposta = ms.nextLine();
                        break;

                    case 2: // FAZER A RETIRADA
                        System.out.println("Valor do saque: ");
                        retirada = ms2.nextInt();
                        if(retirada <= saldo){ // VEREFICA SE O VALOR DA RETIRADA É MENOR DO QUE O SALDO
                            System.out.println("Saldo atual: "+(saldo - retirada));
                            i++; // CONTROLA AS QUANTIDADES DE OPERAÇÕES
                            saldo = saldo - retirada;
                            System.out.println("Deseja continuar? ");// PEDE AO USUARIO SE DESEJAR REALIZAR OUTRA OPERAÇÃO
                            resposta = ms.nextLine();
                        }else{
                            System.out.println("Saldo insuficiente");
                            System.out.println("Deseja fazer outra operação? ");
                            resposta = ms.nextLine();
                        }
                        break;

                    case 3: // FAZER DEPOSITO
                        System.out.println("Valor do depósito"); 
                        deposito = ms2.nextInt();
                        if(deposito >= 0){ // VEREFICA SE O VALOR E MAOIR DO QUE 0
                            System.out.println("Saldo atual: "+(saldo+deposito));
                            i++; // CONTROLA AS QUANTIDADES DE OPERAÇÕES
                            System.out.println("Deseja continuar? ");// PEDE AO USUARIO SE DESEJAR REALIZAR OUTRA OPERAÇÃO
                            resposta = ms.nextLine();
                        }else{
                            System.out.println("Operação inválida");
                            System.out.println("Deseja continuar? ");// PEDE AO USUARIO SE DESEJAR REALIZAR OUTRA OPERAÇÃO
                            resposta = ms.nextLine();
                        }
                        break;

                    case 4: // INFORMA AS QUANTIDADES DE OPERAÇÕES REALIZADAS PELO USUARIO
                        System.out.println("Quantidade de operações realizadas (Depósito/Retirada): "+i); 
                        System.out.println("Deseja continuar? ");// PEDE AO USUARIO SE DESEJAR REALIZAR OUTRA OPERAÇÃO
                        resposta = ms.nextLine();
                        break;

                    case 5: // INFORMAR O ENDEREÇO DO USUARIO
                        System.out.println("Consultar endereço: \n"+
                                           "Bairro: "+bairro+"\n"+
                                           "Rua: "+rua+"\n"+
                                           "Número: "+numeroRua);
                        System.out.println("Deseja continuar? ");// PEDE AO USUARIO SE DESEJAR REALIZAR OUTRA OPERAÇÃO
                        resposta = ms.nextLine();
                        break;

                    case 6:// ALTERA O ENDEREÇO DO USUARIO
                        System.out.println("Alterar endereço, digite seu bairro: ");
                        bairro = ms.nextLine();
                        System.out.println("Digite sua rua: ");
                        rua = ms.nextLine();
                        System.out.println("Digite o número: ");
                        numeroRua = ms2.nextDouble();
                        System.out.println("Endereço atualizado: "+bairro+", "+rua+", "+numeroRua);
                        System.out.println("Deseja continuar? ");// PEDE AO USUARIO SE DESEJAR REALIZAR OUTRA OPERAÇÃO
                        resposta = ms.nextLine();
                        break;
                    
                    case 7:
                        System.out.println("Operação inválida, deseja continuar? ");// PEDE AO USUARIO SE DESEJAR REALIZAR OUTRA OPERAÇÃO
                        resposta = ms.nextLine();
                        break;
                        
                    case 8:
                        System.out.println("Operação inválida, deseja continuar? ");// PEDE AO USUARIO SE DESEJAR REALIZAR OUTRA OPERAÇÃO
                        resposta = ms.nextLine();
                        break;

                    case 9: // SAIR DA OPERAÇÃO
                        System.out.println("fim");
                        break;
                    }
            }else{
                System.out.println("Operação inválida, deseja continuar? ");// PEDE AO USUARIO SE DESEJAR REALIZAR OUTRA OPERAÇÃO
                resposta = ms.nextLine();
            }
        }while(resposta.equals("sim")); // VEREFICA SE A RESPOSTA FOR SIM, CONTINUAR A FAZER OUTRAS OPERAÇÕES 
    }
}