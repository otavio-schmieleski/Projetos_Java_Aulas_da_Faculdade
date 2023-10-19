
package com.mycompany.aula05_abstrato;

public abstract class Recebimento {
    private double valor;
    private String data;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
