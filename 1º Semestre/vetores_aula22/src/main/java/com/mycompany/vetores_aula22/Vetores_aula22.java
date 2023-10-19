package com.mycompany.vetores_aula22;

public class Vetores_aula22 {

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0; i <= 1; i++){
            for(int j = 0; j<= 59; j++){
                Thread.sleep(1000);// serve como delay para deixar um tempo entre a execução do numero
                System.out.printf("%02d:%02d\n",i,j);
                if((i == 1) && (j == 30)){
                    break;
                }
            }
        }
    }
}
