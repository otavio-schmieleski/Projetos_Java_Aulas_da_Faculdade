
package com.mycompany.biblioteca;

public class Emprestimo extends Livro{
    private boolean emprestado = false;
    
    public void EmprestarLivro(){
        this.emprestado = true;
        if (this.emprestado == true){
            System.out.println("Livro emprestado!! " + this.getNomeLivro());
        }
    }
    
    public void DevolverLivro(){
        this.emprestado = false;
        if (this.emprestado == false){
            System.out.println("Livro disponivél!!" + this.getNomeLivro());
        }
    }
    
    
}
