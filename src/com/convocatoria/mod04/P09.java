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
public class P09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //declaraciones
        Scanner sc = new Scanner(System.in);

        String trabajadores[] = {"Pedro", "Karla", "Gustavo", "Danela", "Leonor"};
        int horas[][] = new int[5][3];
        int pagototal=0;
        //datos
        for (int x = 0; x < 5; x++) {
            System.out.print(trabajadores[x] + ":");
            System.out.print("Horas:");
            horas[x][0] = sc.nextInt();
            System.out.print("Pago x Hora:");
            horas[x][1] = sc.nextInt();
            
        }

        //proceso
        for (int x = 0; x < 5; x++) 
        {
            horas[x][2] = horas[x][0] * horas[x][1];
            pagototal +=horas[x][2];
        }
        
        for (int x = 0; x < 5; x++) 
            System.out.println(trabajadores[x] + ":"+horas[x][0]+"    "+horas[x][1]+"    "+horas[x][2]);
        
        System.out.println("Total Pago:"+pagototal);
        
        
    }

}
