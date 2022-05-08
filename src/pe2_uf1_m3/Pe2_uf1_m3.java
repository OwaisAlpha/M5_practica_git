/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe2_uf1_m3;

/**
 *
 * @author mowais.daw1r
 */
public class Pe2_uf1_m3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ex_3 
        System.out.println("EJERCICIO 3:");
        String frase = "no es tracta d'aconseguir mes coses per ser feliç sino de gaudir de les que tenim";
        String paraula = "enraonar";
//      String taula[]=paraula.split("");
        int count = 0;

        for (int i = 0; i < paraula.length(); i++) {
            boolean repeated = false;
            for (int k = 0; k < i; k++) {
               if (paraula.charAt(i) == paraula.charAt(k)) {
                    repeated = true;

                }
            }
            if (repeated == false) {
                for (int j = 0; j < frase.length(); j++) {

                    if (paraula.charAt(i) == frase.charAt(j)) {
                        count++;
                    }
                }
                System.out.println("Le palabra " + paraula.charAt(i) + " se ha repetido " + count + " vezes in el frase;");
                count = 0;
            } 
            
            
        }

    }

}
