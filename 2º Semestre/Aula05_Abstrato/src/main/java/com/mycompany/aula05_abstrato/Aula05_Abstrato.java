package com.mycompany.aula05_abstrato;

import java.util.Scanner;

public class Aula05_Abstrato extends Recebimento{

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        System.out.println("Informe o valor da venda");
        double valorVenda = ms.nextDouble();
        
        while (true){
            Scanner ms1 = new Scanner(System.in);
            System.out.println("Infome qual a forma de Pagamento? \n 1- dinheiro \n 2- pix \n 3- cartao");
            int formaPagamento = ms1.nextInt();
            
            System.out.println("Informe o valor do Pagamento");
            double valorPagamento = ms.nextDouble();
            
            if (formaPagamento == 1){
                Dinheiro din = new Dinheiro();
                din.setValor(valorPagamento);
                din.setData("26\09\2023");
            }else if(formaPagamento == 2){
                Pix p = new Pix();
                p.setValor(valorPagamento);
                p.setData("26\09\2023");
                p.setCodigoAutorizacao("123456");
            }else if(formaPagamento == 3){
                Cartao ct = new Cartao();
                ct.setValor(valorPagamento);
                ct.setData("26\09\2023");
                
            }else{
                System.out.println("Voce nao selecionou nenhum metodo de pagamento");
            }
        }
        
    }
}
