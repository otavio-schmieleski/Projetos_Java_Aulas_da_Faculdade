package com.mycompany.trabalho_ex06;

public class Trabalho_Ex06 {

    
    public static void main(String[] args) {
        String [] senhaDescripto = new String[10];
        String [] senhaCripto = new String[10];
        String []letras = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m"};
        String[] letras1 = new String[]{"n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        for (int i = 4; i < 10; i++) {
            senhaCripto[i] = letras[i-1];
            for (int j = 0; j < 5; j++) {
                senhaCripto[j] = letras[j+1];
            }
        }
        for (int i = 4; i < 10; i++) {
            senhaDescripto[i] = letras1[i-1];
            for (int j = 0; j < 5; j++) {
                senhaDescripto[j] = letras1[j+1];
            }
        }
        System.out.println("\n");
        System.out.print("senha Criptografada com a lista letras: " );
        for(String nome : senhaCripto){
            System.out.print(nome);
        }
        System.out.println("\n");
        System.out.print("senha Descriptografafa com a lista letrsa1: ");
        for(String nome1 : senhaDescripto){
            System.out.print(nome1);
        }
    }
    
}
