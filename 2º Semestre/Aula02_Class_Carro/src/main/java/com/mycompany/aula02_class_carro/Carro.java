package com.mycompany.aula02_class_carro;


public class Carro {
    private double velocidade;
    private boolean ligado;

    Carro(){
    velocidade = 0;
    ligado = false;
}
    void acelerar(){
        if (this.ligado == true){
            this.velocidade += 20;
        }else{
            System.out.println("O carro está desligado");
        }
    }
    
    void Ligar() {
        if (this.ligado == false){
            this.ligado = true;
        }else{
            this.ligado = false;
        }
    }

    void ImprimirVelocidade(){
        if (this.velocidade >= 110.0){
            System.out.println("A VELOCIDADE ESTÁ ACIMA DO LIMITE PERMITIDO DA VIA DE 110KM");
            System.out.println("SUA VELOCIDADE ATUAL: "+ this.velocidade + "KM/h");
        }else{
            System.out.println("VELOCIDADE: " + this.velocidade + "km/h");
        }
    }
}

