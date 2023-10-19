package com.mycompany.aula_online04;

public class Aula_Online04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("nick", "amarela", 0.5f);
        c1.status();
        Caneta c2 = new Caneta("BIC", "VERMELHA", 1.0f);
        PC pc1 = new PC("I-9 5500G","20GB", "REDEDRAGON", "GTX 3060", "BM-450");
        pc1.status1();
        ContaBanco banco = new ContaBanco();
        banco.abirConta(1,"Otavio schmieleski costa", true, 1000f);
        banco.sacar(1, "otavio schmieleski costa", 1200f);
        banco.pagarMensal();
        banco.depositar(1, "otavio", 200f);
        banco.status2();
        ContaBanco p2 = new ContaBanco();
        p2.abirConta(2, "mareni", false, 2000f);
        p2.pagarMensal();
        p2.depositar(2, "mareni", 500);
        p2.status2();
    }
}
