package com.mycompany.jogo_blackjack;

import java.util.List;

public class Jogador {
    private String nome;
    private int vitorias;
    private int pontos;
    private List<Carta> cartas;
    
    Jogador(String nome){
        this.nome = nome;
        this.pontos = 0;
    }
    public String getNome(){
        return this.nome;
    }
    
    public int getpontos(){
        return this.pontos;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setPontos(int pontos){
        this.pontos += pontos;
    }
    public void adicionarCarta(Carta carta){
        this.cartas.add(carta);
    }
    public void limparCarta(){
        this.cartas.clear();
    }
    public void adicionarVitoria(){
        this.vitorias += 1;
    }
    
    public int getVitoria(){
        return this.vitorias;
    }
    
    public int getSomaMao(){
    
        int somatorio = 0;
        for (Carta c : cartas){
            somatorio += c.getPeso();
        }
        if (somatorio <= 21){
            return somatorio;
        }else{
            return 0;
        }
    }
    
}
