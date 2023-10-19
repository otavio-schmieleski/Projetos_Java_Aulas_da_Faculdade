package com.mycompany.projeto_inss;

import java.util.Scanner;

public class Projeto_Inss {

    public static void main(String[] args) {
        Scanner ms = new Scanner (System.in);
        Scanner ms1 = new Scanner (System.in);
        String nome,cpf,email,telefone,data_de_nascimento;
        double salario = 0,irpf = 0,inss = 0, imposto = 0, impostoTotal = 0;
        System.out.println("informe seu nome");
        nome = ms.nextLine();
        System.out.println("informe seu cpf");
        cpf = ms.nextLine();
        System.out.println("informe seu e-mail");
        email = ms.nextLine();
        System.out.println("informe sua data de nascimento");
        data_de_nascimento = ms.nextLine();
        System.out.println("informe seu telefone");
        telefone = ms.nextLine();
        
        for(int i=1;i <= 12;i++){
            System.out.println("informe seu salário");
             salario = ms1.nextDouble();
            if(salario <= 1302.00){
                inss = salario * 0.075;
            }else if((salario >= 1302.01) && (salario <= 2571.29)){
                inss = salario*0.09;
            }else if(salario >= 2571.30 && salario <= 3856.94){
                inss = salario*0.12;
            }else if(salario >= 3856.95 && salario <= 7507.49){
                inss = salario * 0.14;
            }
            
            if(salario <= 1903.98){
                System.out.println("insento de imposto de renda");
            }else if(salario >= 1903.99 && salario <= 2826.65){
                irpf = salario * 0.075;
            }else if(salario >= 2826.66 && salario <= 3751.05){
                irpf = salario * 0.15;
            }else if(salario >= 3751.06 && salario <= 4664.68){
                irpf = salario * 0.225;
            }else if(salario >= 4664.68){
                irpf = salario * 0.275;
            }
            
            if(i == 1){
                System.out.println("Janeiro");
                System.out.println("Inss de Janeiro " + inss);
                System.out.println("Imposto de renda de Janeiro " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 2){
                System.out.println("Fevereiro");
                System.out.println("Inss de fevereiro " + inss);
                System.out.println("Imposto de renda de fevereiro " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 3){
                System.out.println("Março");
                System.out.println("Inss de Março " + inss);
                System.out.println("Imposto de renda de Março " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 4){
                System.out.println("Abril");
                System.out.println("Inss de Abril " + inss);
                System.out.println("Imposto de renda de Abril " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 5){
                System.out.println("Maio");
                System.out.println("Inss de Maio " + inss);
                System.out.println("Imposto de renda de Maio " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 6){
                System.out.println("Junho");
                System.out.println("Inss de Junho " + inss);
                System.out.println("Imposto de renda de Junho " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 7){
                System.out.println("Julho");
                System.out.println("Inss de Julho " + inss);
                System.out.println("Imposto de renda de Julho " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 8){
                System.out.println("Agosto");
                System.out.println("Inss de Agosto " + inss);
                System.out.println("Imposto de renda de Agosto " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 9){
                System.out.println("Setembro");
                System.out.println("Inss de Setembro " + inss);
                System.out.println("Imposto de renda de Setembro " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 10){
                System.out.println("Outubro");
                System.out.println("Inss de Outubro " + inss);
                System.out.println("Imposto de renda de Outubro " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 11){
                System.out.println("Novembro");
                System.out.println("Inss de Novembro " + inss);
                System.out.println("Imposto de renda de Novembro " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }else if(i == 12){
                System.out.println("Dezembro");
                System.out.println("Inss de Dezembro " + inss);
                System.out.println("Imposto de renda de Dezembro " + irpf);
                imposto = inss + irpf;
                impostoTotal = impostoTotal + imposto;
            }
        }
        System.out.println("valor total do impostos pago no ano é de: " + impostoTotal);
    }
}
