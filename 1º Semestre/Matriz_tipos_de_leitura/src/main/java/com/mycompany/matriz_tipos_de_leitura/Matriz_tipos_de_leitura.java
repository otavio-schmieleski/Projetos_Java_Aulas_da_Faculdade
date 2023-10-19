package com.mycompany.matriz_tipos_de_leitura;

public class Matriz_tipos_de_leitura {

    private static Object Theread;

    public static void main(String[] args) throws InterruptedException {
        String[][] tabela = new String [9][7];
       // chamando as funcoes
        inicializarTabela(tabela);
         // forma linear
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                Thread.sleep(200);// delay
                tabela[i][j] = "x";
                imprimirTabela(tabela);
            }
        }
        
        inicializarTabela(tabela); // chamando funcao
        // forma linear inversa
        for (int i = 0; i < 9; i++) {
            for (int j = 6; j >= 0; j--) {
                Thread.sleep(200);// delay
                tabela[i][j] = "x";
                imprimirTabela(tabela);
            }
        }
        
        inicializarTabela(tabela);//chama funcao
        // forma linear de baixo para cima linear
        for (int i = 8; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                Thread.sleep(200);// delay
                tabela[i][j] = "x";
                imprimirTabela(tabela);
            }
        }
        
        inicializarTabela(tabela);//chama funcao
        // forma linear de baixo para cima linear inversa
        for (int i = 8; i >= 0; i--) {
            for (int j = 6; j >= 0; j--) {
                Thread.sleep(200);// delay
                tabela[i][j] = "x";
                imprimirTabela(tabela);
            }
        }
        
        inicializarTabela(tabela);//chama funcao
        // forma linear de baixo para cima linear
        for (int i = 8; i >= 0; i--) {
            for (int j = 0; j < 7; j++) {
                Thread.sleep(200);// delay
                tabela[i][j] = "x";
                imprimirTabela(tabela);
            }
        }
        
        inicializarTabela(tabela);//chama funcao
        // forma de coluna de cima para baixo em  coluna
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 9; j++) {
                Thread.sleep(200);// delay
                tabela[j][i] = "x";
                imprimirTabela(tabela);
            }
        }
        
        inicializarTabela(tabela);//chama funcao
        // forma de coluna de cima para baixo coluna oposta
        for (int i = 6; i >=0; i--) {
            for (int j = 0; j < 9; j++) {
                Thread.sleep(200);// delay
                tabela[j][i] = "x";
                imprimirTabela(tabela);
            }
        }
        
        inicializarTabela(tabela);//chama funcao
        // forma de coluna de baixo para cima como coluna
        for (int i = 0; i < 7; i++) {
            for (int j = 8; j >= 0; j--) {
                Thread.sleep(200);// delay
                tabela[j][i] = "x";
                imprimirTabela(tabela);
            }
        }
        
        inicializarTabela(tabela);//chama funcao
        // forma de coluna de baixo para cima coluan inversa
        for (int i = 6; i >= 0; i--) {
            for (int j = 8; j >= 0; j--) {
                Thread.sleep(200);// delay
                tabela[j][i] = "x";
                imprimirTabela(tabela);
            }
        }
         
        
        
        
    }
    private static void imprimirTabela(String tabela[][]){
        //metodo de impresão
        System.out.println("\n----------------------");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(" " + tabela[i][j]);
            }
            System.out.print("\n");
        }
        System.out.print("----------------------\n");
    }
    private static void inicializarTabela(String tabela[][]){
        // inicializando a matriz 
         for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 7; j++) {
                tabela[i][j] = "o";
            }
            System.out.print("\n");
        }
    }
}
