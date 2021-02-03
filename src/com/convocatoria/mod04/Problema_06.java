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
public class Problema_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[4][3];
        int matrizX[][] = new int[5][4];
        int valorEntero = 0,sumaT = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("");
            for (int j = 0; j < 3; j++) {
                valorEntero = (int) Math.floor(Math.random() * (30 - 10 + 1) + 10);
                matriz[i][j] = valorEntero;
                System.out.print(matriz[i][j] + "\t");
            }
        }
        

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 3; j++) {
                sumaT = valorEntero + matrizX[j][i];
                
            }
            System.out.println("Columna "+(i+1)+"= "+sumaT);
            sumaT=0;
        }
        
        
     
       
       
    }

}
