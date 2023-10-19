package com.mycompany.aula10_polimorfismo;

public class Aula10_Polimorfismo {

    public static void main(String[] args) {
        Pessoa p;
        System.out.println("***** Vendedor *****");
        p = new Vendedor();
        p.aplicarDesconto(6.0);
        System.out.println("\n");
        System.out.println("***** Gerente *****");
        p = new Gerente();
        p.aplicarDesconto(6.0);
    }
}
