
package com.mycompany.trabalho_ex07;

import java.util.Random;
import java.util.Scanner;

public class Trabalho_Ex07 {

    public static void main(String[] args) {
int[] jogo = new int[10];
        
        for (int i = 1; i < 10; i++) {
            jogo[1] = i;
            for (int j = 1; j < 10; j++) {
                jogo[2] = j;
                for (int k = 1; k < 10; k++) {
                    jogo[3] = k;
                    for (int l = 1; l < 10; l++) {
                        jogo[4] = l;
                        for (int m = 1; m < 10; m++) {
                            jogo[5] = m;
                            for (int n = 1; n < 10; n++) {
                                jogo[6] = n;
                                for (int o = 1; o < 10; o++) {
                                    jogo[7] = o;
                                    for (int p = 1; p < 10; p++) {
                                        jogo[8] = p;
                                        for (int q = 1; q < 10; q++) {
                                           jogo[9] = q;
                                            if (i != j && i != k && i != l && i != m && i != n && i != o && i != p && i != q && j != k && j != l && j != m && j != n && j != o && j != p && j != q &&
                                                k != l && k != m && k != n && k != o && k != p && k != q && l != m && l != n && l != o && l != p && l != q && m != n && m != o && m != p && m != q &&
                                                n != o && n != p && n != q && o != p && o != q && p != q) {
                                           if(i == 5 && j == 3 && m == 7){
                                               System.out.println(i+" "+j+" "+k+" "+l+" "+m+" "+n+" "+o+" "+p+" "+q);
                                           }
                                            
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        
    }
}
}
