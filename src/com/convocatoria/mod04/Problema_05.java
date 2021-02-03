/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_04;

/**
 *
 * @author Usuario
 */
public class Problema_05 {
    public static void main(String[] args) {
        int array[] = new int[15];
        int valorEntero, i, maxRep,numRep, moda = 0, j;

        System.out.println("Ingresar 15 valores enteros entre 20 y 30: ");
        
        maxRep=-1;
        for (i = 0; i <= 14; i++) {
            
            
            valorEntero = (int) Math.floor(Math.random() * (30 - 20 + 1) + 20);
            array[i] = valorEntero;
            numRep=0;
            for (j = 0; j <= 14; j++) {
                if (array[i] == array[j]) {
                    numRep++;
                }
            }
            if (numRep > maxRep) {
                moda = array[i];
                maxRep = numRep;
            }

        }

        for (i = 0; i <= 14; i++) {
            System.out.println((i + 1) + ". Mostrando los valores:" + array[i]);
        }

        System.out.println("La moda es:" + moda);
        System.out.println("Número de veces que se repite:" +maxRep);
    }
}
