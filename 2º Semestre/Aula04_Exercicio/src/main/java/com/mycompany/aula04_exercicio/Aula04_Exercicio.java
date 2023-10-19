package com.mycompany.aula04_exercicio;

public class Aula04_Exercicio {

    public static void main(String[] args) {
        Zelador zl = new Zelador();
        Professor p1 = new Professor();
        Aluno al = new Aluno();
        
        zl.calcularIdade(2005);
        zl.mudarFuncao("dev");
        zl.receberAumento(5000);
        
        p1.calcularIdade(2006);
        p1.addEspecialidade("dev-junior");
        p1.receberAumento(2000);
        
        al.calcularIdade(2000);
        al.curso("sistema de informação");
        al.cancelar_matricula(true);
        
        
    }
}
