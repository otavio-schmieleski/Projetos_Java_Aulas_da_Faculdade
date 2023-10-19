package com.mycompany.aula03_exercicio02;

public class Pessoa {
    private String nome;
    private String cpf;
    private double salario;
    public static int contador = 0;
    
    Pessoa(){
        contador ++;
       this.nome = "";
       this.cpf = "";
       this.salario = 0;
    }
    
    public void AumentarSalario(double valor){
        if(valor >= 0){
            this.salario += valor;
        }else{
            System.out.println("Valor invalido");
        }
    }
    
    public void ImprimirFichaFuncionario(){
        System.out.println("Nome:" + this.nome);
        System.out.println("cpf: " + this.cpf);
        System.out.println("salario: R$ " + this.salario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }
    
    
    
}
