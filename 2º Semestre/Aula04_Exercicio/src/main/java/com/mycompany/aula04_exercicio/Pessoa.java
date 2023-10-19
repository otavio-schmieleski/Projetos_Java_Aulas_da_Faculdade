package com.mycompany.aula04_exercicio;

public class Pessoa {
    private String nome;
    private int dtNascimento;
    
    public void calcularIdade(int data_de_nascimento){
       int data_nasc = 2023 - data_de_nascimento;
        System.out.println("Sua idade é de aproximadamente: " + data_nasc);
    }
}
