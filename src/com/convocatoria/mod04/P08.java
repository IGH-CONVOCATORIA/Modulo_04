/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASE02_MOD_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author INFORMATICA
 */
public class P08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaraciones
        Scanner sc = new Scanner(System.in);

        int arreglo1[] = new int[10];
        double aprobados = 0, desaprobados = 0, mayor = 0, menor = 21, promedio = 0, suma=0;
       int sw=0;

        //datos
        for (int x = 0; x < 10; x++) {
            sw=0;
            do {
                System.out.print("Igresar Nota [" + x + "] : ");
                arreglo1[x] = sc.nextInt();
                if (arreglo1[x] >= 0 && arreglo1[x] <= 20)
                    sw=1;
            } while (sw==0);
        }

        //proceso
        for (int i : arreglo1) {
            if (i > 10.5) 
                aprobados++;
            if (i <= 10) 
                desaprobados++;
            if (i>mayor)
                mayor=i;
            if (i<menor)
                menor=i;
           suma = suma + i;
        }
        promedio = suma / 10;
        
        
        //Reporte
        System.out.println("Aprobado:"+aprobados);
        System.out.println("Desaprovado:"+desaprobados);
        System.out.println("Mayor:"+mayor);
        System.out.println("Menor:"+menor);
        System.out.println("Promedio :"+promedio);
    }

}
