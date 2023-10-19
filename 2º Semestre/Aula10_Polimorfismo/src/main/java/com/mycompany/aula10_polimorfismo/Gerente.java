package com.mycompany.aula10_polimorfismo;

public class Gerente extends Pessoa{
    
    @Override
    public void aplicarDesconto(double percentual){
        if (percentual < 0){
            System.out.println("Desconto negativo nao funciona");
        }else if (percentual <= 10.0){
            System.out.println("Aplicando desconto"+percentual+"%");
        }else{
            System.out.println("Desconto não permitido");
        }
    }
}
