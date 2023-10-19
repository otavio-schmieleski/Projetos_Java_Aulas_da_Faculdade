
package com.mycompany.aula01_poo;


public class ContaBancaria {
    String correntista;
    float saldo = 0;
    String banco;
    String agencia;
    String conta;
    
    // metodo construtor
    public ContaBancaria(String correntista, float saldo, String banco, String agencia, String conta){
        this.correntista = correntista;
        this.saldo = saldo;
        this.banco = banco;
        this.agencia = agencia;
        this.conta = conta;
    }
    
    public ContaBancaria(String correntista){
        this.correntista = correntista;
        saldo = 0;
        banco = "nao sei";
        agencia = "1";
        conta = "1";
    }
}
