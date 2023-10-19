package com.mycompany.jogo_blackjack;

public class BlackJack {
    private Baralho_Black_Jack baralho;
    private Jogador banca;
    private Jogador jogador1;
    
    public void start(){
        baralho = new Baralho_Black_Jack();
        banca = new Jogador("cassino");
        jogador1 = new Jogador("Otavio");
        
        for (int i=1; i<=4; i++){
            baralho.limparCartas();
            baralho.adicionarCarta(carta);
            baralho.embaralhar();
            Carta c = baralho.pescarCarta();
        }
    }
    
    public void imprimirPlacar(){
        System.out.println("*****PLACAR*****");
        System.out.println(banca.getNome());
        System.out.println(banca.getVitoria());
        System.out.println(jogador1.getNome() + " : " + jogador1.getVitoria());
        System.out.println("**********");

    }
}
