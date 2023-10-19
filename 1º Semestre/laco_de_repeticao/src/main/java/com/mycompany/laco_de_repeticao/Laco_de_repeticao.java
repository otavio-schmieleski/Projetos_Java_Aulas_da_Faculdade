
package com.mycompany.laco_de_repeticao;

public class Laco_de_repeticao {

    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        System.out.println("5");
        System.out.println("6");
        System.out.println("7");
        System.out.println("8");
        System.out.println("9");
        System.out.println("10");
        String nome = " ";
        nome = "otavio";
        int i = 1;
        while (i <= 25) {
            nome = nome + " ";
            i = i +1;
                       
        }
        nome = nome + "marcelo";
        System.out.println(nome);
        
        i = 1;
        int j =1;
        while(i<=3){
            while(j <=5){
                if((j % 2)== 0){
                    System.out.print("|");
                }else{
                    System.out.print("_");
                }
                j++;
            }
            System.out.print("\n");
            j = 1;
            i++;
        
        }
        
        int m = 1;
        int k = 1;
        while(k <= 8){
            while(m <= 17){
                if((m%2)==0){
                    System.out.print("_");
                    
                }else{
                    System.out.println(" ");
                 
                        if((m % 2)==0){
                            System.out.print("_");
                        }else{
                            System.out.print("|");
                        }
                        m++;
                    

                        System.out.print("\n");
                        m = 1;
                        k++;
                    }  
            }
        }
        
        int n = 1;
        do {
            System.out.println("infomr a jogada nº" + n + ":");
            n++;
        }while(n <= 9);
    }  
}
