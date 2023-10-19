package com.mycompany.aula04_exercicio;

public class Zelador extends Funcionario{
    private String nome;
    private double salario;
    
    
    public void mudarFuncao(String func){
        String funcao = func;
        System.out.println("Sua nova função é: " + funcao);
    }
    
}
