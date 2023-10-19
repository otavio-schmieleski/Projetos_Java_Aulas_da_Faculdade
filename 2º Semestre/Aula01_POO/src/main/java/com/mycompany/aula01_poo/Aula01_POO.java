package com.mycompany.aula01_poo;

public class Aula01_POO {

    public static void main(String[] args) {
//        ContaBancaria ct;
//        ct = new ContaBancaria();
//        ct.correntista = "otavio";
//        ct.banco = "Sicredi";
//        ct.agencia = "0740";
//        ct.conta = "123456";
//        ct.saldo = 1000;
//        
//          
//        System.out.println("Nome: " +ct.correntista);
//        System.out.println("Banco: "+ct.banco);
//        System.out.println("Agencia: "+ct.agencia);
//        System.out.println("Conta:"+ct.conta);
//        System.out.println("Saldo: "+ct.saldo);
            
        ContaBancaria ct1 = new ContaBancaria("Otavio Marcelo", 100, "Sicredi", "0740", "123456");
        System.out.println(ct1.agencia+"\n"+ct1.banco+"\n"+ct1.conta+"\n"+ct1.correntista+"\n"+ct1.saldo);
        ContaBancaria ct2 = new ContaBancaria("Otavio");
        System.out.println(ct2.correntista);
        
               
    }
}
