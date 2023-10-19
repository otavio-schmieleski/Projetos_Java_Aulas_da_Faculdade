
package com.mycompany.aula03_exercicio02;

public class Aula03_Exercicio02 {

    public static void main(String[] args) {
      Pessoa p1 = new Pessoa();
      p1.AumentarSalario(-1);
      p1.AumentarSalario(100);
      p1.setNome("otavio");
      p1.setCpf("04852312462");
      p1.ImprimirFichaFuncionario();
      
      Pessoa p2 = new Pessoa();
      p2.setNome("otavio");
      System.out.println(Pessoa.contador);
    }
}
