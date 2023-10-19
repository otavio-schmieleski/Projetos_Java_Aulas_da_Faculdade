package com.mycompany.aula10_polimorfismo;

public class Vendedor extends Pessoa {
    
    @Override
    public void aplicarDesconto(double percentual){
        if (percentual < 0){
            System.out.println("Desconto negativo nao funciona");
        }else if (percentual <= 5.0){
            System.out.println("Aplicando desconto"+percentual+"%");
        }else if (percentual <= 10.0){
            System.out.println("Voce nao pode, talvez o gerente possa...");
        }else{
            System.out.println("Desconto não permitido");
        }
    }
}
