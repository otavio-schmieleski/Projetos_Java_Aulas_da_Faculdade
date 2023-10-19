
package com.mycompany.aula01_poo;

public class Computador {
    String modelo;
    String placa_video;
    String processador;
    int memoria;
    
    void statusPc(){
        System.out.println("SEU PC TEM AS SEGUINTES CONFIGURAÇÕES");
        System.out.println("modelo: " + this.modelo);
        System.out.println("Placa de Video: " + this.placa_video);
        System.out.println("Processador: " + this.processador);
        System.out.println("Memoria Ram: " + this.memoria + "GB");
    }
}
