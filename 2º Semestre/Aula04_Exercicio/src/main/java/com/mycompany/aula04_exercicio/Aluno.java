package com.mycompany.aula04_exercicio;

// o extends serve para herdar da outra class
public class Aluno extends Pessoa{
    private String nome;
    private String curso;
    private boolean matricula = false;
    
    public void curso(String n_curso){
        this.curso = n_curso;
        System.out.println("seu curso é: " + this.curso);
    }
    public void cancelar_matricula(boolean matri){
        this.matricula = matri;
        System.out.println("sua matricula foi cancelada: " + this.matricula);
    }
    
}
