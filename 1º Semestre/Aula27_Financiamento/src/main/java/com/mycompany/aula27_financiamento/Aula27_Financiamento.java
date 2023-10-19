package com.mycompany.aula27_financiamento;

public class Aula27_Financiamento {

    public static void main(String[] args) {
        double tabela [][] = new double [120][3];
        double valorImovel = 221000;
        double valorDividido = valorImovel / 120;
        double valorFinanciado = valorImovel * 0.9;
        double valorFinanciadoDividido = valorFinanciado / 120;
        double soma1 = 0, soma2 =0 , soma3 = 0;
        for (int i = 0; i < tabela.length; i++) {
          double juros = 0;
          
          // deve ser 90% do valor do imovel dividido pelo numero de parcelas e acrescido de um juro de 2,5% ao mes nos primeiros 3 anos,
          //1,75% ao mes do terceiro ao quinto e de 1,2% ao mes ate o final das parcelas
          if(i < 36){
              // calculo dos 2.5%
              juros = valorFinanciado * 0.025;
              
          }else if( (i > 36 )&& ( i < 60) ){
              // calculo do 1.75%
              juros = valorFinanciado * 0.0175;
              
          }else{
              // calculo do 1.2%
              juros = valorFinanciado * 0.12;
          }
          
          valorFinanciado -= valorFinanciadoDividido;
          // valor com juros
          tabela[i][0] = valorFinanciadoDividido + juros;
          
          // valor total do imovel dividido pelas parcelas
          tabela[i][1] = valorDividido;
          
          // diferenca entre a coluna 1 e 2  
          tabela[i][2] = tabela[i][0] - tabela[i][1];
          
          soma1 += tabela[i][0];
          soma2 += tabela[i][1];
          soma3 += tabela[i][2];
        }
        
        
        for (int i = 0; i < tabela.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + tabela[i][j]);
            }
            System.out.println(" ");
        }
        
        System.out.println("soma 1: " + soma1);
        System.out.println("soma2: " + soma2);
        System.out.println("soma3 " + soma3);
        
        if(soma3 >= 0 ){
            System.out.println("Este financiamento nao e valido");
        }else{
            System.out.println("Este financiamento e viavel");
        }
    }
}
