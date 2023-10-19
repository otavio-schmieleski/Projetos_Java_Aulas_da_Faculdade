package com.mycompany.aula02_class_carro;
public class Boleto {
    private double valorBoleto;
    private double valorPago;
    private boolean vencido;

    public Boleto(){
        vencido = false;
        valorBoleto = 500;
        valorPago = 0;
    }
    
    
    
    //metodo contrutor
    public Boleto(double valorBoleto, double valorPago, boolean vencido){
        this.valorBoleto = valorBoleto;
        this.valorPago = valorPago;
        this.vencido = vencido;
    }
    
    
    //get coloca o valor que vai retornar a frente
    public double getValorBoleto(){
        return this.valorBoleto;
    }
    
    public void setValorBoleto(double valorBoleto){
        this.valorBoleto = valorBoleto;
    }
    
    public double getValorPago(){
        return this.valorPago;
    }
    
    public void setValorPago(double ValorPago){
        this.valorPago = ValorPago;
    }
    
    public boolean getVencido(){
        return this.vencido;
    }
    
    public void setVencido(boolean Vencido){
        this.vencido = Vencido;
    }
    
    public void Pagar(double valor){
        if ((this.valorBoleto > 0) && (valor <= this.valorBoleto)){
            this.valorBoleto -= valor;
        }else{
            System.out.println("Informe um valor valido");
        }
    }
    
    public void ImrpimirBoleto(){
        System.out.println("************");
        System.out.println("Valor do boleto: "+this.getValorBoleto());
        System.out.println("Valor pago: "+this.getValorPago());
        System.out.println("Vencido: "+this.getVencido());
        System.out.println("************");
    }
    
}
