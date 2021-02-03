/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modulo_04;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[10];
        int arrayX[] = new int[10];
        int num, aux,i,j;
      
        for (i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Ingrese un número: ");
            array[i] = sc.nextInt();
        }

        for (j = 0; j < 10; j++) {
            for (i = 0; i < 9; i++) {
                if (array[i] > array[i + 1]) {
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                }
            }
        }
        
        for ( i = 0; i < array.length; i++) {
            System.out.println("Mostrar:" + array[i]);
        }

    }

}
