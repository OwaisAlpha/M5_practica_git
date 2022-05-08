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
public class ex_3 {
    public static void main(String[] args) {
        Random rnd =new Random();
        Fraccion taula[]=new Fraccion[10]; 
        
        for (int i = 0; i < taula.length; i++) {
            Fraccion obj=new Fraccion(); // obj es objeto de clase Fraccion .
            obj.numerador=rnd.nextInt(10)+1;
            obj.denomerador=rnd.nextInt(10)+1;
            taula[i]=obj;
        }
        for (int i = 0; i < taula.length; i++) {
            System.out.println("el Fraccion de Posicion "+ (i+1) +": "+taula[i].numerador+"/"+taula[i].denomerador);
        }
    }
    
}
