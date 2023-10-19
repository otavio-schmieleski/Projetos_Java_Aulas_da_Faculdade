package com.mycompany.aula03_exercicio.Pasta_teste;

public class Email {
    String emailOrigim;
    String emailDestino;
    String texto;
    
    public void Imprimir(){
        System.out.println(texto);
    }
    
    public boolean Validar(){
        if ((!texto.isEmpty()) && (!emailDestino.isEmpty()) && (!emailOrigim.isEmpty())){
            return true;
        }else{
            return false;
        }
    }
    public void Enviar(){
        System.out.println("**************");
        System.out.println("Origim...: " + emailOrigim);
        System.out.println("Destino...: " + emailDestino);
        System.out.println("Texto...: " + texto);
        System.out.println("**************");

    }
}
