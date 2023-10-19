package com.mycompany.aula_7_exercicio;
import java.util.Scanner;
public class Aula_7_exercicio {

    public static void main(String[] args) {
       Scanner meuScanner = new Scanner(System.in);
        
        int a, b, c, d, e;
        
        System.out.println("Vagas utilizadas = 1, vagas disponíveis = 0");
        
        System.out.println("Vaga A:");
        a = meuScanner.nextInt();
        
        System.out.println("Vaga B:");
        b = meuScanner.nextInt();
        
        System.out.println("Vaga C:");
        c = meuScanner.nextInt();
        
        System.out.println("Vaga D:");
        d = meuScanner.nextInt();
        
        System.out.println("Vaga E:");
        e = meuScanner.nextInt();
        
        int resultado = 0;
        
        if(a == 1){
            System.out.println("Estacionado com sucesso");
            resultado = a+1;
        }else{
            System.out.println("Vaga Ocupada!");
        }
        
        if(b == 1){
            System.out.println("Estacionado com sucesso");
            resultado = b+1;
        }else{
            System.out.println("Vaga Ocupada!");
        }
        
        if(c == 1){
            System.out.println("Estacionado com sucesso");
            resultado = c+1;
        }else{
            System.out.println("Vaga Ocupada!");
        }
        
        if(d == 1){
            System.out.println("Estacionado com sucesso");
            resultado = d+1;
        }else{
            System.out.println("Vaga Ocupada!");
        }
        
        if(e == 1){
            System.out.println("Estacionado com sucesso");
            resultado = e+1;
        }else{
            System.out.println("Vaga Ocupada!");
        }
        
        System.out.println("Número de vagas utilizadas: "+resultado);
        System.out.println("Número de vagas disponíveis: "+(5 - resultado));
        
    }
}
