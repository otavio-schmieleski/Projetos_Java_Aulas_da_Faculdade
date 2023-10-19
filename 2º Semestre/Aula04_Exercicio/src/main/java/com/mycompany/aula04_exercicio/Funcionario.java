package com.mycompany.aula04_exercicio;

public class Funcionario extends Pessoa{
    private double salario;
    
    public void receberAumento(double aumento){
        this.salario += aumento;
        System.out.println("Seu novo salario é de : " + this.salario);
    }
}
