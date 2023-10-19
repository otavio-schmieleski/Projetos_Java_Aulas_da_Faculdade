package com.mycompany.aula02_class_carro;

public class Aula02_Class_Carro {

    public static void main(String[] args) {
       Carro car = new Carro();
       car.Ligar();
       car.acelerar();
       car.ImprimirVelocidade();
       for (int i =0; i <= 5; i++){
           car.acelerar();
           car.ImprimirVelocidade();
       }
       
       Boleto bol = new Boleto();
       bol.setValorBoleto(2000);
       System.out.println(bol.getValorBoleto());
       bol.setValorPago(100);
       System.out.println(bol.getValorPago());
       bol.setVencido(true);
       System.out.println(bol.getVencido());
       bol.Pagar(1000);
       bol.ImrpimirBoleto();
        
    }
}
