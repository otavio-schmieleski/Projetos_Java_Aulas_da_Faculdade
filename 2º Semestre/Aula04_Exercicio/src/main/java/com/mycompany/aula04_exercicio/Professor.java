
package com.mycompany.aula04_exercicio;

public class Professor extends Funcionario{
    private String nome;
    private String especialidade;
    
    
    public void addEspecialidade(String esp){
        this.especialidade = esp;
        System.out.println("Sua nova função é: " + this.especialidade);
    }
}
