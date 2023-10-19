
package com.mycompany.aula03_exercicio.Pasta_teste;

public class Main {
        public static void main(String[] args){
            Email em = new Email();
            em.emailOrigim = "Otaviomarcelo@gmail.com";
            em.emailDestino = "eduardo_maciel@gmail.com";
            em.texto = "Teste Java POO";
            em.Imprimir();
            if (em.Validar()) {
                em.Enviar();
            }
            
    }
}