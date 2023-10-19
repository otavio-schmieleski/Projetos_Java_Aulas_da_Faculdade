
package com.mycompany.biblioteca;


public class Exercicio_blibioteca extends Emprestimo{

    public static void main(String[] args) {
        Aluno al = new Aluno();
        Livro l = new Livro();
        Emprestimo em = new Emprestimo();
        
        al.setNome("otavio");
        l.setNomeLivro("diario do banana");
        em.EmprestarLivro();
        
    }
}
