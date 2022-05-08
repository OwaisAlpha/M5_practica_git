/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe2_uf1_m3;

import java.util.Random;

/**
 *
 * @author mowais.daw1r
 */
public class ex_1 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int limit = 30000;
        int cara1;
        int cara2 ;
        
        int repeated[] = new int[11];
        int suma ;

        for (int i = 0; i < limit; i++) {

            cara1 = rnd.nextInt(6) + 1;
            cara2 = rnd.nextInt(6) + 1;
            suma = cara1 + cara2;

            //añadiendo repeticioines
            for (int j = 2; j < 13; j++) {
                if (suma == j) {
                    repeated[j-2]++;
                }
            }
        }
        System.out.println("Details of repetitions:");

        for (int i = 2; i < 13; i++) {
            System.out.print(i + "\t");
        }
        System.out.println("");
        for (int i = 0; i < repeated.length; i++) {
            System.out.print(repeated[i] + "\t");
        }

    }
}
