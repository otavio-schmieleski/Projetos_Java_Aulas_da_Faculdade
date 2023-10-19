
package com.mycompany.aula_online04;

public class ContaBanco {
    public int NumConta;
    protected boolean cc; //12
    private String dono;
    private float saldo;
    public float valorDeposito;
    private boolean status = false;
    
    public void abirConta(int n, String nome, boolean contaCorrente, float s){
        this.NumConta = n;
        this.dono = nome;
        this.cc = contaCorrente;
        this.saldo = s;
        status = true;
    }
    public void fecharConta(int n, String nome, boolean conta){
        this.NumConta = n;
        this.dono = nome;
        this.cc = conta;
        status = false;
    }
    public void depositar(int n, String nome, float v){
        this.NumConta = n;
        this.dono = nome;
        this.valorDeposito = v;
        this.saldo = this.saldo + this.valorDeposito;
    }
    public void sacar(int n, String nome, float v){
        this.NumConta = n;
        this.dono = nome;
        this.valorDeposito = v;
        if(this.valorDeposito <= this.saldo){
        this.saldo = this.saldo - this.valorDeposito;
        }else{
            System.out.println("SALDO INSUFICIENTE");
        }
    }
    public void pagarMensal(){
        if(this.cc == true){
            this.saldo = this.saldo - 12;
        }else{
            this.saldo = this.saldo - 20;
        }
    }
    public void status2 (){
        System.out.println(this.NumConta);
        if(this.cc == true){
            System.out.println("SUA CONTA É DO TIPO: !CONTA CORRENTE!");
        }else{
            System.out.println("SUA CONTA É DO TIPO: !CONTA POUPANCA!");
        }
        System.out.println(this.dono);
        System.out.println(this.saldo);
        if(this.status == true){
            System.out.println("SUA CONTA ESTÁ ATIVA");
        }else{
            System.out.println("SUA CONTA NAO ESTÁ ATIVA");
        }
        System.out.println("-------------------------------------------------");
    }
    
}
