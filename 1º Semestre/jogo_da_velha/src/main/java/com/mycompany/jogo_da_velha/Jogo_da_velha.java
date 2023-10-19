package com.mycompany.jogo_da_velha;

import java.util.Scanner;

public class Jogo_da_velha {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        String P1 = " ", P2 = " ", P3 = " ", P4 = " ", P5 = " ", P6 = " ", P7 = " ", P8 = " ", P9 = " ";
        
        System.out.println("**BEM VINDO AO JOGO DA VELHA**");
        
        System.out.println("|"+P1+"|"+P2+"|"+P3+"|\n"
                          +"|"+P4+"|"+P5+"|"+P6+"|\n"
                          +"|"+P7+"|"+P8+"|"+P9+"|\n");
        
        int posicao;
        boolean jogadaValida = false;
        int jogadorDaVez = 1;
        
            do{
                jogadorDaVez = 1;
                System.out.println("Informe sua jogada Jogador: "+jogadorDaVez+" (1 a 9)");
                posicao = ms.nextInt();
                
                if(posicao == 1){
                    if(P1.equals(" ")){
                        jogadaValida = true;
                        P1 = "x";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 2){
                    if(P2.equals(" ")){
                        jogadaValida = true;
                        P2 = "x";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 3){
                    if(P3.equals(" ")){
                        jogadaValida = true;
                        P3 = "x";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 4){
                    if(P4.equals(" ")){
                        jogadaValida = true;
                        P4 = "x";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 5){
                    if(P5.equals(" ")){
                        jogadaValida = true;
                        P5 = "x";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 6){
                    if(P6.equals(" ")){
                        jogadaValida = true;
                        P6 = "x";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 7){
                    if(P7.equals(" ")){
                        jogadaValida = true;
                        P7 = "x";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 8){
                    if(P8.equals(" ")){
                        jogadaValida = true;
                        P8 = "x";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 9){
                    if(P9.equals(" ")){
                        jogadaValida = true;
                        P9 = "x";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }
                
                if(P1.equals("x")&& P2.equals("x") && P3.equals("x")){
                    System.out.println("voce ganhou o jogo Jogador numero 1º (X)");
                    jogadaValida = false;
                    break;
                }else if (P1.equals("x")&& P4.equals("x") && P7.equals("x")){
                    System.out.println("voce ganhou o jogo Jogador numero 1º (X)");
                    jogadaValida = false;
                    break;
                }else if (P7.equals("x")&& P8.equals("x") && P9.equals("x")){
                    System.out.println("voce ganhou o jogo Jogador numero 1º (X)");
                    jogadaValida = false;
                    break;
                }else if (P9.equals("x")&& P6.equals("x") && P3.equals("x")){
                    System.out.println("voce ganhou o jogo Jogador numero 1º (X)");
                    jogadaValida = false;
                    break;
                }else if (P7.equals("x")&& P5.equals("x") && P3.equals("x")){
                    System.out.println("voce ganhou o jogo Jogador numero 1º (X)");
                    jogadaValida = false;
                    break;
                }else if (P1.equals("x")&& P5.equals("x") && P9.equals("x")){
                    System.out.println("voce ganhou o jogo Jogador numero 1º (X)");
                    jogadaValida = false;
                    break;
                }else if (P4.equals("x")&& P5.equals("x") && P6.equals("x")){
                    System.out.println("voce ganhou o jogo Jogador numero 1º (X)");
                    jogadaValida = false;
                    break;
                }else if (P2.equals("x")&& P5.equals("x") && P8.equals("x")){
                    System.out.println("voce ganhou o jogo Jogador numero 1º (X)");
                    jogadaValida = false;
                    break;
                }
                
                System.out.println("|"+P1+"|"+P2+"|"+P3+"|\n"
                                  +"|"+P4+"|"+P5+"|"+P6+"|\n"
                                  +"|"+P7+"|"+P8+"|"+P9+"|\n");
                
                jogadorDaVez++;
                System.out.println("Informe sua jogada Jogador: "+jogadorDaVez+" (1 a 9)");
                posicao = ms.nextInt();
                
                if(posicao == 1){
                    if(P1.equals(" ")){
                        jogadaValida = true;
                        P1 = "o";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 2){
                    if(P2.equals(" ")){
                        jogadaValida = true;
                        P2 = "o";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 3){
                    if(P3.equals(" ")){
                        jogadaValida = true;
                        P3 = "o";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 4){
                    if(P4.equals(" ")){
                        jogadaValida = true;
                        P4 = "o";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 5){
                    if(P5.equals(" ")){
                        jogadaValida = true;
                        P5 = "o";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 6){
                    if(P6.equals(" ")){
                        jogadaValida = true;
                        P6 = "o";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 7){
                    if(P7.equals(" ")){
                        jogadaValida = true;
                        P7 = "o";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 8){
                    if(P8.equals(" ")){
                        jogadaValida = true;
                        P8 = "o";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }else if(posicao == 9){
                    if(P9.equals(" ")){
                        jogadaValida = true;
                        P9 = "o";
                    }else{
                        System.out.println("Jogada Inválida");
                    }
                }
                
                if(P1.equals("o")&& P2.equals("o") && P3.equals("o")){
                    System.out.println("voce ganhou o jogo Jogador numero 2º (O)");
                    jogadaValida = false;
                    break;
                }else if (P1.equals("o")&& P4.equals("o") && P7.equals("o")){
                    System.out.println("voce ganhou o jogo Jogador numero 2º (O)");
                    jogadaValida = false;
                    break;
                }else if (P7.equals("o")&& P8.equals("o") && P9.equals("o")){
                    System.out.println("voce ganhou o jogo Jogador numero 2º (O)");
                    jogadaValida = false;
                    break;
                }else if (P9.equals("o")&& P6.equals("o") && P3.equals("o")){
                    System.out.println("voce ganhou o jogo Jogador numero 2º (O)");
                    jogadaValida = false;
                    break;
                }else if (P7.equals("o")&& P5.equals("o") && P3.equals("o")){
                    System.out.println("voce ganhou o jogo Jogador numero 2º (O)");
                    jogadaValida = false;
                    break;
                }else if (P1.equals("o")&& P5.equals("o") && P9.equals("o")){
                    System.out.println("voce ganhou o jogo Jogador numero 2º (O)");
                    jogadaValida = false;
                    break;
                }else if (P4.equals("o")&& P5.equals("o") && P6.equals("o")){
                    System.out.println("voce ganhou o jogo Jogador numero 2º (O)");
                    jogadaValida = false;
                    break;
                }else if (P2.equals("o")&& P5.equals("o") && P8.equals("o")){
                    System.out.println("voce ganhou o jogo Jogador numero 2º (O)");
                    jogadaValida = false;
                    break;
                }
                System.out.println("|"+P1+"|"+P2+"|"+P3+"|\n"
                              +"|"+P4+"|"+P5+"|"+P6+"|\n"
                              +"|"+P7+"|"+P8+"|"+P9+"|\n");
            }while(jogadaValida == true);
            System.out.println("|"+P1+"|"+P2+"|"+P3+"|\n"
                              +"|"+P4+"|"+P5+"|"+P6+"|\n"
                              +"|"+P7+"|"+P8+"|"+P9+"|\n");
        }
}