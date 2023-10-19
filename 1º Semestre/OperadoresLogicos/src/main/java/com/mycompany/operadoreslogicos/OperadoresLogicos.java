
package com.mycompany.operadoreslogicos;

import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {
        // USANDO OPERADOR LÓGICO && QUE AS DUAS PARTES TEM QUE SER VERDADEIRAS
        Scanner ms = new Scanner(System.in);
        System.out.println("digite um valor");
        int valor = ms.nextInt();
       
        if ((valor >= 20) && (valor <= 90)){
            System.out.println("dentro da faixa");
        }else{
            System.out.println("fora da faixa");
        }
        
        
        //USANDO OPERADOR OU || PARA COMPARAR SE FORM UM OU OUTRO VERDADEIRO
        Scanner ms2 = new Scanner(System.in);
        String sexo;
        System.out.println("digite seu sexo: F(sexo femenino), M(sexo masculino)");
        sexo = ms2.nextLine();
        if((sexo.equals("M"))||(sexo.equals("F"))){
            System.out.println("seu sexo foi válidado");
        }else{
            System.out.println("seu sexo é inválido");
        }
        
        
        //USADO O OPEARADOR LOGICO ^ (DIJUNÇÃO EXCLUSIVA) QUE CONFERE SE UMA E APENAS UMA VARIAVEL FOR VERDADEIRA A CONDIÇÃO É VERDADEIRA
        Scanner ms3 = new Scanner(System.in);
        String sexo1,sexo2;
        System.out.println("informe sexo primeira pessoa");
        sexo1 = ms3.nextLine();
        System.out.println("informe o sexo da segunda pessoa");
        sexo2 = ms3.nextLine();
        if((sexo1.equals("M")^(sexo2.equals("M")))){
            System.out.println("formou um par para a quadrilha");
        }else{
            System.out.println("nao formou par da quadrilha");
        }
        
        // ESTAMOS NEGANDO O IF COM OPERADOR DE NEGAÇÃO !, SE FOR VERDADEIRO A VEREFICAÇÃO COM A NEGAÇÃO ELE É VERDADEIRO
        Scanner ms4 = new Scanner(System.in);
        int idade;
        System.out.println("digite sua idade");
        idade = ms4.nextInt();
        if(!(idade <= 18)){
            System.out.println("é maior de idade");
        }else{
            System.out.println("não é maior de idade");
        }
        
        // OPERADOR USADO % PARA FAZER A DIVISÃO DO NÚMERO E OBTER O RESULTADO DA SOBRA DA DIVISÃO, DEPOIS COMPARAMOS COM O VALOR 0 PARA VER SE É DIVISIVEL
        Scanner ms5 = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero = ms5.nextInt();
        if (((numero % 4) == 0 )&&((numero % 5)== 0)){
            System.out.println("divisivel por 4");
        }else{
            System.out.println("divisuvel por 4 e 5");
        }
        
        
        
        
          
    }
    
}
