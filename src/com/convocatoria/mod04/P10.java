/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLASE02_MOD_04;

import java.util.Scanner;

/**
 *
 * @author INFORMATICA
 */
public class P10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaraciones
        Scanner sc = new Scanner(System.in);
        double importe, capital,newimporte;
        int meses, nivel, sw = 0;
        Double riesgo[] = {1.5, 2.8, 4.0, 6.0};
        double prestamo[][];
        
        //datos
        System.out.println("Importe Prestamo");
        importe = sc.nextDouble();
        do {
            sw = 0;
            System.out.println("Tiempo Prestamo");
            meses = sc.nextInt();

            if (meses == 6 || meses == 12 || meses == 18 || meses == 24) {
                sw = 1;
            }
        } while (sw == 0);

        do {
            sw = 0;
            System.out.println("Nivel de Riesgo[1,2,3,4]");
            nivel = sc.nextInt();
            if (nivel == 1 || nivel == 2 || nivel == 3 || nivel == 4) {
                sw = 1;
            }
        } while (sw == 0);

         prestamo = new double[24][5];
         newimporte = importe;
        capital = importe / meses;
        for (int x = 0; x < meses; x++) {
            prestamo[x][0] = x;
            prestamo[x][1] = newimporte ;
            prestamo[x][2] = capital;
            prestamo[x][3] = (newimporte * ((riesgo[nivel - 1] + 100) / 100)) - newimporte ;
            prestamo[x][4] = prestamo[x][3] + capital;
            newimporte =prestamo[x][1]- capital;
        }

        for (int x = 0; x < meses; x++) {
            System.out.println(prestamo[x][0] + "-" + prestamo[x][1] + "-" + prestamo[x][2] + "-" + prestamo[x][3] + "-" + prestamo[x][4]);
        }

    }

}
