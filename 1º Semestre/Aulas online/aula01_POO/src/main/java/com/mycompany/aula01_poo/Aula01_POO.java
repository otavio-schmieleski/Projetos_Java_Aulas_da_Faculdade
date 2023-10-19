
package com.mycompany.aula01_poo;

public class Aula01_POO {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "bic";
        c1.cor = "azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();
        
        
        System.out.println("\n\n\n");
        
        
        Caneta c2 = new Caneta();
        c2.modelo = "faber-castell";
        c2.cor = "preta";
        c2.ponta = 1f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
        
        
        System.out.println("\n\n\n");
        
        
        Computador pc1 = new Computador();
        pc1.modelo = "lenovo";
        pc1.placa_video = "GTX 3060ti";
        pc1.processador = "RYZEN 9";
        pc1.memoria = 16;
        pc1.statusPc();
    }
}
