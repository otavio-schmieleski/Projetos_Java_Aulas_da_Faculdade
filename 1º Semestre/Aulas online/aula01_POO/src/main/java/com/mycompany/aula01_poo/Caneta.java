
package com.mycompany.aula01_poo;

public class Caneta {
   public String modelo;
   public String cor;
   public float ponta;
   protected int carga;
   protected boolean tampada;
    void status(){
        System.out.println("criado com sucesso a caneta do modelo: "+ this.modelo);
        System.out.println("cor: " + this.cor);
        System.out.println("ponta:" + this.ponta);
        System.out.println("ela esta tampada: " + this.tampada);
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO, a caneta está tampada não a como rabiscar!!!!!");
        }else{
            System.out.println("estou rabiscando!!!!");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
}
