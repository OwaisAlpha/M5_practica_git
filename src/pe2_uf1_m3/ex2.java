/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe2_uf1_m3;

import java.util.Scanner;

/**
 *
 * @author mowais.daw1r
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("por favor introduces un texto.");
        //hola que tal? ["Hola","que","tal"]
        String frase=lector.nextLine();
        String taula[]=frase.split(" ");
        int count=0;
        
        for (int i = 0; i < taula.length; i++) {
            if(taula[i].charAt(0)==taula[i].charAt(taula[i].length()-1)){
                count++;
            }
                
        }
        System.out.println("de Frase \n\""+frase+"\"\n "+count+" Palabras empiezan y acaban por mismo character.");
    }
    
}
