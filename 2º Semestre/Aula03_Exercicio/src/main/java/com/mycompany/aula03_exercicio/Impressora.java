package com.mycompany.aula03_exercicio;

public class Impressora {
    String texto;
    String texto1;
    
    public void Imprimir(){
        System.out.println("Sua impressão: " + texto);
    }
    
    public void Imprimirp1(){
        System.out.println("Sua Impressão: " + texto1);
    }
    
    Impressora(){
        if (this.texto1 == ""){
            System.out.println("Texto vazio");
        }
    }
}
