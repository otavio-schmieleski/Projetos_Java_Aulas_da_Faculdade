package com.mycompany.aula11_exemplo01;

import java.util.Scanner;

public class Aula11_Exemplo01 {

    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int i = 1;
        //EXEMPLO 01 ENQUANTO FAÇA 
//        while(i <= 5){
//            System.out.println("digite um numero");
//            int numero = ms.nextInt();
//            System.out.println(numero+" X 3 = " + numero*3);
//            i++;
//        }
//        //EXEMPLO 02 ATE_SEJA_EFETUE TESTE FALSO
//        while(!(i > 5)){
//            System.out.println("digite um numero");
//            int numero = ms.nextInt();
//            System.out.println(numero+" X 3 = " + numero*3);
//            i++;
//        }
        
          //EXEMPLO 03 REPITA ATE QUE 
//        i = 1;
//        int numero;
//        do{
//            System.out.println("informe o primeiro numero");
//            numero = ms.nextInt();
//            System.out.println(numero+" X 3 = " + numero*3);
//            i++;
//        }while(i <=5); // ate que esta while seja verdadeiro ele executa o codigo de cima
//        
        //EXEMPLO 04 EXECUTE ENQUANTO
//          i = 1;
//        int numero;
//        do{
//            System.out.println("informe o "+i+"º numero");
//            numero = ms.nextInt();
//            System.out.println(numero+" X 3 = " + numero*3);
//            i++;
//        }while(!(i > 5)); //EXECUTE ATE QUE ESTA AFIRMAÇÃO SEJA FALSA

        
        // será executado ate que entre no if e o break para de executar o programa
//        i = 1;
//        int numero;
//        do{
//            System.out.println("informe o "+i+"º numero");
//            numero = ms.nextInt();
//            System.out.println(numero+" X 3 = " + numero*3);
//            if(i >= 5){// esta condição verefica se o i for maior ou igual a 5 ele para de executar o programa
//                break;//por conta do break
//            }
//            i++;
//        }while(true); 

          //USANDO FOR DECLARAMOS O J, FAZEMOS A COMPARAÇÃO, E SOMAMOS PARA NÃO FAZER LOOP, E EXECUTA UM CODIGO, LACO INDONCIONAL
//          for(int j = 1; j <= 10; j++){
//              System.out.println("contador: "+ j);
//          }  
//             

//           int cont = 1;
//           int fat = 1;
//           while(cont <= 5){
//              fat = fat * cont;
//              cont++;
//            }
//            System.out.println("o fatorial de 5! é " + fat);
//              int cont = 1;
//              int fat = 1;
//              while(!(cont > 5)){
//              fat = fat * cont;
//              cont++;
//            }
//            System.out.println("o fatorial de 5! é " + fat);

//              int cont = 1;
//              int fat = 1;
//              do {
//                  fat = fat * cont;
//                  cont++;
//              } while(cont <= 5);
//              System.out.println("o fatorial de 5! é " + fat);

//                 int cont = 1;
//                 int fat = 1;
//                 do {
//                  fat = fat * cont;
//                  cont++;
//                 } while(!(cont > 5));
//                 System.out.println("o fatorial de 5! é " + fat);

//                  int cont = 1;
//                  int fat = 1;
//                  do {
//                  fat = fat * cont;
//                  cont++;
//                  if (cont > 5){
//                      break;
//                  }
//                  } while(cont <= 5);
//                  System.out.println("o fatorial de 5! é " + fat);

//                    for (int j = 5; j <= 5; j++){
//                        
//                         int fat = j * 4*3*2*1;
//                         System.out.println("o fatorial de 5! é "+ fat);
//                    }

                    int cont = 1;
                    int fat;
                    int numero;
                    System.out.println("informe a opção desejada:Opção numero 1 deseja fatuar algum numero, opção numero 2 não faturar nenhum numero");
                    numero = ms.nextInt();
                    do{
                        if (numero != 1){
                            break;
                        }
                        fat =1;
                        fat = fat * cont;
                        cont++;
                        System.out.println(fat);
                        
                    }while(numero >= 0 );
                    
         
    }
        
}

