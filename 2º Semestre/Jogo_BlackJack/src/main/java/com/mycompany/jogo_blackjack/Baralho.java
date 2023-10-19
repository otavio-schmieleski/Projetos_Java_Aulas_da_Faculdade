package com.mycompany.jogo_blackjack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas = new ArrayList<>();
    
    public List getCartas(){  
        return this.cartas;
    }
    
    public void adicionarCarta(String naipe, String valor, int peso){
        Carta carta = new Carta(naipe,valor,peso);
        this.cartas.add(carta);
    }
    
    public Carta pescarCarta(){
        int ultimaCarta = this.cartas.size() - 1;
        Carta c = this.cartas.get(ultimaCarta);
        this.cartas.remove(ultimaCarta);
        return c;
    }
    
    public void embaralhar(){
        Collections.shuffle(this.cartas);
    }
    
    public void limparCartas(){
        this.cartas.clear();
    }
    
    public boolean isEmpty(){
        return this.cartas.isEmpty();
    }
    public void adicionarCarta(Carta carta){
       this.cartas.add(carta);
    }
}   
